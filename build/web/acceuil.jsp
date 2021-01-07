<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>CasaFoodie</title>

    <!------ Custom Style ------> 
    
    <link rel="stylesheet" href="ressources/css/style.css"/>

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


    <!--------------------- Image and content ------------------------>


    <div class="header">
        <div >
            
            <h2>Découvrez les meilleurs restaurants à Casablanca</h2>
            <a href="signup.jsp"><button type="button" class="bttn">S'inscrire</button></a>
            <a href="login.jsp"><button type="button" class="bttn">Se connecter</button></a>
        </div>
    </div>
        <div class="form-wrap">
            
            <h3>Où vous voulez manger?</h3>
        


        <form class="form-container">
            <!----
            <label>Location: </label>
            <select id="cars" name="cars">
                <option value="ok">Anfa</option>
                <option value="saab">Ain Sbaa</option>
                <option value="fiat">Centre ville</option>
                <option value="audi">Bernoussi</option>
              </select>-->
            <input type="text" name="location" placeholder="location">
            <input type="text" name="location" placeholder="price range">
            <input type="text" name="location" placeholder="type de cuisine">
            <input type="text" name="location" placeholder="good for:business meetings, family">
            <div class="button-chercher">
            <input type="button" value="Chercher" >
        </div>
        </form>

        </div>
    
</section>

    <!--------------------- Image and content ------------------------>


    <!---------------------Reviews Part ------------------------------->

    <div class="Reviews">

        <div class="inner">
            <h1>Reviews</h1>
        </div>
        <div class="border"></div>
        <div class="row">
            <div class="col">
                <div class="review">
                    <img src="ressources/images/portrait1.jpg" alt="">
                    
                    <div class="name">Carla</div>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus consectetur illum ipsum eius facilis totam quibusdam nobis. Cupiditate quibusdam totam cumque tenetur et provident accusamus. Cumque asperiores eligendi rerum a.</p>
                </div>
            </div>
            <div class="col">
                <div class="review">
                    <img src="ressources/images/portrait2.jpg" alt="">
                    <div class="name">John</div>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="far fa-star"></i>
                    </div>
                    <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Velit assumenda numquam at quis! Ut consequuntur consequatur necessitatibus temporibus nam exercitationem, voluptas assumenda aspernatur? Autem tenetur non labore? Praesentium, animi totam.</p>
                </div>
            </div>
            <div class="col">
                <div class="review">
                    <img src="ressources/images/portrait3.jpg" alt="">
                    <div class="name">Bruno</div>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="far fa-star"></i>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Laborum saepe itaque aut temporibus, necessitatibus iste incidunt dolores, laboriosam facilis libero reiciendis sunt voluptatum id molestias tenetur aliquam, adipisci ad suscipit!</p>
                </div>
            </div>
        </div>
    </div>


    <!--------xx-------------Reviews Part ------------------xx------------->



    <!-----------------------Categories Part ---------------------------->
        
    <div class="categories">
        <div class="inner">
            <h2>Browse our Top categories</h2>
        </div>
        <div class="border"></div>
        <div class="row">
            <div class="col1">
                <div class="category">
                    <img src="ressources/images/indian-food.jpg" alt="">
                    <div class="category-title">Indian food</div>

                </div>
            </div>
            <div class="col1">
                <div class="category">
                    <img src="ressources/images/chineese-food.jpg" alt="">
                    <div class="category-title">chineese-food</div>

                </div>
            </div>
            <div class="col1">
                <div class="category">
                    <img src="ressources/images/moroccan-food1.jpg" alt="">
                    <div class="category-title">Moroccan food</div>

                </div>
            </div>
        </div>
        <div class="row row1">
            <div class="col1">
                <div class="category">
                    <img src="ressources/images/indian-food.jpg" alt="">
                    <div class="category-title">Indian food</div>

                </div>
            </div>
            <div class="col1">
                <div class="category">
                    <img src="ressources/images/chineese-food.jpg" alt="">
                    <div class="category-title">chineese-food</div>

                </div>
            </div>
            <div class="col1">
                <div class="category">
                    <img src="ressources/images/moroccan-food1.jpg" alt="">
                    <div class="category-title">Moroccan food</div>

                </div>
            </div>
        </div>
        <button type="button" class="button-show">Show more</button>

    </div>


    <!------------xx-----------Categories Part -----------xx----------------->

     <!-------------xx----------------Main Site ----------------xx------------------>



    
    </body>
</html>