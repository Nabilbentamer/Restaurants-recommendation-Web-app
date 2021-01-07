<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>CasaFoodie</title>

    <!------ Custom Style ------> 

    <link rel="stylesheet" href="ressources/css/style_login.css">

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


    <!------------------------log in Form -------------------------->

    <section class="login"> 
        <div class="login-wrap">
            <h2>Log in to CasaFoodie</h2>
            <div class="border"></div>
            <h4>New to casaFoodie? <a href="signup.jsp">Sign up</a></h4>
            <form action="afterlogin" class="login-container" method="post">
                <input type="text" placeholder="Email" name="email">
                <input type="text" placeholder="Password" name="password">
                <div>${message}</div>
                <input type="submit" value="Se connecter" style="font-size: 16px; padding: 5px; background-color: var(--main-color);">

            </form>

        </div>

        <div class="image-back">
            <img src="ressources/images/food.jpg" alt=""  >
        </div>
    </section>

</section>
    <!--------------xx----------log in Form ------------------xx-------->



    


    
    </body>
</html>
