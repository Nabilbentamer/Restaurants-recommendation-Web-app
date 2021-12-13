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
@WebServlet(name = "EditUser", urlPatterns = {"/EditUser"})
public class EditUser extends HttpServlet {

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
            out.println("<title>Servlet EditUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditUser at " + request.getContextPath() + "</h1>");
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
        
            int id;
            
            
            //id=String.valueOf(request.getAttribute("UserId"));
            
            id= Integer.parseInt(request.getParameter("UserId"));
            /*
            if(id==null){
                System.out.println("empty variable");
            }
            else{
                  request.setAttribute("name",String.valueOf(request.getAttribute("UserId")));
                  System.out.println("empty not variable");
   
            }*/
            String action = request.getParameter("action");
            
            if(action.equals("edit")){
                
            
            MemberDao memberDao = new MemberDao();
            Member member = new Member();

        try {
            member = memberDao.SelectMember(id);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
            request.setAttribute("name",member.getUname());
            request.setAttribute("email",member.getEmail());
            request.setAttribute("psw",member.getPassword());
            request.setAttribute("attribu","edit");
            request.setAttribute("user_id",id);
            RequestDispatcher dispatcher = request.getRequestDispatcher("AddNewUser.jsp");
            dispatcher.forward(request, response); 
    }
            else if(action.equals("delete")){
            MemberDao memberDao = new MemberDao();
            Member member = new Member();
                try {
                    memberDao.DeleteMember(id);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            RequestDispatcher dispatcher = request.getRequestDispatcher("ManageUsers.jsp");
            dispatcher.forward(request, response); 
            
                
            }
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
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Member member = new Member();
        member.setEmail(email);
        member.setPassword(password);
        member.setEmail(email);
        response.getWriter().println("yes");
        MemberDao memberDao = new MemberDao();
        try {
            memberDao.UpdateMember(member);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
        dispatcher.forward(request, response);

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
