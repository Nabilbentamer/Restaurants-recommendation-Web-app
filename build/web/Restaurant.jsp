<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
  <head>

    <title>Restau page</title>
    <!-- Fonts -->
    <link type="text/css" rel="stylesheet" href="ressources/css/Restaurant.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 

    <!-- CSS -->
    <link rel="stylesheet" href="../fontawesome/css/all.css">


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    // the first Event when click on add favorite send to post servlet 
  $(".ADDFAVORITE").click(function(){
      $.ajax({
    url: 'AddFavorite',
    type: 'POST',
    data: jQuery.param({ restauId: "2", memberID : "15"}) ,
    contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
    success: alert("all is good"),
    error: function () {
        alert("error");
    }
}); 
    
  });
  
  // This function will color the stars when they are checked.
    $(".checked").css("color","red");
    $(".unchecked").css("color","black");

    
  


});
</script>
  </head>

  <body>

    <main class="container">

      <!-- Left Column / Headphones Image -->

      <div class="left-column">
        <img src="ressources/images/${restau.image}" width="600" alt="">
      </div>


      <!-- Right Column -->
      <div class="right-column">

        <!-- Product Description -->
        
        <div class="Restaurant-description">
          <span>Restaurant/${restau.location}</span>
          <h1>${restau.name}</h1>
          <p>Original spot. Creative cuisine. Passionate service. A trip around cultures. All day every day brunch, lunch and dinner
          </p>
        </div>

        <!-- Product Configuration -->
        <div class="product-configuration">

          <!-- Product Color -->
          <div class="Price-range">

            
            

            <div class="Price">
              <span>Price Range</span> <br>
              <div>
                <span>${restau.price}</span>
              </div>
            </div>

            <div>
              <span>Good for </span><br> 
              <div> 
                <span>${restau.good_for}</span>
              </div> 


            </div>

          </div>

          <!-- Ratings and Reviews Details -->
          <div class="Rating-reviews-container">

            <span>Ratings And Reviews</span>
            <div class="Rating-buttons">
              <button>All rating <p>${AllRating} Reviews</p></button>
              <button>Positive Rating <p> ${PositiveRating}% </p> </button>
              <button>OverAll Rating <p> ${overAllRating}/5 </p></button>
            </div>

          </div>
        </div>

        <!-- Product Pricing -->

        <div class="user-buttons">
          <a href="#" class="cart-btn">write Review</a>
          <form id="myform">
              <button class="ADDFAVORITE"><a href="#" class="cart-btn" id="addfavorite" > Save to favorite </a></button>
          </form>

        </div>
      </div>
          
      
    </main>

    <div class="reviews-section-container">
        
            
    <div class="reviews-section">
        
            <c:forEach var="member" items="${allMembers}" varStatus="status">

      <div class="review-one">
          <div class="profile-image">
              <img src="data:image/jpg;base64,${member.base64image}" alt="">
              
              <p> ${member.uname}</p>
              
              <span class="review-number">${All_Members_Comment[status.index]}</span>
          </div>

          <div class="main-review">
                <div class="date-stars-section">
                    
                  <i class="fa fa-star ${Valueslist[status.index][0]}"></i>
                  <i class="fa fa-star ${Valueslist[status.index][1]}"></i>
                  <i class="fa fa-star checked ${Valueslist[status.index][2]}"></i>
                  <i class="fa fa-star checked ${Valueslist[status.index][3]}"></i>
                  <i class="fa fa-star checked ${Valueslist[status.index][4]}"></i>

              <p class="Review-date">Reviewed on ${All_Restaurant_Comments[status.index].date} </p>

              </div>

              <div class="review-content">
                  <h3> ${All_Restaurant_Comments[status.index].title}</h3>
                  <p> ${All_Restaurant_Comments[status.index].content}</p>
              </div>

          </div>
      </div>
              
            </c:forEach>

  </div>

</div>
              
              

  </body>
</html>
