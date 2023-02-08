<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Yummy Bootstrap Template - Index</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,600;1,700&family=Amatic+SC:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&family=Inter:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/main.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name:  - v1.2.1
  * Template URL: https://bootstrapmade.com/-bootstrap-restaurant-website-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="header fixed-top d-flex align-items-center">
    <div class="container d-flex align-items-center justify-content-between">

      <a href="index.html" class="logo d-flex align-items-center me-auto me-lg-0">
        <!-- Uncomment the line below if you also wish to use an image logo -->
        <!-- <img src="assets/img/logo.png" alt=""> -->
        <h1>Yummy kitchen<span>.</span></h1>
      </a>

      <nav id="navbar" class="navbar">
        <ul>
          <li><a href="Index.jsp">Home</a></li>
          <li><a href="#about">About</a></li>
          <li><a href="#menu">Menu</a></li>
          <li><a href="#events">Events</a></li>
          <li><a href="#chefs">Chefs</a></li>
          <li><a href="#gallery">Gallery</a></li>
         
          <li><a href="#contact">Contact</a></li>
        </ul>
      </nav><!-- .navbar -->

      <a class="btn-book-a-table" href="#book-a-table"> Table</a>
      <i class="mobile-nav-toggle mobile-nav-show bi bi-list"></i>
      <i class="mobile-nav-toggle mobile-nav-hide d-none bi bi-x"></i>

    </div>
  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->
 
 <section id="menu" class="menu">
      <div class="container" data-aos="fade-up">

        <div class="section-header">
          <h2>Our Menu</h2>
          <p>Check Our <span>Yummy Menu</span></p>
        </div>

        <ul class="nav nav-tabs d-flex justify-content-center" data-aos="fade-up" data-aos-delay="200">

          <li class="nav-item">
            <a class="nav-link active show" data-bs-toggle="tab" data-bs-target="#menu-starters">
              <h4>Starters</h4>
            </a>
          </li><!-- End tab nav item -->

          <li class="nav-item">
            <a class="nav-link" data-bs-toggle="tab" data-bs-target="#menu-breakfast">
              <h4>Breakfast</h4>
            </a><!-- End tab nav item -->

          <li class="nav-item">
            <a class="nav-link" data-bs-toggle="tab" data-bs-target="#menu-lunch">
              <h4>Lunch</h4>
            </a>
          </li><!-- End tab nav item -->

          <li class="nav-item">
            <a class="nav-link" data-bs-toggle="tab" data-bs-target="#menu-dinner">
              <h4>Dinner</h4>
            </a>
          </li><!-- End tab nav item -->

        </ul>

        <div class="tab-content" data-aos="fade-up" data-aos-delay="300">

          <div class="tab-pane fade active show" id="menu-starters">

            <div class="tab-header text-center">
              <p>Menu</p>
              <h3>Starters</h3>
            </div>

            <div class="row gy-5">

 		<c:forEach var="all" items="${allMenu}">
        	<c:set var = "name" value="${all.name}"/>
        	<c:set var = "id" value="${all.id}"/>        	      	
        	<c:set var = "picName" value="${all.picName}"/>
        	<c:set var = "sellerID" value="${all.sellerID}"/>
        	<c:set var = "price" value="${all.price}"/>
        	<c:set var = "description" value="${all.description}"/>
        	<c:set var = "category" value="${all.category}"/>
        	
        	
        	<c:url value="viewFood.jsp" var="orderNow">
        	<c:param name="name" value = "${name}"/>
        	<c:param name="id" value = "${id}"/>
        	<c:param name="picName" value = "${picName}"/>
        	<c:param name="sellerID" value = "${sellerID}"/>
        	<c:param name="price" value = "${price}"/>
        	<c:param name="description" value = "${description}"/>
        	<c:param name="category" value = "${category}"/>                	     	
        </c:url>
        	

             <div class="col-lg-4 menu-item">
              <a href = "${orderNow}">
                <img src="images/${all.picName}" class="menu-img img-fluid" alt="" style='border : px solid #ddd ; border-radius : 80px ; padding : 3px ; width : 150px; height : 150px ;'>
                <h4>${all.name}</h4>
                <p class="ingredients">
                  
                </p>
                <p class="price">
                  LKR${all.price}
                </p>
              </a>
              </div><!-- Menu Item -->
              
          </c:forEach>

              

            </div>
          </div><!-- End Starter Menu Content -->

          <div class="tab-pane fade" id="menu-breakfast">

            <div class="tab-header text-center">
              <p>Menu</p>
              <h3>Breakfast</h3>
            </div>

            <div class="row gy-5">

          <c:forEach var="all" items="${breakfastMenu}">
        	<c:set var = "name" value="${all.name}"/>
        	  <c:set var = "id" value="${all.id}"/>    	
        	<c:set var = "picName" value="${all.picName}"/>
        	<c:set var = "sellerID" value="${all.sellerID}"/>
        	<c:set var = "price" value="${all.price}"/>
        	<c:set var = "description" value="${all.description}"/>
        	<c:set var = "category" value="${all.category}"/>
        	
   
              <div class="col-lg-4 menu-item">
              <a href = "${orderNow}">
                <img src="images/${all.picName}" class="menu-img img-fluid" alt="" style='border : px solid #ddd ; border-radius : 80px ; padding : 3px ; width : 150px; height : 150px ;'>
                <h4>${all.name}</h4>
                <p class="ingredients">
                  
                </p>
                <p class="price">
                  LKR${all.price}
                </p>
              </a>
              </div><!-- Menu Item -->
            
          </c:forEach>
              

            </div>
          </div><!-- End Breakfast Menu Content -->

          <div class="tab-pane fade" id="menu-lunch">

            <div class="tab-header text-center">
              <p>Menu</p>
              <h3>Lunch</h3>
            </div>

            <div class="row gy-5">

              <c:forEach var="all" items="${lunchMenu}">
        	<c:set var = "name" value="${all.name}"/>
        	 <c:set var = "id" value="${all.id}"/>     	
        	<c:set var = "picName" value="${all.picName}"/>
        	<c:set var = "sellerID" value="${all.sellerID}"/>
        	<c:set var = "price" value="${all.price}"/>
        	<c:set var = "description" value="${all.description}"/>
        	<c:set var = "category" value="${all.category}"/>

             <div class="col-lg-4 menu-item">
              <a href = "${orderNow}">
                <img src="images/${all.picName}" class="menu-img img-fluid" alt="" style='border : px solid #ddd ; border-radius : 80px ; padding : 3px ; width : 150px; height : 150px ;'>
                <h4>${all.name}</h4>
                <p class="ingredients">
                  
                </p>
                <p class="price">
                  LKR${all.price}
                </p>
              </a>
              </div><!-- Menu Item -->
              
          </c:forEach>

             
            </div>
          </div><!-- End Lunch Menu Content -->

          <div class="tab-pane fade" id="menu-dinner">

            <div class="tab-header text-center">
              <p>Menu</p>
              <h3>Dinner</h3>
            </div>

            <div class="row gy-5">

                <c:forEach var="all" items="${dinnerMenu}">
        	<c:set var = "name" value="${all.name}"/>
        	 <c:set var = "id" value="${all.id}"/>     	
        	<c:set var = "picName" value="${all.picName}"/>
        	<c:set var = "sellerID" value="${all.sellerID}"/>
        	<c:set var = "price" value="${all.price}"/>
        	<c:set var = "description" value="${all.description}"/>
        	<c:set var = "category" value="${all.category}"/>
        	

             <div class="col-lg-4 menu-item">
              <a href = "${orderNow}">
                <img src="images/${all.picName}" class="menu-img img-fluid" alt="" style='border : px solid #ddd ; border-radius : 80px ; padding : 3px ; width : 150px; height : 150px ;'>
                <h4>${all.name}</h4>
                <p class="ingredients">
                  
                </p>
                <p class="price">
                  LKR${all.price}
                </p>
              </a>
              </div><!-- Menu Item -->
              
          </c:forEach>

             

            </div>
          </div><!-- End Dinner Menu Content -->

        </div>

      </div>
    </section><!-- End Menu Section -->
 
  <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">

    <div class="container">
      <div class="row gy-3">
        <div class="col-lg-3 col-md-6 d-flex">
          <i class="bi bi-geo-alt icon"></i>
          <div>
            <h4>Address</h4>
            <p>
              Panukarapitiya <br>
              Rathnapura<br>
            </p>
          </div>

        </div>

        <div class="col-lg-3 col-md-6 footer-links d-flex">
          <i class="bi bi-telephone icon"></i>
          <div>
            <h4>Reservations</h4>
            <p>
              <strong>Phone:</strong> +1 5589 55488 55<br>
              <strong>Email:</strong> info@example.com<br>
            </p>
          </div>
        </div>

        <div class="col-lg-3 col-md-6 footer-links d-flex">
          <i class="bi bi-clock icon"></i>
          <div>
            <h4>Opening Hours</h4>
            <p>
              <strong>Mon-Sat: 11AM</strong> - 23PM<br>
              Sunday: Closed
            </p>
          </div>
        </div>

        <div class="col-lg-3 col-md-6 footer-links">
          <h4>Follow Us</h4>
          <div class="social-links d-flex">
            <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
            <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
            <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
            <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></a>
          </div>
        </div>

      </div>
    </div>

    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong><span>Yummy</span></strong>. All Rights Reserved
      </div>
      <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/yummy-bootstrap-restaurant-website-template/ -->
        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
      </div>
    </div>

  </footer><!-- End Footer -->
  <!-- End Footer -->

  <a href="#" class="scroll-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <div id="preloader"></div>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/aos/aos.js"></script>
  <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
  <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>