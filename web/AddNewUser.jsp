<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="ressources/css/AddNewUser.css">
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
        <img src="1.png" class="mobile_profile_image" alt="">
        <i class="fa fa-bars nav_btn"></i>
      </div>
      <div class="mobile_nav_items">
        <a href="#"><i class="fas fa-desktop"></i><span>Dashboard</span></a>
        <a href="#"><i class="fas fa-cogs"></i><span>Components</span></a>
        <a href="#"><i class="fas fa-table"></i><span>Tables</span></a>
        <a href="#"><i class="fas fa-th"></i><span>Forms</span></a>
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

      <a href="index.html"><i class="fas fa-desktop"></i><span>Dashboard</span></a>
      <a href="index.html"><i class="far fa-user-circle"></i><span>Users</span></a>
      <a href="./ManageComments.html"><i class="fas fa-comment-dots"></i><span>Comments</span></a>
      <a href="ManageRestaurant.html"><i class="fas fa-utensils"></i><span> Restaurants </span></a> 
      <a href="#"><i class="fas fa-info-circle"></i><span>About</span></a>
      <a href="#"><i class="fas fa-sliders-h"></i><span>Settings</span></a>
    </div>


    <!--sidebar end-->

    <div class="content">

      <div class="users-button">
      <button class="AddUser"><a href="<%= request.getContextPath()%>/AddNewUser.jsp">Add User</a></button>
      <button class="DisplayUsers"><a href="<%= request.getContextPath()%>/DisplayUsers">Display Users</a></button>
    </div>


    <form action="DisplayUsers" method="post">
        
      <div class="container">
        <hr>
        <label for="email"><b>Name</b></label>
        <input type="text" placeholder="Enter Name" name="name" id="email" value="${name}" required>
    
        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" id="email" value="${email}" required>
    
        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" id="psw" value="${psw}" required>
        <input type="hidden" value="${attribu}" name="attribu"> 
        <input type="hidden" value="${user_id}" name="user_id">
        
        <hr>
    
        <button type="submit" class="registerbtn">Save</button>
        <button class="registerbtn">Cancel</button>

      </div>
      

    </form>

    
   

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
