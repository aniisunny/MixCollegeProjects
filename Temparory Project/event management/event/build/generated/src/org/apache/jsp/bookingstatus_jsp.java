package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class bookingstatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"icon\" href=\"img/express-favicon.png\" type=\"image/x-icon\" />\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <title>college Events</title>\n");
      out.write("\n");
      out.write("        <!-- Icon css link -->\n");
      out.write("        <link href=\"vendors/material-icon/css/materialdesignicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"vendors/linears-icon/style.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <!-- Extra plugin css -->\n");
      out.write("        <link href=\"vendors/bootstrap-selector/bootstrap-select.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"vendors/bootatrap-date-time/bootstrap-datetimepicker.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"vendors/owl-carousel/assets/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <style>\n");
      out.write("            p{text-align: justify;}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=text-align:center;>\n");
      out.write("       \n");
      out.write("       <div id=\"preloader\">\n");
      out.write("            <div class=\"loader absolute-center\">\n");
      out.write("                <div class=\"loader__box\"><b class=\"top\"></b></div>\n");
      out.write("                <div class=\"loader__box\"><b class=\"top\"></b></div>\n");
      out.write("                <div class=\"loader__box\"><b class=\"top\"></b></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <!--================ Frist hader Area =================-->\n");
      out.write("        <div class=\"first_header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"header_contact_details\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-phone\"></i>+91 (950) 111 5525</a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-envelope-o\"></i>+91 (950) 111 5526</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"event_btn_inner\">\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"header_social\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-rss\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--================End Footer Area =================-->\n");
      out.write("        \n");
      out.write("        <!--================End Footer Area =================-->\n");
      out.write("        <header class=\"main_menu_area\">\n");
      out.write("            <nav class=\"navbar navbar-default\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                       \n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\"><img src=\"img/logoo-1.png\" alt=\"\"></a>\n");
      out.write("                        <h2 style=color:red> COLLEGE EVENT VENUES</h2>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                            <li><a href=\"userprofile.jsp\">user profile</a></li>\n");
      out.write("                             <li><a href=\"bookevent.jsp\">Book an event</a></li>\n");
      out.write("                             <li><a href=\"bookingstatus.jsp\">Booking status</a></li>\n");
      out.write("                            <li><a href=\"gallery.jsp\">Gallery</a></li>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                            <li><a href=\"contact.jsp\">Contact US</a></li>\n");
      out.write("                           \n");
      out.write("\n");
      out.write("                           <li><a href=\"home.jsp\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("                </div><!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!--================End Footer Area =================-->\n");
      out.write("        \n");
      out.write("        <!--================Banner Area =================-->\n");
      out.write("        <section class=\"banner_area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"banner_content\">\n");
      out.write("                    <h4>Information</h4>\n");
      out.write("                    <a href=\"#\">Related</a>\n");
      out.write("                    <a class=\"active\" href=\"#\">Status of event</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--================End Banner Area =================-->\n");
      out.write("        \n");
      out.write("        <!--================About Us Content Area =================-->\n");
      out.write("       <!--================End Recent Blog Area =================-->\n");
      out.write("       \n");
      out.write("           <br> <br>  \n");
      out.write("           <h1 style=color:red> here! Checking Booking status of your Event </h1> <br><br> \n");
      out.write("           \n");
      out.write("           \n");
      out.write("           <form align=\"center\">\n");
      out.write("           <label for=\"bookid\"> <b>Booking Id :&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; </b> </label>\n");
      out.write("           <input type=\"text\"placeholder=\"Enter booking Id\" name=\"id\"style=width:20%; required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       <input type=\"submit\" value=\"Search\" name=\"submit\">  <p id=\"a\" style=text-align:center;></p>     \n");
      out.write("           \n");
      out.write("       <br> <br>\n");
      out.write("       \n");
      out.write("       <table align=\"center\">\n");
      out.write("           <tr>\n");
      out.write("               <td><label for=\"status\"> <b> Show Status :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </b> </label></td>\n");
      out.write("        ");

            if(request.getParameter("submit")!=null)
            {
               
             String s1=request.getParameter("id"); 
                  try
                  {
                       Class.forName("com.mysql.jdbc.Driver");
           Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vendingmachine","root","");
                  
             Statement st=con.createStatement();
          
            // String sql="select status from bookingevent where bookingid='"+s1+"' union select status from approval where booking_id='"+s1+"' ";
           
         String sql="select status from bookingevent where bookingid='"+s1+"'union select status from approval where booking_id='"+s1+"' union select status from cancelevent where booking_id='"+s1+"' ";
            
           
            System.out.println("-----------");
           ResultSet  rs=st.executeQuery(sql);
           System.out.println(s1);
             if(rs.next())
             {
                 
            System.out.println(rs.getString("status"));
                  
      out.write("\n");
      out.write("                  \n");
      out.write("               \n");
      out.write("                  <td>\n");
      out.write("                      ");
      out.print(rs.getString("status"));
      out.write("\n");
      out.write("                  </td>\n");
      out.write("       \n");
      out.write("          ");
}
          else
            {
      out.write("\n");
      out.write("     \n");
      out.write("       \n");
      out.write("            ");
      out.print( "<script>document.getElementById('a').innerHTML = 'Wrong data'; </script>"   );
      out.write("\n");
      out.write("           \n");
      out.write("       \n");
      out.write("       ");

           }
           
                 } 
                  catch(ClassNotFoundException e)
                  {
                      e.printStackTrace();
                  }
                  catch(SQLException e)
                  {
                      e.printStackTrace();
}
}
                   
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("          \n");
      out.write("       </table>\n");
      out.write("           </form>            \n");
      out.write("       \n");
      out.write("       <footer class=\"footer_area\">\n");
      out.write("            <div class=\"footer_widget_area\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <aside class=\"f_widget about_widget\">\n");
      out.write("                                <div class=\"f_w_title\">\n");
      out.write("                                    <h4>ABOUT BFGI</h4>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Baba Farid Group of Institutions, incepted in the year 1993 under the guidance of Baba Farid Vidayak Society, is one of the prominent education hubs in India. Founded, led and managed by a reputed educationist Dr. Gurmeet Singh Dhaliwal (Chairman), the institution is delivering the academic excellence with complete panache. Being the Leading Educational Institute of the Region, it is a preferred destination of Indian and international learners to attain their career goals.</p>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </aside>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <aside class=\"f_widget contact_widget\">\n");
      out.write("                                <div class=\"f_w_title\">\n");
      out.write("                                    <h4>CONTACT US</h4>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Have questions, comments or just want to say hello:</p>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-envelope\"></i>principal.bfcet@babafaridgroup.com</a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-phone\"></i>+950111525</a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-map-marker\"></i>Muktsar Road,<br /> Bathinda, Punjab 151001</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </aside>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <aside class=\"f_widget twitter_widget\">\n");
      out.write("                                <div class=\"f_w_title\">\n");
      out.write("                                    <h4>Twitter Feed</h4>\n");
      out.write("                                </div>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">@_BFFI:</a> bgfi\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">@_BFCET:</a> bfcet                           \n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </aside>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <aside class=\"f_widget gallery_widget\">\n");
      out.write("                                <div class=\"f_w_title\">\n");
      out.write("                                    <h4>Gallery </h4>\n");
      out.write("                                </div>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\"><img src=\"img/gallery/f-w-gallery/f-w-gallery-1.jpg\" alt=\"\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><img src=\"img/gallery/f-w-gallery/f-w-gallery-2.jpg\" alt=\"\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><img src=\"img/gallery/f-w-gallery/f-w-gallery-3.jpg\" alt=\"\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><img src=\"img/gallery/f-w-gallery/f-w-gallery-4.jpg\" alt=\"\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><img src=\"img/gallery/f-w-gallery/f-w-gallery-5.jpg\" alt=\"\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><img src=\"img/gallery/f-w-gallery/f-w-gallery-6.jpg\" alt=\"\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </aside>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"copy_right_area\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"pull-left\">\n");
      out.write("                        <h5><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved |  <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("</p></h5>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("       \n");
      out.write("          \n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("        <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Extra plugin js -->\n");
      out.write("        <script src=\"vendors/bootstrap-selector/bootstrap-select.js\"></script>\n");
      out.write("        <script src=\"vendors/bootatrap-date-time/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("        <script src=\"vendors/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"vendors/isotope/imagesloaded.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"vendors/isotope/isotope.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"vendors/countdown/jquery.countdown.js\"></script>\n");
      out.write("        <script src=\"vendors/js-calender/zabuto_calendar.min.js\"></script>\n");
      out.write("        <!--gmaps Js-->\n");
      out.write("<!--        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE\"></script>-->\n");
      out.write("<!--        <script src=\"js/gmaps.min.js\"></script>-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!--        <script src=\"js/video_player.js\"></script>-->\n");
      out.write("        <script src=\"js/theme.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
