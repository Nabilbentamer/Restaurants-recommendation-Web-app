package com.foodie.db;

import com.foodie.beans.Comment;
import com.foodie.beans.Rating;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RatingDao {
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
    
    public String insert(Rating rating) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "insert into rating(id_user,id_restau,value) values(?,?,?)";
        
        String result= "data entered succefully";
        
        try{
            PreparedStatement ps= conn.prepareStatement(Sql);
            
            ps.setInt(1,rating.getId_user());
            ps.setInt(2,rating.getId_restau());
            ps.setInt(3,rating.getValue());
            ps.execute();
            
            
            
        }
        catch(Exception e ){
            result="data didn't enter";
        }
        return result;
        
    
    
}
    
        public String Restaurant_Rating_All(int restau_id) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "select count(value) from rating where id_restau=?";
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
        
        public List<String> AllRating_ByRestaurant(int restau_id, int user_id) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        
        String Sql= "select value from rating where id_restau=? and id_user=?";
        PreparedStatement ps= conn.prepareStatement(Sql);
        ps.setInt(1, restau_id);
        ps.setInt(2,user_id);
        
        List<String> ValuesChecked = new ArrayList();
        
        String value_Rating=null;
        String message = "select is done successfully";
        
        try{
            ResultSet Result= ps.executeQuery();
            Result.next();
            value_Rating= Result.getString(1);
                                    
        }
        catch(Exception e ){
            message="nope";
            System.out.print(value_Rating);
        }
        
        ValuesChecked = List_of_Values(Integer.parseInt(value_Rating));
        return ValuesChecked;
}        

        public List<String> List_of_Values(int value) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
            
            List<String> ValuesList = new ArrayList();
            
            ValuesList.add("unchecked");
            ValuesList.add("unchecked");
            ValuesList.add("unchecked");
            ValuesList.add("unchecked");
            ValuesList.add("unchecked");
            
            String[] ValuesArray = new String[ValuesList.size()];
            ValuesArray = ValuesList.toArray(ValuesArray);
            for(int i=0 ; i< value; i++){
                ValuesArray[i]="checked";
                
            }
            
            List<String> finalValuesList = new ArrayList();
            for(int i=0; i< ValuesArray.length;i++){
                finalValuesList.add(ValuesArray[i]);
            }
            
            return finalValuesList;
        }


    public String Positive_Rating(int restau_id) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "select count(value) from rating where id_restau=? and value=5";
        PreparedStatement ps= conn.prepareStatement(Sql);
        ps.setInt(1, restau_id);
       

        
        String Positive_Rating=null;
        String message = "select is done successfully";
        
        try{
            ResultSet Result= ps.executeQuery();
            Result.next();
            Positive_Rating= Result.getString(1);
                                    
        }
        catch(Exception e ){
            message="nope";
            System.out.print(e);
        }
        
        return Positive_Rating;
        
    
    
}            
    public String Restaurant_Rating(int restau_id) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "select sum(value)/count(id_user) from rating where id_restau=?";
        PreparedStatement ps= conn.prepareStatement(Sql);
        ps.setInt(1, restau_id);

        String sum_rating=null;
        String message = "select is done successfully";
        
        try{
            ResultSet Result= ps.executeQuery();
            Result.next();
            sum_rating= Result.getString(1);
            
            
                                    
        }
        catch(Exception e ){
            message="nope";
        }
        
        return sum_rating;
  
}

    public String Total_User_Rating(int user_id) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        LoadDriver(dbdriver);
        Connection conn= getConnection();
        String Sql= "select count(id_user) from rating where id_user=?";
        PreparedStatement ps= conn.prepareStatement(Sql);
        ps.setInt(1, user_id);
       

        
        String sum_rating;
        String message = "select is done successfully";
        
        try{
            ResultSet Result= ps.executeQuery();
            Result.next();
            sum_rating= Result.getString(1);
            System.out.print(sum_rating);
                                    
        }
        catch(Exception e ){
            message="nope";
            System.out.print(e);
        }
        
        return message;
    
}    
    
}
