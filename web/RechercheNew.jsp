<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.foodie.servlets.recherche"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link type="text/css" rel="stylesheet" href="ressources/css/rechercheNew.css">     
    <link rel="stylesheet" href="ressources/all.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
    <title>Main page</title>


</head>
<body>
    <nav class="navbar ">
        <a href="#" class="navbar-brand"><i class="fa fa-ea"></i>Casa<b>Foodie</b></a>  		
    
        <div id="navbarCollapse" >
    
            <form class="navbar-form">
    
                <div class="search-box">								
                    <input type="text" id="search" placeholder="Search here...">
                    <span class="input-group-addon"><i class="fa fa-search"></i></span>
                </div>
                
            </form>
            
            <div class="navbar-nav">
                <a href="#" class="nav-item nav-link active"><i class="fa fa-home"></i><span>Home</span></a>
                <a href="#" class="nav-item nav-link"><i class="fa fa-users"></i><span>Contact Us</span></a>
                <a href="#" class="nav-item nav-link"><i class="fa fa-users"></i><span>Reviews</span></a>
    
                
                <div class="dropdown">
    
                    <a href="#" class="nav-item ">
                        <img src="./images/portrait3.jpg">
                        <span class="user-name-profile">${name}</span>
    
                    </a>
                    <div class="dropdown-menu">
                        <a href="#" class="dropdown-item"><i class="fas fa-user-alt"></i> Profile</a>
                        <a href="#" class="dropdown-item"><i class="fas fa-edit"></i> Edit Profile</a>
                        <a href="#" class="dropdown-item"><i class="fas fa-power-off"></i>Logout</a>
                    </div>
    
                </div>
            </div>
    
        </div>
    </nav>
    <div class="container">
         <input type="hidden" name="location" value="${location}"> 

        <div class="sidebar">
            
            <form action="rechercheParFiltrage" method="post" class="priceetcuisine" id="ok">
            
            <div class="wrapper" >
                
                <span class="title-restaurant-feature">Price</span>
                <div class="input-label">
                    
                    <input type="hidden" name="location" value="${location}">
                    
                    <input type="checkbox" name="checkBox_name" id="cheap" value="1" onclick="myFunction()"><label for="fine">Cheap Eats</label> 
            </div>
            <div class="input-label">
                
                <input type="checkbox" id="mid" name="checkBox_name" value="2" onclick="myFunction()" ><label for="fine">Mid range</label> 
            </div>
            <div class="input-label">
                
                <input type="checkbox" name="checkBox_name" value="3" id="high" onclick="myFunction()"><label for="fine">Fine</label> 
            </div>
            </div>
            
            
            <div class="border-separtor"></div>
            
            
            
            <div  class="wrapper">
                
                <span class="title-restaurant-feature">Cuisine</span>
                <div class="input-label">
                
                <input type="checkbox" id="moroccan" name="checkBox_name" value="4" onclick="myFunction()"><label for="marocaine">Moroccan</label> 
            </div>
            <div class="input-label">
                
                <input type="checkbox" id="italian" name="checkBox_name" value="5" onclick="myFunction()"><label for="francaise" >Italian</label> 
            </div>
            <div class="input-label">
                
                <input type="checkbox" id="spanish" name="checkBox_name" value="6" onclick="myFunction()"><label for="chinoise" >Spanish</label> 
            </div>

            </div>
            
            
            <div class="border-separtor"></div>

            <div class="wrapper">
                
                <span class="title-restaurant-feature">Good for </span>
                <div class="input-label">
                
                <input type="checkbox" id="Families" name="checkBox_name" value="7" onclick="myFunction()"><label for="cheap-Eats">Families with children</label> 
            </div>
            <div class="input-label">
                
                <input type="checkbox" id="Business" name="checkBox_name" value="8" onclick="myFunction()"><label for="cheap-Eats">Business meetings</label> 
            </div>
            <div class="input-label">
                
                <input type="checkbox" id="Kids" name="checkBox_name" value="9" onclick="myFunction()"><label for="cheap-Eats">Kids</label> 
            </div>

            </div>
