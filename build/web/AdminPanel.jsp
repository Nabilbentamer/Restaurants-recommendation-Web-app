<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
  <head>
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="ressources/css/adminTest.css">
    <link rel="stylesheet" href="ressources/css/all.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js" charset="utf-8"></script>
  </head>
  <body>

    <input type="checkbox" id="check">
    <!--header area start-->
    <header>
      <label for="check">
        <i class="fas fa-bars" id="sidebar_btn"></i>
      </label>
      <div class="left_area">
        <h3>Casa <span>Foodie</span></h3>
      </div>
      <div class="right_area">
        <a href="#" class="logout_btn">Logout</a>
      </div>
    </header>
    <!--header area end-->
    <!--mobile navigation bar start-->
    <div class="mobile_nav">
      <div class="nav_bar">
        <img src="ressources/images/portrait1.jpg" class="mobile_profile_image" alt="">
        <i class="fa fa-bars nav_btn"></i>
      </div>
      <div class="mobile_nav_items">
        <a href="#"><i class="fas fa-desktop"></i><span>Dashboard</span></a>
        <a href="<%= request.getContextPath()%>/DisplayUsers"><i class="fas fa-cogs"></i><span>Components</span></a>
        <a href="<%= request.getContextPath()%>/DisplayComments"><i class="fas fa-table"></i><span>Tables</span></a>
        <a href="<%= request.getContextPath()%>/DisplayRestaurants"><i class="fas fa-th"></i><span>Forms</span></a>
        <a href="#"><i class="fas fa-info-circle"></i><span>About</span></a>
        <a href="#"><i class="fas fa-sliders-h"></i><span>Settings</span></a>
      </div>
    </div>
    <!--mobile navigation bar end-->
    <!--sidebar start-->
    <div class="sidebar">

      <div class="profile_info">
        <img src="4.jpg" class="profile_image" alt="">
        <h4>Admin</h4>
      </div>

      <a href="#"><i class="fas fa-desktop"></i><span>Dashboard</span></a>
      <a href="<%= request.getContextPath()%>/DisplayUsers"><i class="far fa-user-circle"></i><span>Users</span></a>
      <a href="<%= request.getContextPath()%>/DisplayComments"><i class="fas fa-comment-dots"></i><span>Comments</span></a>
      <a href="<%= request.getContextPath()%>/DisplayRestaurants"><i class="fas fa-utensils"></i><span> Restaurants </span></a> 
      <a href="#"><i class="fas fa-info-circle"></i><span>About</span></a>
      <a href="#"><i class="fas fa-sliders-h"></i><span>Settings</span></a>
    </div>


    <!--sidebar end-->

    <div class="content">

      <div class="users-button">
      <button class="AddUser"><a href="AddUser.html">Add User</a></button>
      <button class="DisplayUsers"><a href="AddUser.html">Display Users</a></button>
    </div>

    </div>

    <script type="text/javascript">
    $(document).ready(function(){
      $('.nav_btn').click(function(){
        $('.mobile_nav_items').toggleClass('active');
      });
    });
    </script>

  </body>
</html>