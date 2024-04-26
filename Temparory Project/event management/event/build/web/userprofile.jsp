<%-- 
    Document   : userprofile
    Created on : Apr 18, 2019, 5:44:26 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" href="img/express-favicon.png" type="image/x-icon" />
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>college Events</title>

        <!-- Icon css link -->
        <link href="vendors/material-icon/css/materialdesignicons.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="vendors/linears-icon/style.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        
        <!-- Extra plugin css -->
        <link href="vendors/bootstrap-selector/bootstrap-select.css" rel="stylesheet">
        <link href="vendors/bootatrap-date-time/bootstrap-datetimepicker.min.css" rel="stylesheet">
        <link href="vendors/owl-carousel/assets/owl.carousel.css" rel="stylesheet">
        
        <link href="css/style.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
        
        <style>
              table {border-collapse:collapse;}
            
            table , th ,td {border: 0px solid black;}
            table{cellspacing:50%;}
            
            th,td{width: 20%;}
            th,td{height: 20%;}
            table{text-justify: center}; 
           table,th{text-align: center;}
           table{table-layout: fixed; width:60%;}
            p{text-align: justify;}
        </style>  
            
        
    </head>
    <body style=text-align:center;>
        
         <%
        String email=String.valueOf(session.getAttribute("uname"));
           
        %>
       
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
                            <a href="#"><i class="fa fa-phone"></i>+91 (950) 111 5525</a>
                            <a href="#"><i class="fa fa-envelope-o"></i>+91 (950) 111 5526</a>
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
                           
                           
                            <li><a href="userprofile.jsp">user profile</a></li>
                             <li><a href="bookevent.jsp">Book an event</a></li>
                             <li><a href="bookingstatus.jsp">Booking status</a></li>
                            <li><a href="gallery.jsp">Gallery</a></li>
                           
                           
                            <li><a href="contact.jsp">Contact US</a></li>
                             <li><a href="home.jsp">Logout</a></li>

                            <li><a href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a></li>
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
                    <h4>Information</h4>
                    <a href="#">Related</a>
                    <a class="active" href="#">USER Profile</a>
                </div>
            </div>
        </section>
        <!--================End Banner Area =================-->
        
        <!--================About Us Content Area =================-->
       <!--================End Recent Blog Area =================-->
      
      

<form action="">
  <div class="container">
      <br> <br>   <h1 style=color:red> User Profile Details</h1> <br><br>
      <%@ page import="java.sql.*"%>
      <%@page session="true" %>
      <%   
      String s1,s2,s3,s4,s5,s6;
      int i=0;
     
       try
       {
         
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vendingmachine","root","");
            Statement st=conn.createStatement();
                  System.out.print("-------");
                  String query="select * from register where email='"+email+"'";
                  
                  ResultSet rs=st.executeQuery(query);
                   if(rs.next())
                   {
                       s1=rs.getString(7);
                     s2=rs.getString(1);
                     s3=rs.getString(2);
                     s4=rs.getString(3);
                    s5=rs.getString(6);
                    s6=rs.getString(8);
                     
                   

                  
                  
           
       
       
      
      
      %>
      
    
    <table align="center" >
        
         <tr>
              <td width="145" height="40" valign="middle"><label for="image"><b>Image :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label></td>
              
   
              <td> <%out.println(s6); %></td>
               </tr>
          <tr>
              <td width="145" height="40" valign="middle"><label for="deptname"><b>Dept name :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label></td>
              
   
              <td> <%out.println(s1); %></td>
               </tr>
    
    
    <tr><td> <label for="name"><b>user name :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label> </td>
        <td width="145" height="40" valign="middle">   <%out.println(s2); %></td>
     
      </tr>

    <tr> <td> <label for="phone"><b>Phone no. :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>  </td>
        <td width="145" height="40" valign="middle"> <%out.println(s3); %> </td>
     </tr>
  
     
     <tr> <td>
     <label for="gender"><b>Gender   :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
         </td>
         <td width="145" height="40" valign="middle"> <%out.println(s4); %>
         </td>  </tr>
    <br>
    <tr> <td>
<label for="email"><b> Email Id  :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;   </b></label>
        </td> 
        <td width="145" height="40" valign="middle">  <%out.println(s5); %>  </td>
     </tr> 
    

    <tr>
        <td></td> <td> </td>
    </tr>
    <tr> </tr <tr> </tr> <tr> </tr>
    <tr>
        <td width="145" height="40" valign="middle" >
           </td>
    </tr>
    
     </table>
     <br> <br> 
     <button type="submit"width="145" height="40" valign="middle">Update</button> 
      
     <br> <br> <br>  
	  
	 
     
     <%
           }
            conn.close();
     }
       catch(Exception e)
        {
           out.println(e.getMessage());
        }

     
     %>
  </div>
  
  
</form>

       
       
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
        <!--gmaps Js-->
<!--        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>-->
<!--        <script src="js/gmaps.min.js"></script>-->
        
        
<!--        <script src="js/video_player.js"></script>-->
        <script src="js/theme.js"></script>
    </body>
</html>
        
        
        


