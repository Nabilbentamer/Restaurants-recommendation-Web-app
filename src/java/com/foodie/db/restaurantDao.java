/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodie.db;

import com.foodie.beans.Restaurant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class restaurantDao {

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
    
    public Restaurant SelectRestaurant(String location,String price,String good_for,String cuisine) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from restaurant where location=? and price=? and good_for=? and cuisine=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,location);
            pst.setString(2,price);
            pst.setString(3,good_for);
            pst.setString(4,cuisine);
            
            ResultSet rst = pst.executeQuery();
            Restaurant restau=null;
            while(rst.next()){
                restau = new Restaurant();
                restau.setLocation(rst.getString("location"));
                restau.setPrice(rst.getString("price"));
                restau.setCuisine(rst.getString("cuisine"));
                restau.setGood_for(rst.getString("good_for"));
                restau.setId(rst.getInt("id"));
                
                
            }
            
            return restau;
            
        
        
    }
    public List<Restaurant> SelectAllRestaurant(String location,String price,String good_for,String cuisine) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from restaurant where location=? and price=? and good_for=? and cuisine=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,location);
            pst.setString(2,price);
            pst.setString(3,good_for);
            pst.setString(4,cuisine);
            
            ResultSet rst = pst.executeQuery();
            List<Restaurant> restaus= new ArrayList();
            while(rst.next()){

                String locationDb= rst.getString("location");
                String priceDb = rst.getString("price");
                String good_forDb = rst.getString("good_for");
                String cuisineDb = rst.getString("cuisine");
                String nameDb = rst.getString("name");
                String imageDb = rst.getString("image");
                int IdDb = rst.getInt("id");
                                

                        
                Restaurant restau = new Restaurant();
                restau.setLocation(locationDb);
                restau.setPrice(priceDb);
                restau.setCuisine(cuisineDb);
                restau.setGood_for(good_forDb);
                restau.setImage(imageDb);
                restau.setName(nameDb);
                restau.setId(IdDb);
                restaus.add(restau);
                

                
                
            }
            
            return restaus;
            
        
        
    }
    

    public List<Restaurant> SelectAllRestaurantbyLocation(String location) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from restaurant where location=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,location);
            
            ResultSet rst = pst.executeQuery();
            List<Restaurant> restaus= new ArrayList();
            while(rst.next()){

                String locationDb= rst.getString("location");
                String priceDb = rst.getString("price");
                String good_forDb = rst.getString("good_for");
                String cuisineDb = rst.getString("cuisine");
                String nameDb = rst.getString("name");
                String imageDb = rst.getString("image");

                int IdDb = rst.getInt("id");
                        
                Restaurant restau = new Restaurant();
                restau.setLocation(locationDb);
                restau.setPrice(priceDb);
                restau.setCuisine(cuisineDb);
                restau.setGood_for(good_forDb);
                restau.setImage(imageDb);
                restau.setName(nameDb);
       
         restau.setId(IdDb);
                
                
                restaus.add(restau);
                

                
                
            }
            
            return restaus;
            
        
        
    }
    public List<Restaurant> SelectAllRestaurantbyPrice(String Price,String location) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from restaurant where Price=? and location=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,Price);
            pst.setString(2,location);
            
            ResultSet rst = pst.executeQuery();
            List<Restaurant> restaus= new ArrayList();
            while(rst.next()){

                String locationDb= rst.getString("location");
                String priceDb = rst.getString("price");
                String good_forDb = rst.getString("good_for");
                String cuisineDb = rst.getString("cuisine");
                String nameDb = rst.getString("name");
                String imageDb = rst.getString("image");
                         int IdDb = rst.getInt("id");

                        
                Restaurant restau = new Restaurant();
                restau.setLocation(locationDb);
                restau.setPrice(priceDb);
                restau.setCuisine(cuisineDb);
                restau.setGood_for(good_forDb);
                restau.setImage(imageDb);
                restau.setName(nameDb);
       
         restau.setId(IdDb);

                restaus.add(restau);
   
                

                
                
            }
            
            return restaus;
            
        
        
    }
    
        public List<Restaurant> SelectAllRestaurantbyCuisine(String Cuisine,String location) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from restaurant where cuisine=? and location=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,Cuisine);
            pst.setString(2,location);
            
            ResultSet rst = pst.executeQuery();
            List<Restaurant> restaus= new ArrayList();
            while(rst.next()){

                String locationDb= rst.getString("location");
                String priceDb = rst.getString("price");
                String good_forDb = rst.getString("good_for");
                String cuisineDb = rst.getString("cuisine");
                String nameDb = rst.getString("name");
                String imageDb = rst.getString("image");
                          int IdDb = rst.getInt("id");
                        
                Restaurant restau = new Restaurant();
                restau.setLocation(locationDb);
                restau.setPrice(priceDb);
                restau.setCuisine(cuisineDb);
                restau.setGood_for(good_forDb);
                restau.setImage(imageDb);
                restau.setName(nameDb);
       
         restau.setId(IdDb);

                restaus.add(restau);
                

                
                
            }
            
            return restaus;
            
        
        
    }
        
        public List<Restaurant> SelectAllRestaurantbyGood_for(String Good_for,String location) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from restaurant where good_for=? and location=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,Good_for);
            pst.setString(2,location);
            
            ResultSet rst = pst.executeQuery();
            List<Restaurant> restaus= new ArrayList();
            while(rst.next()){

                String locationDb= rst.getString("location");
                String priceDb = rst.getString("price");
                String good_forDb = rst.getString("good_for");
                String cuisineDb = rst.getString("cuisine");
                String nameDb = rst.getString("name");
                String imageDb = rst.getString("image");
                 
                         int IdDb = rst.getInt("id");

                        
                Restaurant restau = new Restaurant();
                restau.setLocation(locationDb);
                restau.setPrice(priceDb);
                restau.setCuisine(cuisineDb);
                restau.setGood_for(good_forDb);
                restau.setImage(imageDb);
                restau.setName(nameDb);
                   restau.setId(IdDb);
                restaus.add(restau);
                

                
                
            }
            
            return restaus;
            
        
        
    }
        
        public List<Restaurant> SelectAllRestaurantbyPriceCuisine(String Price,String Cuisine,String location) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from restaurant where cuisine=? and location=? and price=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,Cuisine);
            pst.setString(2,location);
            pst.setString(3,Price);
            
            ResultSet rst = pst.executeQuery();
            List<Restaurant> restaus= new ArrayList();
            while(rst.next()){

                String locationDb= rst.getString("location");
                String priceDb = rst.getString("price");
                String good_forDb = rst.getString("good_for");
                String cuisineDb = rst.getString("cuisine");
                String nameDb = rst.getString("name");
                String imageDb = rst.getString("image");
                         int IdDb = rst.getInt("id");

                        
                Restaurant restau = new Restaurant();
                restau.setLocation(locationDb);
                restau.setPrice(priceDb);
                restau.setCuisine(cuisineDb);
                restau.setGood_for(good_forDb);
                restau.setImage(imageDb);
                restau.setName(nameDb);
       
          restau.setId(IdDb);
                
                restaus.add(restau);
                

                
                
            }
            
            return restaus;
               
    }

        public Restaurant Restaurant_by_Id(int restau_id) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "select* from restaurant where id=?";
        
        PreparedStatement ps= conn.prepareStatement(Sql);
        ps.setInt(1, restau_id);

        String sum_comment=null;
        String message = "select is done successfully";
        Restaurant restau = new Restaurant();

        
        try{
            ResultSet rst= ps.executeQuery();
            rst.next();
            //sum_comment= Result.getString(1);
                String locationDb= rst.getString("location");
                String priceDb = rst.getString("price");
                String good_forDb = rst.getString("good_for");
                String cuisineDb = rst.getString("cuisine");
                String nameDb = rst.getString("name");
                String imageDb = rst.getString("image");
                int IdDb = rst.getInt("id");

                restau.setLocation(locationDb);
                restau.setPrice(priceDb);
                restau.setCuisine(cuisineDb);
                restau.setGood_for(good_forDb);
                restau.setImage(imageDb);
                restau.setName(nameDb);
                restau.setId(IdDb);
                                    
        }
        catch(Exception e ){
            message="nope";
            System.out.print(message);
        }
        
        return restau;   
}        

        
        public List<Restaurant> SelectAllRestaurantbyPriceGood_for(String Price,String Good_for,String location) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from restaurant where good_for=? and location=? and price=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,Good_for);
            pst.setString(2,location);
            pst.setString(3,Price);
            
            ResultSet rst = pst.executeQuery();
            List<Restaurant> restaus= new ArrayList();
            while(rst.next()){

                String locationDb= rst.getString("location");
                String priceDb = rst.getString("price");
                String good_forDb = rst.getString("good_for");
                String cuisineDb = rst.getString("cuisine");
                String nameDb = rst.getString("name");
                String imageDb = rst.getString("image");
                int IdDb = rst.getInt("id");

                Restaurant restau = new Restaurant();
                restau.setLocation(locationDb);
                restau.setPrice(priceDb);
                restau.setCuisine(cuisineDb);
                restau.setGood_for(good_forDb);
                restau.setImage(imageDb);
                restau.setName(nameDb);
       
                restau.setId(IdDb);
                
                restaus.add(restau);
                

                
                
            }
            
            return restaus;
            
        
        
    }
        
        public List<Restaurant> SelectAllRestaurantbyCuisineGood_for(String Cuisine,String Good_for,String location) throws ClassNotFoundException, SQLException{
        LoadDriver(dbdriver);
        Connection conn = getConnection();
        String sql = "Select* from restaurant where good_for=? and location=? and Cuisine=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,Good_for);
            pst.setString(2,location);
            pst.setString(3,Cuisine);
            
            ResultSet rst = pst.executeQuery();
            List<Restaurant> restaus= new ArrayList();
            while(rst.next()){

                String locationDb= rst.getString("location");
                String priceDb = rst.getString("price");
                String good_forDb = rst.getString("good_for");
                String cuisineDb = rst.getString("cuisine");
                String nameDb = rst.getString("name");
                String imageDb = rst.getString("image");
                int IdDb = rst.getInt("id");

                        
                Restaurant restau = new Restaurant();
                restau.setLocation(locationDb);
                restau.setPrice(priceDb);
                restau.setCuisine(cuisineDb);
                restau.setGood_for(good_forDb);
                restau.setImage(imageDb);
                restau.setName(nameDb);

                restau.setId(IdDb);
                restaus.add(restau);
                

                
                
            }
            
            return restaus;
            
        
        
    }         
}
