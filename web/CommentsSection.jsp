<%@page import="com.foodie.db.MemberDao"%>
<%@page import="com.foodie.beans.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.foodie.servlets.recherche"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>CasaFoodie</title>

    <!------ Custom Style ------> 

    <link rel="stylesheet" href="ressources/css/AddUser.css">

    <!----------- font awsome Icons -------->

    <link rel="stylesheet" href="ressources/css/all.css">

</head>


    <body>



    <!--------------------- Navigation ------------------------>
        
    <nav class="nav">
        <div class="flex-row">

            <div class="nav-brand">
                <a href="acceuil.jsp">Casafoodie</a>
            </div>

          

            <div>
                <ul class="nav-items">

                    <li class="nav-link">
                        <a href="acceuil.jsp">Home</a>
                    </li>

                    <li class="nav-link">
                        <a href="#">Reviews</a>
                    </li>
                    
                    <li class="nav-link">
                        <a href="#">Contact us</a>
                    </li>

                </ul>

            </div>

                <div class="social">
                    <a href="AddUser.jsp"><i class="fab fa-facebook-f"></i></a>
                    <a href="#"><i class="fab fa-instagram"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-youtube"></i></a>

                </div>


            
        </div>

    </nav>

    <!-----------xx---------- Navigation ------------xx------------>

    
    <!-----------------------Admin Page Wrapper -------------------->

    <div class="admin-wrapper">

        <div class="left-sidebar">
            <ul>
                <li><a href="#">Manage users</a></li>
                <li><a href="#">Manage restaurants</a></li>
                <li><a href="#">Manage Reviews</a></li>
                <li><a href="#">Manage Comments</a></li>

            </ul>
            

        </div>

        <div class="admin-content">
            <div class="button-groupe">
                <button class="btn"><a href="AddUser.jsp">Add User</a></button>
                <form action="DisplayUsers" method="post">
                <input type="submit" class="btn" value="Manage Users">
                </form>
            </div>
            
            <div class="content">
                <h2 class="page-title">Manage Users</h2>
                <input type="hidden" name="UserId" value="ME"> 
                <table>
                    <thead>
                        <th>Author</th>
                        <th>Comment</th>
                        <th>Restaurant Name</th>
                        <th>Status</th>
                        <th> Date </th>
                        
                        <th colspan="2">Action</th>
                    </thead>
                    
                    <tbody>
                        
                        <c:forEach var="comment" items="${Comments}" varStatus="status">
                        
                        <tr>
                        <h2>${status.count}</h2>
            
                            <td>${comment.id}</td>
                            <td>${comment.content}</td>
                            <td>${comment.id_restau}</td>
                            
                            <td>${comment.date}</td>
                            
                            
                            <td>${Members.get(0).uname} </td> 
                            
                            <td>${Members.get(1).uname}</td>


                            
                        </tr>

                        </c:forEach>                        
                    </tbody>
                    
                </table>
            </div>

        </div>




    </div>


    <!-----------xxxxx------------Admin Page Wrapper -------------xxxxxx------->
    
    

    </body>
</html>
