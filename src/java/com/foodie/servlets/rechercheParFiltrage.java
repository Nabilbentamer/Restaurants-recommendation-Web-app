/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodie.servlets;

import com.foodie.beans.Comment;
import com.foodie.beans.Restaurant;
import com.foodie.db.CommentDao;
import com.foodie.db.restaurantDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
@WebServlet(name = "rechercheParFiltrage", urlPatterns = {"/rechercheParFiltrage"})
public class rechercheParFiltrage extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet rechercheParFiltrage</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet rechercheParFiltrage at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            

            String location = request.getParameter("location");
            
            String[] checkBox_name = request.getParameterValues("checkBox_name");
            
            restaurantDao restauDao = new restaurantDao();

            
            // none of the checkboxed are checked            
            if(checkBox_name==null)
            {
                updateDataByLocation(request,response,location,false,"ok");
            
            }
            
            // if there is at least one chebox who is checked. 
            
            else{
                            
                List priceList = Arrays.asList(checkBox_name);
                
                if(priceList.containsAll(Arrays.asList("1","2","3","4","5","6","7","8","9"))){
                                        

                    //updateDataByLocation(request,response,location,true,"All");
                    
                }
                
                /*----------------------- 3 checkboxd ----------------------------- */ 
                
                if(priceList.containsAll(Arrays.asList("1","2","3"))){
                    
                    updateDataByLocation(request,response,location,true,"price");
                    
                }
                                
                if(priceList.containsAll(Arrays.asList("4","5","6"))){
                    
                    updateDataByLocation(request,response,location,true,"cuisine");
                    
                }
                
                if(priceList.containsAll(Arrays.asList("7","8","9"))){
                    
                    updateDataByLocation(request,response,location,true,"good_for");
                    
                }
                /*-----------xxxxxxxx------------ 3 checkboxd ---------------xxxxxxxxxx-------------- */ 

                
                
                /*----------------------- 2 checkboxd: Price and Cuisine ---------------------------*/
                if(priceList.containsAll(Arrays.asList("1","4"))){
                    updateDataByPriceCuisine(request,response,location,"cheap","moroccan");
                    
                }                
                if(priceList.containsAll(Arrays.asList("1","5"))){
                    updateDataByPriceCuisine(request,response,location,"cheap","italian");
                    
                }                
                if(priceList.containsAll(Arrays.asList("1","6"))){
                    updateDataByPriceCuisine(request,response,location,"cheap","spanish");
                    
                }
                /*----------------------- 2 checkboxd: Price and Cuisine ---------------------------*/
                
                /*----------------------- 2 checkboxd: Price and Cuisine ---------------------------*/
                if(priceList.containsAll(Arrays.asList("2","4"))){
                    
                    updateDataByPriceCuisine(request,response,location,"mid","moroccan");
                    
                }                
                if(priceList.containsAll(Arrays.asList("2","5"))){
                    
                    updateDataByPriceCuisine(request,response,location,"mid","italian");
                    
                }                
                if(priceList.containsAll(Arrays.asList("2","6"))){
                    
                    updateDataByPriceCuisine(request,response,location,"mid","spanish");
                    
                }
                /*----------------------- 2 checkboxd: Price and Cuisine ---------------------------*/
                
                /*----------------------- 2 checkboxd: Price and Cuisine ---------------------------*/
                if(priceList.containsAll(Arrays.asList("3","4"))){
                    
                    updateDataByPriceCuisine(request,response,location,"high","moroccan");
                    
                }                
                if(priceList.containsAll(Arrays.asList("3","5"))){
                    
                    updateDataByPriceCuisine(request,response,location,"high","italian");
                    
                }                
                if(priceList.containsAll(Arrays.asList("3","6"))){
                    
                    updateDataByPriceCuisine(request,response,location,"high","spanish");
                    
                }
                /*----------------------- 2 checkboxd: Price and Cuisine ---------------------------*/
                
                
                
                
                
                
                /*----------------------- 2 checkboxd: Price and Good_for ---------------------------*/
                if(priceList.containsAll(Arrays.asList("1","7"))){
                    
                    updateDataByPriceGood_for(request,response,location,"cheap","Families");
                    
                }                
                if(priceList.containsAll(Arrays.asList("1","8"))){
                    
                    updateDataByPriceGood_for(request,response,location,"cheap","Business");
                    
                }                
                if(priceList.containsAll(Arrays.asList("1","9"))){
                    
                    updateDataByPriceGood_for(request,response,location,"cheap","Kids");
                    
                }
                /*----------------------- 2 checkboxd: Price and Good_for ---------------------------*/

                /*----------------------- 2 checkboxd: Price and Good_for ---------------------------*/
                if(priceList.containsAll(Arrays.asList("2","7"))){
                    
                    updateDataByPriceGood_for(request,response,location,"mid","Families");
                    
                }                
                if(priceList.containsAll(Arrays.asList("2","8"))){
                    
                    updateDataByPriceGood_for(request,response,location,"mid","Business");
                    
                }                
                if(priceList.containsAll(Arrays.asList("2","9"))){
                    
                    updateDataByPriceGood_for(request,response,location,"mid","Kids");
                    
                }
                /*----------------------- 2 checkboxd: Price and Good_for ---------------------------*/ 

                /*----------------------- 2 checkboxd: Price and Good_for ---------------------------*/
                if(priceList.containsAll(Arrays.asList("3","7"))){
                    
                    updateDataByPriceGood_for(request,response,location,"high","Families");
                    
                }                
                if(priceList.containsAll(Arrays.asList("3","8"))){
                    
                    updateDataByPriceGood_for(request,response,location,"high","Business");
                    
                }                
                if(priceList.containsAll(Arrays.asList("3","9"))){
                    
                    updateDataByPriceGood_for(request,response,location,"high","Kids");
                    
                }
                /*----------------------- 2 checkboxd: Price and Good_for ---------------------------*/                 
                
                
                
                
                
                /*----------------------- 2 checkboxd: Cuisine and Good_for ---------------------------*/                 

                if(priceList.containsAll(Arrays.asList("4","7"))){
                    
                    updateDataByCuisineGood_for(request,response,location,"moroccan","Families");
                    
                }                
                if(priceList.containsAll(Arrays.asList("4","8"))){
                    
                    updateDataByCuisineGood_for(request,response,location,"moroccan","Business");
                    
                }                
                if(priceList.containsAll(Arrays.asList("4","9"))){
                    
                    updateDataByCuisineGood_for(request,response,location,"moroccan","Kids");
                    
                }

                /*----------------------- 2 checkboxd: Cuisine and Good_for ---------------------------*/
                
           /*----------------------- 2 checkboxd: Cuisine and Good_for ---------------------------*/                 

                if(priceList.containsAll(Arrays.asList("5","7"))){
                    
                    updateDataByCuisineGood_for(request,response,location,"italian","Families");
                    
                }                
                if(priceList.containsAll(Arrays.asList("5","8"))){
                    
                    updateDataByCuisineGood_for(request,response,location,"italian","Business");
                    
                }                
                if(priceList.containsAll(Arrays.asList("5","9"))){
                    
                    updateDataByCuisineGood_for(request,response,location,"italian","Kids");
                    
                }

                /*----------------------- 2 checkboxd: Cuisine and Good_for ---------------------------*/ 
                
                
                /*----------------------- 2 checkboxd: Cuisine and Good_for ---------------------------*/                 

                if(priceList.containsAll(Arrays.asList("6","7"))){
                    
                    updateDataByCuisineGood_for(request,response,location,"spanish","Families");
                    
                }                
                if(priceList.containsAll(Arrays.asList("6","8"))){
                    
                    updateDataByCuisineGood_for(request,response,location,"spanish","Business");
                    
                }                
                if(priceList.containsAll(Arrays.asList("6","9"))){
                    
                    updateDataByCuisineGood_for(request,response,location,"spanish","Kids");
                    
                }

                /*----------------------- 2 checkboxd: Cuisine and Good_for ---------------------------*/ 
                
                /*-------------------- Price 2 checkboxd ---------------------------- */ 
                if(priceList.containsAll(Arrays.asList("1","3"))){
                    updateDataByPrice(request,response,"cheap","high",location);
                    
                }
                if(priceList.containsAll(Arrays.asList("1","2"))){
                    updateDataByPrice(request,response,"cheap","mid",location);
                    
                }
                if(priceList.containsAll(Arrays.asList("3","2"))){
                    updateDataByPrice(request,response,"high","mid",location);
                    
                }
                /*------------xxxxxxxx-------- Price 2 checkboxd ----------------xxxxxxx------------ */ 
                
                
                /*-------------------- Cuisine 2 checkboxd ---------------------------- */
                
                if(priceList.containsAll(Arrays.asList("4","5"))){
                    updateDataByCuisine(request,response,"moroccan","italian",location);
                    
                }
                if(priceList.containsAll(Arrays.asList("6","5"))){
                    updateDataByCuisine(request,response,"spanish","italian",location);
                    
                }
                if(priceList.containsAll(Arrays.asList("4","6"))){
                    updateDataByCuisine(request,response,"moroccan","spanish",location);
                    
                }
                
                /*--------xxxx------------ Cuisine 2 checkboxd -------------xxxxxx--------------- */

                
                
                /*------------------------------ 1 checkboxd ---------------------------------- */ 
                
                if(priceList.contains("1")){
                    updateData(request,response,"cheap",location);
                }
               
                else if(priceList.contains("2")){
                    updateData(request,response,"mid",location);                    
                }
                
                else if(priceList.contains("3")){
                    updateData(request,response,"high",location);

                }
               
                else if(priceList.contains("4")){
                    updateData(request,response,"moroccan",location);

                }                
                else if(priceList.contains("5")){
                    updateData(request,response,"italian",location);

                }                
                else if(priceList.contains("6")){
                    updateData(request,response,"spanish",location);

                }

                else if(priceList.contains("7")){
                    updateData(request,response,"Families",location);

                }                 
                else if(priceList.contains("8")){
                    updateData(request,response,"Business",location);

                }                 
                else if(priceList.contains("9")){
                    updateData(request,response,"Kids",location);

                } 
                /*--------------xxxxxxxxx---------------- 1 checkboxd ---------------xxxxxxxxxxx------------------- */ 
                
            }
            
            
    
        
    }
    


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    public void getFinalComments( List<Restaurant> List_of_Restaurant, List<List<Comment>> FinalComments){
        
        CommentDao commentDao = new CommentDao();
        Comment comment = new Comment();
        List<Comment> commentById = new ArrayList();
        
        for(Restaurant restau: List_of_Restaurant){
            try {
                commentById = commentDao.SelectAllComments_By_Restau_Id(restau.getId());
                FinalComments.add(commentById);
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(rechercheParFiltrage.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
        }
        System.out.println("ok");
    }
    public void updateData(HttpServletRequest request, HttpServletResponse response, String filtre_option, String location)
            throws ServletException, IOException {
                    List<List<Comment>> FinalComments = new ArrayList<List<Comment>>();

                    try {
                        

                        restaurantDao restauDao = new restaurantDao();
                        List<Restaurant> restaus = new ArrayList();
                        List<Comment> comment = new ArrayList();
                        
                        
                        if(filtre_option=="cheap" || filtre_option=="mid" || filtre_option=="high"){
                            restaus=restauDao.SelectAllRestaurantbyPrice(filtre_option,location);
                            
                        }
                        if(filtre_option=="moroccan" || filtre_option=="italian" || filtre_option=="spanish"){
                            restaus=restauDao.SelectAllRestaurantbyCuisine(filtre_option,location);
                            
                        }
                        if(filtre_option=="Families" || filtre_option=="Business" || filtre_option=="Kids"){
                            restaus=restauDao.SelectAllRestaurantbyGood_for(filtre_option,location);
                            
                        }
                        getFinalComments(restaus,FinalComments);
                        request.setAttribute("Comments",FinalComments);
                        request.setAttribute("restaus", restaus);
                        request.setAttribute("location",location);
                        request.setAttribute("boolean", true);
                        request.setAttribute("value_id1",filtre_option);
                        RequestDispatcher dispatcher = request.getRequestDispatcher("RechercheNew.jsp");
                        dispatcher.forward(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(rechercheParFiltrage.class.getName()).log(Level.SEVERE, null, ex);
                }        
        
        
    }
    
    public void updateDataByLocation(HttpServletRequest request, HttpServletResponse response, String location,boolean AllCheckbox_Checked, String filter_option)
            throws ServletException, IOException {
                    restaurantDao restauDao = new restaurantDao();
                    
                    if(AllCheckbox_Checked=true && filter_option=="price" ){
                    request.setAttribute("boolean", true);
                    request.setAttribute("value_id1","cheap");
                    request.setAttribute("value_id2","mid");
                    request.setAttribute("value_id3","high");
                        
                    }
                    if(AllCheckbox_Checked=true && filter_option=="cuisine" ){
                    request.setAttribute("boolean", true);
                    request.setAttribute("value_id1","moroccan");
                    request.setAttribute("value_id2","spanish");
                    request.setAttribute("value_id3","italian");
                        
                    }                    
                    if(AllCheckbox_Checked=true && filter_option=="good_for" ){
                    request.setAttribute("boolean", true);
                    request.setAttribute("value_id1","Families");
                    request.setAttribute("value_id2","Business");
                    request.setAttribute("value_id3","Kids");
                        
                    }
                    if(AllCheckbox_Checked=true && filter_option=="All" ){
                    request.setAttribute("boolean", true);

                    }                    
                    
                    
                try {
                    List<Restaurant> restaus = restauDao.SelectAllRestaurantbyLocation(location);
                    request.setAttribute("restaus", restaus);
                    request.setAttribute("location",location);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("RechercheNew.jsp");
                    dispatcher.forward(request, response);    
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(rechercheParFiltrage.class.getName()).log(Level.SEVERE, null, ex);
                }        
        
    }
    public void updateDataByPrice(HttpServletRequest request, HttpServletResponse response, String Price1, String Price2,String location)
            throws ServletException, IOException {
                    restaurantDao restauDao = new restaurantDao();
                    
                try {
                    List<Restaurant> restaus = restauDao.SelectAllRestaurantbyPrice(Price1,location);
                    List<Restaurant> restaus1 = restauDao.SelectAllRestaurantbyPrice(Price2,location);
                    List<Restaurant> restausTotal = new ArrayList<Restaurant>();
                    
                    restausTotal.addAll(restaus);
                    restausTotal.addAll(restaus1);
                    

                    request.setAttribute("restaus", restausTotal);
                    request.setAttribute("location",location);
                    request.setAttribute("boolean", true);
                    request.setAttribute("value_id1",Price1);
                    request.setAttribute("value_id2",Price2);
                    
                    RequestDispatcher dispatcher = request.getRequestDispatcher("RechercheNew.jsp");
                    dispatcher.forward(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(rechercheParFiltrage.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }
    public void updateDataByCuisine(HttpServletRequest request, HttpServletResponse response, String Cuisine1, String Cuisine2,String location)
            throws ServletException, IOException {
                    restaurantDao restauDao = new restaurantDao();
                    
                try {
                    List<Restaurant> restaus = restauDao.SelectAllRestaurantbyCuisine(Cuisine1,location);
                    List<Restaurant> restaus1 = restauDao.SelectAllRestaurantbyCuisine(Cuisine2,location);
                    List<Restaurant> restausTotal = new ArrayList<Restaurant>();
                    
                    restausTotal.addAll(restaus);
                    restausTotal.addAll(restaus1);
                    

                    request.setAttribute("restaus", restausTotal);
                    request.setAttribute("location",location);
                    request.setAttribute("boolean", true);
                    request.setAttribute("value_id1",Cuisine1);
                    request.setAttribute("value_id2",Cuisine2);
                    
                    RequestDispatcher dispatcher = request.getRequestDispatcher("RechercheNew.jsp");
                    dispatcher.forward(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(rechercheParFiltrage.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }
    public void updateDataByPriceCuisine(HttpServletRequest request, HttpServletResponse response,String location, String Price, String Cuisine)
            throws ServletException, IOException {
        
                    restaurantDao restauDao = new restaurantDao();
        
               try {                                        
                    List<Restaurant> restausPriceCuisine = restauDao.SelectAllRestaurantbyPriceCuisine(Price,Cuisine,location);
 
                    request.setAttribute("restaus",restausPriceCuisine);
                    request.setAttribute("location",location);
                    request.setAttribute("boolean", true);
                    request.setAttribute("value_id1",Cuisine);
                    request.setAttribute("value_id2",Price);                    
                    RequestDispatcher dispatcher = request.getRequestDispatcher("RechercheNew.jsp");
                    dispatcher.forward(request, response);
   
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(rechercheParFiltrage.class.getName()).log(Level.SEVERE, null, ex);
                }        
        
    }    
    public void updateDataByPriceGood_for(HttpServletRequest request, HttpServletResponse response,String location, String Price, String Good_for)
            throws ServletException, IOException {
        
                    restaurantDao restauDao = new restaurantDao();
        
               try {
                    
                    
                    List<Restaurant> restausPriceGood_for = restauDao.SelectAllRestaurantbyPriceGood_for(Price,Good_for,location);

                    request.setAttribute("restaus", restausPriceGood_for);
                    request.setAttribute("location",location);
                    request.setAttribute("boolean", true);
                    request.setAttribute("value_id1",Good_for);
                    request.setAttribute("value_id2",Price);                    
                    RequestDispatcher dispatcher = request.getRequestDispatcher("RechercheNew.jsp");
                    dispatcher.forward(request, response);
                    
                    
                    
                    
                    
                    
                    
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(rechercheParFiltrage.class.getName()).log(Level.SEVERE, null, ex);
                }        
        
    }
    
    public void updateDataByCuisineGood_for(HttpServletRequest request, HttpServletResponse response,String location, String Cuisine, String Good_for)
            throws ServletException, IOException {
        
                    restaurantDao restauDao = new restaurantDao();
        
               try {
                    List<Restaurant> restausPriceGood_for = restauDao.SelectAllRestaurantbyCuisineGood_for(Cuisine,Good_for,location);

                    request.setAttribute("restaus", restausPriceGood_for);
                    request.setAttribute("location",location);
                    request.setAttribute("boolean", true);
                    request.setAttribute("value_id1",Good_for);
                    request.setAttribute("value_id2",Cuisine);                    
                    RequestDispatcher dispatcher = request.getRequestDispatcher("RechercheNew.jsp");
                    dispatcher.forward(request, response);
                    
   
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(rechercheParFiltrage.class.getName()).log(Level.SEVERE, null, ex);
                }        
        
    }    
}
