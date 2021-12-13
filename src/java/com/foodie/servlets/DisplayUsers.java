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

/**
 *
 * @author hp
 */
@WebServlet(name = "DisplayUsers", urlPatterns = {"/DisplayUsers"})
public class DisplayUsers extends HttpServlet {

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
            out.println("<title>Servlet DisplayUsers</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DisplayUsers at " + request.getContextPath() + "</h1>");
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
              List<Member> members = new ArrayList<>();
              MemberDao memberDao = new MemberDao();
                try {
                    members = memberDao.SelectAllMembers();
                    request.setAttribute("Members",members);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(afterlogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                RequestDispatcher dispatcher = request.getRequestDispatcher("ManageUsers.jsp");
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
        
        String name= request.getParameter("name");
        String email= request.getParameter("email");
        String psw= request.getParameter("psw");
        int user_id = Integer.parseInt(request.getParameter("user_id"));
        
        String attribu = request.getParameter("attribu");
        
        MemberDao memberDao = new MemberDao();
        Member member = new Member();
        member.setEmail(email);
        member.setUname(name);
        member.setPassword(psw);
        member.setId(user_id);
        String message=null;
        System.out.print(attribu);
        try {
                if(attribu.equals("edit")){
                    memberDao.UpdateMember(member);
                }
                else{
                    message=memberDao.insert(member);
                   
                }

        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(DisplayUsers.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
                RequestDispatcher dispatcher = request.getRequestDispatcher("ManageUsers.jsp");
                dispatcher.forward(request, response);
            
      
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
