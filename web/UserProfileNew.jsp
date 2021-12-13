<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>  

    <link rel="stylesheet" href="ressources/css/Profile.css"> 
    <link rel="stylesheet" href="ressources/css/all.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 

    <title>Profile Space</title>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
     <script src="jquery.js"></script>
     
     <script>
         
         $(document).ready(function(){
             $('.nav ul li').click(function() {
    $(this).addClass("active").siblings().removeClass('active');
})



const tabBtn = document.querySelectorAll('.nav ul li');
const tab = document.querySelectorAll('.tab');

function tabs(panelIndex) {
    tab.forEach(function(node) {
        node.style.display = 'none';
    });
    tab[panelIndex].style.display = 'block';
}
tabs(0);




let bio = document.querySelector('.bio');

function bioText() {
    bio.oldText = bio.innerText;
    bio.innerText = bio.innerText.substring(0, 80) + "...";
    bio.innerHTML += "&nbsp;" + `<span onclick='addLength()' id='see-more-bio'> See More</span>`;
}
bioText();

function addLength() {
    bio.innerHTML = bio.oldText;
    bio.innerHTML += "&nbsp;" + `<span onclick='bioText()' id='see-less-bio'> See Less</span>`;
}
         });
        
    </script>
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
                        <img src="data:image/jpg;base64,${member.base64image}">
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

        <div class="profile-header">

            <div class="profile-image-main">
                <img src="./images/portrait3.jpg" >

            </div>


            <div class="profile-nav-info">

                <h3 class="user-name">${name}</h3>

                <div class="adress">
                    <p><i class="fas fa-map-marker-alt"></i></p>
                    <p class="State">${city} , , </p>
                    <p class="Country">    ${state}. </p>

                </div>

                <div class="user-statistic">
                    
                <ul class="list-items list1">
                    <li>Ratings</li>
                    <li>Comments</li>
                    <li>Favorites</li>
                    
                </ul>
                <ul class="list-items list2">
                    <li>2</li>
                    <li>2</li>
                    <li>1</li>
                    
                </ul>


                </div>

            </div>

            <div class="profile-option">
                <button class="Edit">Edit Profile</button>
                <i class="fas fa-cog Edit"></i>

            </div>



        </div>
        <div class="nav">
            <ul>
                <li onclick="tabs(0)" class="user-Favorites">Favorites</li>
                <li onclick="tabs(1)" class="user-comments active">Ratings and Comments</li>
            </ul>
        </div>

    <div class="main-content">

        <div class="left-side">

            <div class="basic-information">
                <h3>Intro </h3>
                <p class="date-join" ><i class="far fa-calendar-alt"></i> Joined in 26 Febrary 2021</p>
                <p class="profile-num"><i class="fa fa-phone"></i> ${phone} </p>
                <p class="profile-email"><i class="fa fa-envelope"></i> ${email} </p>
                <div class="user-bio">
                    <h3>Bio</h3>
                     <p class="bio"> ${bio}</p>
                 </div>
            </div>

            <div class="Reviews-image">
                <a  href="#"    class="image-add"><i class="fas fa-star"></i> Add Rating </a>
                <a href="#" class="Review-add"><i class="fas fa-edit"></i>  Add Comment</a>  


            </div>

        </div>


        <div class="right-side">
        

            <div class="profile-body">

                
                <div class="profile-posts tab">
                    <h2>Your favorite restaurant</h2>
                    <div class="flex-container">

                    <div class="card">
                        <div class="restau-image">
                            <img src="./images/restau1.jpg" alt="">
                        </div>

                        <div class="restau-info">
                            <div class="name-location">
                                <span class="restau-name">La Sqala Restau</span></br>
                                <span class="location" >Casablanca</span> 
                            </div>

                            <div class="price-range">
                                <span class="price"> Cheap</span>
                            </div>

                        </div>

                        <div class="restau-rating">
                            <div class="ratings-stars">
                                <i class="fas fa-star"></i>
                            </div>

                            <div class="ratings-totals">
                                <span class="review-total">127</span> Reviews
                            </div>

                        </div>
                        <div class="restau-bio">
                            Original spot. Creative cuisine. Passionate service. A trip around cultures. 

                        </div>
                        <div class="restau-delete">
                            <button class="delete-button">
                                <i class="fas fa-trash"></i>
                            </button>
                        </div>
                    </div>


                </div>

                </div>

                <div class="profile-comments">
                   <h2>Your comments and ratings</h2>
                   
        <div class="reviews-section">

            <div class="review-one">



                <div class="main-review">
                    <div class="date-stars-section">

                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star"></span>
                    <span class="fa fa-star"></span>
                    <p class="Review-date">Reviewed on December 19, 2021 </p>
                     <div class="restau-name-review">
                        <h3>La Sqala Restaurant</h3>

                     </div>   
                    </div>

                    <div class="review-content">
                        <h3> Recommended!!</h3>
                        <p>As mentioned by other reviewers the place is hidden , in a quite neighborhood, everything was wonderful for a late lunch from start to finish , the virgin drinks and food choices were fantastic , well deserved n 1 !


                        </p>
                    </div>

                </div>

            </div>
            <div class="review-one">



                <div class="main-review">
                    <div class="date-stars-section">

                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star"></span>
                    <span class="fa fa-star"></span>
                    <p class="Review-date">Reviewed on December 22, 2021 </p>
                     <div class="restau-name-review">
                        <h3>al Riyad Restaurant</h3>

                     </div>   
                    </div>

                    <div class="review-content">
                        <h3> worth every penny</h3>
                        <p>From start to finish, this was an amazing experience! My wife and I enjoy every bite. Quality, beautiful setting, peaceful location. Don't miss the IZIL vegetable soup with Argan oil and the ABABA ravioli. Absolutely delicious. Don't miss this high quality restaurant that provides unique.


                        </p>
                    </div>

                </div>

            </div>
                
        </div>
                </div>
            </div>
        </div>
    </div>
    
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

   
</body>
</html>