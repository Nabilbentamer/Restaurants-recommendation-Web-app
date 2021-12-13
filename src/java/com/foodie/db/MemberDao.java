/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodie.db;

import com.foodie.beans.Member;
import com.foodie.beans.Restaurant;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.imageio.ImageIO;
import javax.servlet.http.Part;
import sun.misc.BASE64Encoder;

/**
 *
 * @author hp
 */
public class MemberDao {
    
    private final String dburl = "jdbc:mysql://localhost:3306/foodie";
    private final String dbuname = "root";
    private final String dbpassword = "";
    private final String dbdriver= "com.mysql.jdbc.Driver";
    
    
    public void LoadDriver(String dbdriver) throws ClassNotFoundException{
        
        getClass().forName(dbdriver);
        

    }
    
    /* this fonction will do the connection with the data base */ 
    public Connection getConnection() throws SQLException{
        
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(dburl,dbuname,dbpassword);
            
            
        }
        catch(SQLException e ){
            System.out.println("something went wrong");
        }
        
        return conn;
        
    }
    
    public String insert(Member member) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "insert into user(name,email,password) values(?,?,?)";
        String result= "data entered succefully";
        try{
            PreparedStatement ps= conn.prepareStatement(Sql);
            
            ps.setString(1,member.getUname());
            ps.setString(2,member.getEmail());
            ps.setString(3,member.getPassword());
            ps.execute();
       
        }
        catch(Exception e ){
            result="data didn't enter";
        }
        return result;
        
    
    
}
    /* This function check if there the user existe in the database and return an object member  */ 
    
    
    
        public List<Member> SelectAllMembers() throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from user";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            ResultSet rst = pst.executeQuery();
            List<Member> members= new ArrayList();
            while(rst.next()){

                int id = rst.getInt("id");
                String name = rst.getString("name");
                String email = rst.getString("email");
                
        
                Member member = new Member();
                member.setEmail(email);
                member.setUname(name);
                member.setId(id);
                members.add(member);
                
    
            }
            
            return members;
            
        
        
    }
    
    public Member checkLogin(String email, String password) throws ClassNotFoundException, SQLException{
        String result;
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String sql = "Select* from user where email=? and password=?";
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setString(1,email);
        ps.setString(2,password);
        
        ResultSet rst = ps.executeQuery();
        Member member=null;
        
        while(rst.next()){
            member= new Member();
            member.setUname(rst.getString("name"));
            member.setPassword(rst.getString("password"));
            member.setEmail(rst.getString("email"));
            member.setId(rst.getInt("id"));
            
        }
        
             
        return member;
    }
    
    public Member SelectMember(int id) throws ClassNotFoundException, SQLException, IOException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String sql = "Select* from user where id=?";
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setInt(1,id);
        
        ResultSet rst = ps.executeQuery();
        Member member=null;
        
        while(rst.next()){
                member= new Member();
            
                String name = rst.getString("name");
                String password = rst.getString("password");
                String email = rst.getString("email");
                int ID = rst.getInt("id");
                Blob blob = rst.getBlob("image");
                InputStream inputStream=null;
                String base64Image=null;
                
                if(blob!=null)
                {
                    inputStream= blob.getBinaryStream();
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int bytesRead = -1;
                 
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);                  
                }
                 
                byte[] imageBytes = outputStream.toByteArray();
                
                 base64Image= Base64.getEncoder().encodeToString(imageBytes);
                 
                inputStream.close();
                outputStream.close(); 
                }
                else{
                    
                    BufferedImage img = ImageIO.read(new File("C:\\Users\\hp\\OneDrive\\Documents\\netbeans\\foodie\\web\\ressources\\images\\default.jpg"));
                    base64Image= imageToBase64String(img,"jpg");
                    
                }
                
                                    
  


            member.setUname(name);
            member.setPassword(password);
            member.setEmail(email);
            member.setId(ID);
            member.setBase64image(base64Image);

            
        }
        
             
        return member;
    }
    

      public static String imageToBase64String(RenderedImage image, String type) {
        String ret = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, type, bos);
            byte[] bytes = bos.toByteArray();
            BASE64Encoder encoder = new BASE64Encoder();
            ret = encoder.encode(bytes);
            ret = ret.replace(System.lineSeparator(), "");
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return ret;
    }
        public void UpdateMember(Member member) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        try{
        String sql = "update user set name=?, email=?, password=? where id = ? ";
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setString(1,member.getUname());
        ps.setString(2,member.getEmail() );
        ps.setString(3,member.getPassword());
        ps.setInt(4,member.getId());
        ps.executeUpdate();
        
        }
        catch(Exception e){
            System.err.println("Got an exception! ");
    
        }
    
    } 
        public void UpdateMember_AllInfo(Member member,InputStream inputStream) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String message = "Update done with success";
        try{
        String sql = "update user set phone=?, city=?, state=?, birthday=?, image=?, gender=? where id = ? ";
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setString(1,member.getPhone());
        ps.setString(2,member.getCity());
        ps.setString(3,member.getState());
        ps.setString(4,member.getBirthday());
        ps.setBlob(5, inputStream);            
        ps.setString(6,member.getGender());
        ps.setInt(7,member.getId());
        
        ps.executeUpdate();
        
        
        }
        catch(Exception e){
            System.err.println("Got an exception! ");
            message="Something is wrong";
    
        }
        System.out.println(message);
    
    }        

        public void DeleteMember(int id) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        try{
        String sql = "delete from user where id = ? ";
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setInt(1,id);
        ps.execute();
        
        }
        catch(Exception e){
            System.err.println("Got an exception! ");
    
        }
    
    }

        public String InsertImage(Part part, InputStream inputStream) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String message=null;
       
                try {
            // constructs SQL statement
            String sql = "INSERT INTO user (name,email,password,image) values (?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Ahmed Zellou");
            statement.setString(2, "yes");
            statement.setString(3, "yyyyyyyy");
             
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                statement.setBlob(4, inputStream);
            }
 
            // sends the statement to the database server
            int row = statement.executeUpdate();
            if (row > 0) {
                message = "File uploaded and saved into database";
            }
        } catch (SQLException ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            // sets the message in request scope
            return message;
             
        }
    
    }        
        
}