</form>
            <div class="border-separtor"></div>


        </div>
                    
                    
        <main class="main">
            <c:forEach var="restau" items="${restaus}" varStatus="status">
            <div class="row-restau">
                <img src="ressources/images/${restau.image}" alt="" class="mainimg">
                <div class="text-description">
                    
                    <h4 class="restau-name"><a href="<%= request.getContextPath()%>/Restaurant?restauId=${restau.id}&memberID=<%=session.getAttribute("id")%>">${status.count} . ${restau.name}</a> </h4>
                    
                    <div class="desc">
                        
                        <span class="fa fa-star " id="star"></span>
                        <span class="fa fa-star " id="star"></span>
                        <span class="fa fa-star " id="star"></span>
                        <span class="fa fa-star" id="star"></span>
                        <span class="fa fa-star" id="star2"></span>
                        <span class="stars" >${TotalComments[status.index]} Reviews <span><br>
                                
 
                        <span class="cuisine-price">${restau.cuisine}</span>
                        <span class="price-range cuisine-price">${restau.price}</span>                    
                    </div>
                    <div class="border"></div>
                    <div class="reviews">
                        <div class="main-review">
                            <span class="fa fa-quote-right quotation"></span> "
                            
                           ${Comments[status.index][0].content}
                        </div>
                        <div class="main-review">
                            <i class="fa fa-quote-right quotation"></i>
                             ${Comments[status.index][1].content}
                            </div>
                            


                    </div>
                    </div>
               
                
                </div>
                                        
            </c:forEach>
            
            
                
                       
        </main>
        <!--<footer class="footer">footer</footer> --> 

          <!-- Site footer -->
    
        
    </div>

    <footer class="footer">
        <div class="container-footer">
          <div class="row">
            <div class="col-sm-12 col-md-6">
              <h6>About</h6>
              <p class="text-justify">Need a New Place to Eat Delicious Food? visit Our Restaurant. Make a Reservation Today! Our Restaurant Is Ideal For All Occasions With Delicious Food & Friendly Service. </p>
            </div>
  
            <div class="col-xs-6 col-md-3">
              <h6>Categories</h6>
              <ul class="footer-links">
                <li><a href="http://scanfcode.com/category/front-end-development/">Sign up</a></li>
                <li><a href="http://scanfcode.com/category/back-end-development/">Login</a></li>
                <li><a href="http://scanfcode.com/category/java-programming-language/">Find a Restaurant</a></li>
              </ul>
            </div>
  
            <div class="col-xs-6 col-md-3">
              <h6>Quick Links</h6>
              <ul class="footer-links">
                <li><a href="#">About Us</a></li>
                <li><a href="#">Contact Us</a></li>
                <li><a href="#">Reviews</a></li>
                <li><a href="#">Privacy Policy</a></li>

              </ul>
            </div>
          </div>
          <hr>
        </div>
        <div class="container-footer">
          <div class="row">
            <div class="col-md-8 col-sm-6 col-xs-12">
              
            </div>
  
            <div class="col-md-4 col-sm-6 col-xs-12">
              <ul class="social-icons">
                <li><a class="facebook" href="#"><i class="fa fa-facebook"></i></a></li>
                <li><a class="twitter" href="#"><i class="fa fa-twitter"></i></a></li>
                <li><a class="dribbble" href="#"><i class="fa fa-dribbble"></i></a></li>
                <li><a class="linkedin" href="#"><i class="fa fa-linkedin"></i></a></li>   
              </ul>
            </div>
          </div>
        </div>
  </footer>
                             

       <script>
        function myFunction() {
            document.getElementById('ok').submit();

        }
        
        //document.querySelectorAll("input[type='checkbox']").checked= <%= request.getAttribute("boolean")%>;
        document.getElementById('${value_id1}').checked = <%= request.getAttribute("boolean")%>;
        document.getElementById('${value_id2}').checked = <%= request.getAttribute("boolean")%>;
        document.getElementById('${value_id3}').checked = <%= request.getAttribute("boolean")%>;

 
                            
        
                        
    

    </script>
</body>
</html>
