/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodie.db;

import com.foodie.beans.Comment;
import com.foodie.beans.Member;
import com.foodie.beans.Restaurant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 *
 * @author hp
 */
public class CommentDao {
    
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
    
    public String insert(Comment cmnt) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "insert into comment(id_user,id_restau,content) values(?,?,?)";
        
        String result= "data entered succefully";
        
        try{
            PreparedStatement ps= conn.prepareStatement(Sql);
            
            ps.setInt(1,cmnt.getId_user());
            ps.setInt(2,cmnt.getId_restau());
            ps.setString(3,cmnt.getContent());
            ps.execute();
            
            
            
        }
        catch(Exception e ){
            result="data didn't enter";
        }
        return result;
   
}
    
        public String Restaurant_Comment(int restau_id) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "select count(content) from comment where id_restau=?";
        PreparedStatement ps= conn.prepareStatement(Sql);
        ps.setInt(1, restau_id);
       

        
        String sum_comment=null;
        String message = "select is done successfully";
        
        try{
            ResultSet Result= ps.executeQuery();
            Result.next();
            sum_comment= Result.getString(1);
                                    
        }
        catch(Exception e ){
            message="nope";
            System.out.print(e);
        }
        
        return sum_comment;
        
    
    
}

    public String Total_User_Comments(int user_id) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "select count(id_user) from comment where id_user=?";
        PreparedStatement ps= conn.prepareStatement(Sql);
        ps.setInt(1, user_id);
       

        
        String sum_comment=null;
        String message = "select is done successfully";
        
        try{
            ResultSet Result= ps.executeQuery();
            Result.next();
            sum_comment= Result.getString(1);
            System.out.print(sum_comment);
                                    
        }
        catch(SQLException e ){
            message="nope";
            System.out.print(e);
        }
        
        return sum_comment;
    
}
        
   public List<Comment> SelectAllComments() throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from comment";
            PreparedStatement pst = conn.prepareStatement(sql);            
            ResultSet rst = pst.executeQuery();
            
            List<Comment> comment= new ArrayList();
            while(rst.next()){

                String content, title, status, Dt_comment;
                int id, id_user, id_restaurant;
                
                content = rst.getString("content");
                title = rst.getString("title");
                status = rst.getString("status");
                Dt_comment= rst.getString("date");
                id_user = rst.getInt("id_user");
                id_restaurant = rst.getInt("id_restau");
                
                
                                

                Comment comment_inner = new Comment();
                comment_inner.setContent(content);
                comment_inner.setId_restau(id_restaurant);
                comment_inner.setId_user(id_user);
                comment_inner.setTitle(title);
                comment_inner.setDate(Dt_comment);
                comment_inner.setStatus(status);
                

                comment.add(comment_inner);
                

                
                
            }
            
            return comment;
    
    }
   
      public List<Comment> SelectAllComments_By_Restau_Id(int id_restau) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from comment where id_restau=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,id_restau);
            ResultSet rst = pst.executeQuery();
            
            List<Comment> comment= new ArrayList();
            while(rst.next()){

                String content, title, status, Dt_comment;
                int id, id_user, id_restaurant;
                
                content = rst.getString("content");
                title = rst.getString("title");
                status = rst.getString("status");
                Dt_comment= rst.getString("date");
                id_user = rst.getInt("id_user");
                id_restaurant = rst.getInt("id_restau");
                
                
                                

                Comment comment_inner = new Comment();
                comment_inner.setContent(content);
                comment_inner.setId_restau(id_restaurant);
                comment_inner.setId_user(id_user);
                comment_inner.setTitle(title);
                comment_inner.setDate(Dt_comment);
                comment_inner.setStatus(status);
                

                comment.add(comment_inner);
                

                
                
            }
            
            return comment;
            
        
        
    }
   
   
    
    
    
    
}
