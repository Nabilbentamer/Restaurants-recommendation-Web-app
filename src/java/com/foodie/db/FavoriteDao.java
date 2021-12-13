package com.foodie.db;

import com.foodie.beans.Favorite_restaurant;
import com.foodie.beans.Rating;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FavoriteDao {
    
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
    
    public String insert(Favorite_restaurant favorite) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "insert into favorite_restaurant(id_user,id_restau) values(?,?)";
        
        String result= "data entered succefully";
        
        try{
            PreparedStatement ps= conn.prepareStatement(Sql);
            
            ps.setInt(1,favorite.getId_user());
            ps.setInt(2,favorite.getId_restau());
            ps.execute();
    
        }
        catch(Exception e ){
            result="data didn't enter";
        }
        return result;
        
    
    
}
}
