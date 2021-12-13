package com.foodie.servlets;

import com.foodie.beans.Comment;
import com.foodie.beans.Member;
import com.foodie.beans.Rating;
import com.foodie.beans.Restaurant;
import com.foodie.db.CommentDao;
import com.foodie.db.MemberDao;
import com.foodie.db.RatingDao;
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
@WebServlet(name = "Restaurant", urlPatterns = {"/Restaurant"})
public class RestaurantPage extends HttpServlet {

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
            out.println("<title>Servlet Restaurant</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Restaurant at " + request.getContextPath() + "</h1>");
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
        
            int restauId = Integer.parseInt(request.getParameter("restauId"));
            String memberId = request.getParameter("memberID");
            String OverAllRating;
            String AllRating;
            String PositiveRating;  
            int Positive_Rating_Number;
            
            List<Member> All_Members = new ArrayList();            
            List<Comment> All_Restaurant_Comments = new ArrayList();
            List<List<String>> Valueslist = new ArrayList<List<String>>();
            List<String> All_Members_Comment = new ArrayList();

            
            
        try {
            
            RatingDao ratingDao = new RatingDao();
            restaurantDao restauDao = new restaurantDao();
            CommentDao commentDao = new CommentDao();
            MemberDao memberDao = new MemberDao();
            Restaurant restau = new Restaurant();
            
            All_Restaurant_Comments = commentDao.SelectAllComments_By_Restau_Id(restauId);
            for(Comment comment_1:All_Restaurant_Comments){
                List<String> AllValues = new ArrayList();
                String totalUserComments="0";
                totalUserComments=commentDao.Total_User_Comments(comment_1.getId_user());
                All_Members_Comment.add(totalUserComments);
                
                AllValues = ratingDao.AllRating_ByRestaurant(comment_1.getId_restau(),comment_1.getId_user());
                
                
                Member member= new Member();
                member = memberDao.SelectMember(comment_1.getId_user());
                All_Members.add(member);
                Valueslist.add(AllValues);
            }
            
            OverAllRating = ratingDao.Restaurant_Rating(restauId);
            AllRating = ratingDao.Restaurant_Rating_All(restauId);
            PositiveRating = ratingDao.Positive_Rating(restauId);
            Double f=Math.round(Double.parseDouble(OverAllRating)*100.0) / 100.0;
            String OverAllRating_Precision = Double.toString(f);
            
            if(Integer.parseInt(AllRating)==0){
                Positive_Rating_Number=0;
                
            }
            else{
                Positive_Rating_Number = (Integer.parseInt(PositiveRating)*100)/ Integer.parseInt(AllRating);

            }
            
            PositiveRating = Integer.toString(Positive_Rating_Number);
            restau = restauDao.Restaurant_by_Id(restauId);
            
            request.setAttribute("All_Members_Comment",All_Members_Comment);
            request.setAttribute("Valueslist",Valueslist);
            request.setAttribute("allMembers",All_Members);
            request.setAttribute("All_Restaurant_Comments",All_Restaurant_Comments);
            request.setAttribute("restau",restau);
            request.setAttribute("overAllRating",OverAllRating_Precision);
            request.setAttribute("AllRating",AllRating);
            request.setAttribute("PositiveRating",PositiveRating);
            
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(RestaurantPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            RequestDispatcher dispatcher = request.getRequestDispatcher("Restaurant.jsp");
            dispatcher.forward(request, response);        
           


    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
