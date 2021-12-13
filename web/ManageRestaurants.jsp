<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="ressources/css/ManageRestaurants.css">
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
        <img src="1.png" class="mobile_profile_image" alt="">
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
      <div class="card">
        <div class="users-button">
          <button class=""><a href="AddUser.html">Add Restaurant</a></button>
          <button class="DisplayUsers"><a href="AddUser.html">Display Restaurant</a></button>
        </div>
        <table id="customers" class="pagination" data-pagecount="3">
            
          <tr>
            <th>Restaurant Name</th>
            <th>location</th>
            <th>Price Range</th>
            <th>Cuisine</th>
            <th>Good For</th>
            <th colspan="2">Action</th>
          </tr>
                        <c:forEach var="restau" items="${restaus}">

          <tr>
            <td>${restau.name}</th>
            <td>${restau.location}</th>
            <td>${restau.price}</th>
            <td>${restau.cuisine}</th>
            <td>${restau.good_for}</th>
            <td class="noBorder"><button class="btn-delete"> <i class="far fa-trash-alt"></i>Delete</button></td>
            <td class="noBorder"><button class="btn-approve"> <i class="fas fa-edit"></i>Edit</button></td>                
          </tr>
                                  </c:forEach>                        

          <tr>


        </table>
        

      </div>
    </div>

    <script type="text/javascript">


    $(document).ready(function(){
      $('.nav_btn').click(function(){
        $('.mobile_nav_items').toggleClass('active');
      });
    
    });

    $(document).ready(function() {  
    $('#customers').DataTable( {  
        initComplete: function () {  
            this.api().columns().every( function () {  
                var column = this;  
                var select = $('<select><option value=""></option></select>')  
                    .appendTo( $(column.footer()).empty() )  
                    .on( 'change', function () {  
                        var val = $.fn.dataTable.util.escapeRegex(  
                            $(this).val()  
                        );  
                //to select and search from grid  
                        column  
                            .search( val ? '^'+val+'$' : '', true, false )  
                            .draw();  
                    } );  
   
                column.data().unique().sort().each( function ( d, j ) {  
                    select.append( '<option value="'+d+'">'+d+'</option>' )  
                } );  
            } );  
        }  
    } );  
} ); 

    </script>

  </body>
</html>