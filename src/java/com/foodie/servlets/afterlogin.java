/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodie.servlets;

import com.foodie.beans.Member;
import com.foodie.db.MemberDao;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
@WebServlet(name = "afterlogin", urlPatterns = {"/afterlogin"})
public class afterlogin extends HttpServlet {

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
            out.println("<title>Servlet afterlogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet afterlogin at " + request.getContextPath() + "</h1>");
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


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            MemberDao MemDao = new MemberDao();
            String destPage="login.jsp";
            
            Member member1= new Member();
        try {
            member1=MemDao.checkLogin(email, password);
                      
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          // if the email or password are incorect stay at the same page but print something to warn the user
          if(member1==null){               
                request.setAttribute("message","email or password is incorect");                               
            }
          // if the user is an admin forwat to admin page 
          else if("admin".equals(member1.getUname()) && "admin".equals(member1.getPassword())){              
              destPage = "AdminPanel.jsp";

          }
          else{
              destPage= "UserProfileNew.jsp";
          }
          // if it's a normal user forward to home page

            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
            dispatcher.forward(request, response);

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
