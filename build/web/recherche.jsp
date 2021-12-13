<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.foodie.servlets.recherche"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link type="text/css" rel="stylesheet" href="ressources/css/RecherchePage.css">
        
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
    <title>Main page</title>


</head>
<body>
    <div class="container">
        <nav class="nav-bar">
                 <div class="topnav">
        <a class="active" href="#home">Home</a>
        <a href="#about">About</a>
        <a href="#contact">Contact</a>
        <div class="search-container">
          <form class="input-container">
            <button type="submit"><i class="fa fa-search"></i></button>
            <input type="text" placeholder="Search.." name="search">
            
          </form>
        </div>
      </div>                   
        </nav>
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
            <div class="row">
                <img src="ressources/images/${restau.image}" alt="" class="mainimg">
                <div class="text-description">
                    
                    <h4><a href="<%= request.getContextPath()%>/Restaurant?restauId=${restau.id}&memberID=<%=session.getAttribute("id")%>">${status.count} . ${restau.name}</a> </h4>
                    
                    <div class="desc">
                        
                        <span class="fa fa-star " id="star"></span>
                        <span class="fa fa-star " id="star"></span>
                        <span class="fa fa-star " id="star"></span>
                        <span class="fa fa-star" id="star"></span>
                        <span class="fa fa-star" id="star"></span>
                        <span class="stars" >${TotalComments[status.index]} Reviews <span><br>
                                
 
                        <span>${restau.cuisine}</span>
                        <span class="price-range">${restau.price}</span>                    
                    </div>
                    <div class="border"></div>
                    <div class="reviews">
                        <div class="main-review">
                            <span class="fa fa-quote-right"></span>
                            
                            ${Comments[status.index][0].content}
                        </div>
                        <div class="main-review">
                            <i class="fa fa-quote-right"></i>
                            ${Comments[status.index][1].content}
                            </div>
                            
                            <div class="comment-section" >
                                <a href="<%= request.getContextPath()%>/AddCommentNew?restauId=${restau.id}&memberID=<%=session.getAttribute("id")%>"> Add a comment </a>
                            </div>    

                    </div>
                    </div>
               
                
                </div>
                    
            </c:forEach>
            
            
                
                       
        </main>
        <footer class="footer">footer</footer>
    </div>
                             
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
