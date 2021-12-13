/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodie.servlets;

import com.foodie.beans.Comment;
import com.foodie.beans.Rating;
import com.foodie.db.CommentDao;
import com.foodie.db.RatingDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "AddCommentNew", urlPatterns = {"/AddCommentNew"})
public class AddComment extends HttpServlet {

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
            out.println("<title>Servlet AddCommentNew</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddCommentNew at " + request.getContextPath() + "</h1>");
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
        
        String restauId = request.getParameter("restauId");
        

        String memberId = request.getParameter("memberID");
        

        request.setAttribute("memberId", memberId);
        request.setAttribute("restauId",restauId);
        

        
        RequestDispatcher dispatcher = request.getRequestDispatcher("AddComment.jsp");
        dispatcher.forward(request, response);
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
        
        
        try {
            
            //Get the text, restau_id and member_id and also which rating value is clicked
            int Id_restau = Integer.parseInt(request.getParameter("restauId"));
            int Id_member = Integer.parseInt(request.getParameter("memberId"));
            String text = request.getParameter("textArea");
            
            int rating_value = Integer.parseInt(request.getParameter("rating"));
            
            
            Comment cmnt = new Comment();
            Rating rating = new Rating();
            
            // loading the restau object by it's info
            rating.setId_restau(Id_restau);
            rating.setId_user(Id_member);
            rating.setValue(rating_value);
            
            // loading the comment object by it's attribute
            cmnt.setId_restau(Id_restau);
            cmnt.setId_user(Id_member);
            cmnt.setContent(text);
            
            
            CommentDao cmntDao = new CommentDao();
            RatingDao ratingDao = new RatingDao(); 
            
            
            String message_rating = ratingDao.insert(rating);
            String message = cmntDao.insert(cmnt);
  
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("acceuil.jsp");
            dispatcher.forward(request, response);


        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(AddComment.class.getName()).log(Level.SEVERE, null, ex);
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
