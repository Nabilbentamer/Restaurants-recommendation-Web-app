/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodie.servlets;

import com.foodie.beans.Comment;
import com.foodie.beans.Member;
import com.foodie.beans.Restaurant;
import com.foodie.db.CommentDao;
import com.foodie.db.MemberDao;
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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
@WebServlet(name = "DisplayComments", urlPatterns = {"/DisplayComments"})
public class DisplayComments extends HttpServlet {

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
            out.println("<title>Servlet DisplayComments</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DisplayComments at " + request.getContextPath() + "</h1>");
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
               List<Comment> comments = new ArrayList<>();
               List<Member> members = new ArrayList<>();
               List<Restaurant> restaus = new ArrayList<>();
              CommentDao commentDao = new CommentDao();
              restaurantDao restauDao = new restaurantDao();
              MemberDao memberDao = new MemberDao();
                try {
                    comments = commentDao.SelectAllComments();
                    for(Comment comment_1:comments){
                        Restaurant restau = new Restaurant();
                        Member member = new Member();
                        
                        try {
                            restau =restauDao.Restaurant_by_Id(comment_1.getId_restau());
                            member = memberDao.SelectMember(comment_1.getId_user());
                            restaus.add(restau);
                            members.add(member);
                        } catch (IllegalAccessException | InstantiationException ex) {
                            Logger.getLogger(DisplayComments.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                request.setAttribute("Comments",comments);
                request.setAttribute("restaus",restaus);
                request.setAttribute("members",members);
                RequestDispatcher dispatcher = request.getRequestDispatcher("ManageComments.jsp");
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
