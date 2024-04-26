<%-- 
    Document   : gallery
    Created on : Apr 18, 2019, 5:33:10 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" href="img/express-favicon.png" type="image/x-icon" />
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>college events</title>

        <!-- Icon css link -->
        <link href="vendors/material-icon/css/materialdesignicons.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="vendors/linears-icon/style.css" rel="stylesheet">
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- Extra plugin css -->
        <link href="vendors/bootstrap-selector/bootstrap-select.css" rel="stylesheet">
        <link href="vendors/bootatrap-date-time/bootstrap-datetimepicker.min.css" rel="stylesheet">
        <link href="vendors/owl-carousel/assets/owl.carousel.css" rel="stylesheet">
        
        <link href="css/style.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style>
            p{text-align: justify;}
        </style>
            
    </head>
    <body>
       
       <div id="preloader">
            <div class="loader absolute-center">
                <div class="loader__box"><b class="top"></b></div>
                <div class="loader__box"><b class="top"></b></div>
                <div class="loader__box"><b class="top"></b></div>
            </div>
        </div>
       
        <!--================ Frist hader Area =================-->
        <div class="first_header">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <div class="header_contact_details">
                            <a href="table.html"><i class="fa fa-phone"></i>+91 (950) 111 5525</a>
                            <a href="event.html"><i class="fa fa-envelope-o"></i>+91 (950) 111 5526</a>
                        </div>
                    </div>
                    <div class="col-md-4">
                        
                    </div>
                    <div class="col-md-4">
                        <div class="header_social">
                            <ul>
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                                <li><a href="#"><i class="fa fa-rss"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--================End Footer Area =================-->
        
        <!--================End Footer Area =================-->
        <header class="main_menu_area">
            <nav class="navbar navbar-default">
                <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        </button>
                      
                        <a class="navbar-brand" href="#"><img src="img/logoo-1.png" alt=""></a>
                        <h2 style=color:red> COLLEGE EVENT VENUES</h2>
                        
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="home.jsp">Home</a></li>
                            <li class="dropdown submenu">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">About US <i class="fa fa-angle-down" aria-hidden="true"></i></a>
                                <ul class="dropdown-menu">
                                    <li><a href="about-us.jsp">About Us</a></li>
                             
                                </ul>
                            </li>
                            
                             <li class="dropdown submenu">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">register <i class="fa fa-angle-down" aria-hidden="true"></i></a>
                                <ul class="dropdown-menu">
                                    <li><a href="register.jsp">user register</a></li>
                                    
                                </ul>
                            </li>
                            
                             <li class="dropdown submenu">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Login <i class="fa fa-angle-down" aria-hidden="true"></i></a>
                                <ul class="dropdown-menu">
                                    
                                    <li><a href="ulogin.jsp">user Login</a></li>
                                    <li><a href="adminlogin.jsp">Admin Login</a></li>
                                    
                                </ul>
                            </li>
                           
                            <li class="active"><a href="gallery.html">Gallery</a></li>
                           
                           
                            <li><a href="contact.jsp">Contact US</a></li>
                            
                            <li><a href="home.jsp"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a></li>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>
        </header>
        <!--================End Footer Area =================-->
        
        <!--================Banner Area =================-->
        <section class="banner_area">
            <div class="container">
                <div class="banner_content">
                    <h4>Our Gallery</h4>
                    <a href="#">Home</a>
                    <a class="active" href="gallery.html">Gallery</a>
                </div>
            </div>
        </section>
        <!--================End Banner Area =================-->
        
        <!--================Our Gallery Area =================-->
        <section class="our_gallery_area">
            <div class="container">
                <div class="row our_gallery_ms_inner">
                    <div class="col-md-4 col-sm-6">
                        <div class="our_gallery_item">
                            <img src="img/gallery/our-ms-gallery/gallery-ms-1.jpg" alt="">
                            <div class="our_gallery_hover">
                                <a href="#"><i class="fa fa-link"></i></a>
                                <a href="#"><h5> vibgyor event</h5></a>
                                <p>THE BIGGEST INTERNATIONAL ANNUAL FESTIVAL OF INDIA.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="our_gallery_item">
                            <img src="img/gallery/our-ms-gallery/gallery-ms-2.jpg" alt="">
                            <div class="our_gallery_hover">
                                <a href="#"><i class="fa fa-link"></i></a>
                                <a href="#"><h5>About BFGI</h5></a>
                                <p>Baba Farid Group of Institutions, incepted in the year 1993 under the guidance of Baba Farid Vidayak Society, is one of the prominent education hubs in India.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="our_gallery_item">
                            <img src="img/gallery/our-ms-gallery/gallery-ms-3.jpg" alt="">
                            <div class="our_gallery_hover">
                                <a href="#"><i class="fa fa-link"></i></a>
                                <a href="#"><h5>technical event</h5></a>
                                <p>National Science Day for Debugging the code.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="our_gallery_item">
                            <img src="img/gallery/our-ms-gallery/gallery-ms-4.jpg" alt="">
                            <div class="our_gallery_hover">
                                <a href="#"><i class="fa fa-link"></i></a>
                                <a href="#"><h5>Youth fest</h5></a>
                                <p>Every Year BFGI Organized Youth Festival Events For All Departments.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="our_gallery_item">
                            <img src="img/gallery/our-ms-gallery/gallery-ms-5.jpg" alt="">
                            <div class="our_gallery_hover">
                                <a href="#"><i class="fa fa-link"></i></a>
                                <a href="#"><h5>NCC event</h5></a>
                                <p>#####</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="our_gallery_item">
                            <img src="img/gallery/our-ms-gallery/gallery-ms-6.jpg" alt="">
                            <div class="our_gallery_hover">
                                <a href="#"><i class="fa fa-link"></i></a>
                                <a href="#"><h5>Sport Event</h5></a>
                                <p>@@@##@#@</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="our_gallery_item">
                            <img src="img/gallery/our-ms-gallery/gallery-ms-7.jpg" alt="">
                            <div class="our_gallery_hover">
                                <a href="#"><i class="fa fa-link"></i></a>
                                <a href="#"><h5>Cultural event</h5></a>
                                <p>######.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="our_gallery_item">
                            <img src="img/gallery/our-ms-gallery/gallery-ms-8.jpg" alt="">
                            <div class="our_gallery_hover">
                                <a href="#"><i class="fa fa-link"></i></a>
                                <a href="#"><h5>party</h5></a>
                                <p>##</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="our_gallery_item">
                            <img src="img/gallery/our-ms-gallery/gallery-ms-9.jpg" alt="">
                            <div class="our_gallery_hover">
                                <a href="#"><i class="fa fa-link"></i></a>
                                <a href="#"><h5>technical event</h5></a>
                                <p>.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================End Our Gallery Area =================-->
        
        <!--================End Recent Blog Area =================-->
        <footer class="footer_area">
            <div class="footer_widget_area">
                <div class="container">
                    <div class="row">
                        <div class="col-md-3">
                            <aside class="f_widget about_widget">
                                <div class="f_w_title">
                                    <h4>ABOUT BFGI</h4>
                                </div>
                                <p>Baba Farid Group of Institutions, incepted in the year 1993 under the guidance of Baba Farid Vidayak Society, is one of the prominent education hubs in India. Founded, led and managed by a reputed educationist Dr. Gurmeet Singh Dhaliwal (Chairman), the institution is delivering the academic excellence with complete panache. Being the Leading Educational Institute of the Region, it is a preferred destination of Indian and international learners to attain their career goals.</p>
                                <ul>
                                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                    <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                                </ul>
                            </aside>
                        </div>
                        <div class="col-md-3">
                            <aside class="f_widget contact_widget">
                                <div class="f_w_title">
                                    <h4>CONTACT US</h4>
                                </div>
                                <p>Have questions, comments or just want to say hello:</p>
                                <ul>
                                    <li><a href="#"><i class="fa fa-envelope"></i>principal.bfcet@babafaridgroup.com</a></li>
                                    <li><a href="#"><i class="fa fa-phone"></i>+950111525</a></li>
                                    <li><a href="#"><i class="fa fa-map-marker"></i>Muktsar Road,<br /> Bathinda, Punjab 151001</a></li>
                                </ul>
                            </aside>
                        </div>
                        <div class="col-md-3">
                            <aside class="f_widget twitter_widget">
                                <div class="f_w_title">
                                    <h4>Twitter Feed</h4>
                                </div>
                                <ul>
                                    <li>
                                        <a href="#">@_BFFI:</a> bgfi
                                    </li>
                                    <li>
                                        <a href="#">@_BFCET:</a> bfcet                           
                                    </li>
                                </ul>
                            </aside>
                        </div>
                        <div class="col-md-3">
                            <aside class="f_widget gallery_widget">
                                <div class="f_w_title">
                                    <h4>Gallery </h4>
                                </div>
                                <ul>
                                    <li><a href="#"><img src="img/gallery/f-w-gallery/f-w-gallery-1.jpg" alt=""><i class="fa fa-search"></i></a></li>
                                    <li><a href="#"><img src="img/gallery/f-w-gallery/f-w-gallery-2.jpg" alt=""><i class="fa fa-search"></i></a></li>
                                    <li><a href="#"><img src="img/gallery/f-w-gallery/f-w-gallery-3.jpg" alt=""><i class="fa fa-search"></i></a></li>
                                    <li><a href="#"><img src="img/gallery/f-w-gallery/f-w-gallery-4.jpg" alt=""><i class="fa fa-search"></i></a></li>
                                    <li><a href="#"><img src="img/gallery/f-w-gallery/f-w-gallery-5.jpg" alt=""><i class="fa fa-search"></i></a></li>
                                    <li><a href="#"><img src="img/gallery/f-w-gallery/f-w-gallery-6.jpg" alt=""><i class="fa fa-search"></i></a></li>
                                </ul>
                            </aside>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copy_right_area">
                <div class="container">
                    <div class="pull-left">
                        <h5><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved |  <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
</p></h5>
                    </div>
                    
                </div>
            </div>
        </footer>
       
        <!--================End Recent Blog Area =================-->
        
        
        
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery-2.1.4.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <!-- Extra plugin js -->
        <script src="vendors/bootstrap-selector/bootstrap-select.js"></script>
        <script src="vendors/bootatrap-date-time/bootstrap-datetimepicker.min.js"></script>
        <script src="vendors/owl-carousel/owl.carousel.min.js"></script>
        <script src="vendors/isotope/imagesloaded.pkgd.min.js"></script>
        <script src="vendors/isotope/isotope.pkgd.min.js"></script>
        <script src="vendors/countdown/jquery.countdown.js"></script>
        <script src="vendors/js-calender/zabuto_calendar.min.js"></script>

        <script src="js/theme.js"></script>
    </body>
</html>
