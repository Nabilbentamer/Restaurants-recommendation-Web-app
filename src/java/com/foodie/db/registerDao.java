package com.foodie.db;

import com.foodie.beans.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class registerDao {
    
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
            
        }
        
             
        return member;
    }

}

