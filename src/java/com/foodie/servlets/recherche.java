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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class recherche extends HttpServlet {

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
            out.println("<title>Servlet recherche</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet recherche at " + request.getContextPath() + "</h1>");
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
    @SuppressWarnings("empty-statement")
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String location = request.getParameter("location");
        String price = request.getParameter("price");
        String cuisine = request.getParameter("cuisine");
        String good_for = request.getParameter("good_for");
        restaurantDao restauDao = new restaurantDao();
        List<List<Comment>> FinalComments = new ArrayList<List<Comment>>();
        
        try {
            List<Restaurant> restaus = restauDao.SelectAllRestaurantbyLocation(location);
            List<String> TotalComments_by_Restaurant = new ArrayList();
            
            try {            
                GetComments_of_Restaurant(restaus,TotalComments_by_Restaurant);
            } catch (IllegalAccessException | InstantiationException ex) {
                Logger.getLogger(recherche.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            getFinalComments(restaus,FinalComments);            
            request.setAttribute("Comments",FinalComments);
            request.setAttribute("TotalComments",TotalComments_by_Restaurant);

            
            request.setAttribute("restaus", restaus);
            request.setAttribute("location",location);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("RechercheNew.jsp");
            dispatcher.forward(request, response);

        } catch (ClassNotFoundException | SQLException s) {
            Logger.getLogger(recherche.class.getName()).log(Level.SEVERE, null, s);
        }

    }
    
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
    }
        
    public void GetComments_of_Restaurant(List<Restaurant> List_of_Restaurant, List<String> TotalComments) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        CommentDao commentDao = new CommentDao();
        for(Restaurant restau: List_of_Restaurant){
            try {
                TotalComments.add(commentDao.Restaurant_Comment(restau.getId()));               
            } catch (SQLException ex) {
                Logger.getLogger(recherche.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
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

}
