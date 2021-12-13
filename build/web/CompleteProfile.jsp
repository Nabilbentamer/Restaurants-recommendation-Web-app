<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>CasaFoodie</title>

    <!------ Custom Style ------> 

    <link rel="stylesheet" href="ressources/css/CompleteProfile.css">

    <!----------- font awsome Icons -------->

    <link rel="stylesheet" href="ressources/css/all.css">

</head>


    <body>
<section>
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
                    <a href="#"><i class="fab fa-facebook-f"></i></a>
                    <a href="#"><i class="fab fa-instagram"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-youtube"></i></a>

                </div>


            
        </div>

    </nav>

    <!-----------xx---------- Navigation ------------xx------------>


    <!------------------------log in Form --------------------------

    <section class="login"> 
        
        <form action="uploadServlet" method="post" enctype="multipart/form-data">
            
        <input type="file" name="photo"> <br> 
        <input type="submit" value="upload file"> 
        
        <h2>${message}</h2>
        <img src="data:image/jpg;base64,${member.base64image}" width="240" height="300"/>

        
        
        
        </form> 
        
    </section>
---->

</section>

<main class="main-content">

<form class="signup-container" action="UserProfile" method="post" enctype="multipart/form-data">
    <!------------------------- left Area ---------------------------->
    <div class='left-container'>
      <h1>
        <i class="fas fa-utensils"></i>
        CasaFoodie
      </h1>
      <div class='puppy'>
        <img src=''>
      </div>
    </div>
    <!-----------xxx-------------- left Area ------------xxx---------------->


    <!------------------------------ Right Area ---------------------------------------->
    <div class='right-container'>
      <header>
        <h1>One More Step To Your Profile!</h1>

        <div class='set'>

          <div class='user-phone'>
            <label for='user-phone'>Phone Number</label>
            <input name="user-phone"  id='user-phone' placeholder="User's Phone" type='text'>
          </div>

          <div class='user-photo'>
            <button id='user-upload'>
              <i class='fas fa-camera-retro'></i>
            </button>
              <input type="file" name="photo">
          </div>
          
        </div>

        <div class='set'>

          <div class='user-City'>
            <label for='user-City'>City</label>
            <input id='user-City' placeholder="User's City" type='text' name="user-city">
          </div>


          <div class='user-name'>
            <label for='user-name'>State</label>
            <input id='user-name' placeholder="User's name" type='text' name="user-state">
          </div>



        </div>
        <div class='set'>
          <div class='user-gender'>
            <label for='user-gender-female'>Gender</label>

            <div class='radio-container'>
              <input checked='' id='user-gender-female' name='user-gender' type='radio' value='female'>
              <label for='user-gender-female'>Female</label>
              <input id='user-gender-male' name='user-gender' type='radio' value='male'>
              <label for='user-gender-male'>Male</label>
            </div>

          </div>
          
            <div class='user-birthday'>
                <label for='user-birthday'>Birthday</label>
                <input id='user-birthday' placeholder='YYYY/MM/DD' type='text' name="user-birthday">
              </div>

          
        </div>

      </header>

      <footer>

        <div class='set'>
          <button type="submit"  id='skip'>Skip</button>
          <button type="submit" id='next'>Save and continue</button>
        </div>

      </footer>
    </div>
    
    <!------------------------------ Right Area ---------------------------------------->

  </form>

  
</main> 

    <!--------------xx----------log in Form ------------------xx-------->



    


    
    </body>

</html>
