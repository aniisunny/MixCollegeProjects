<%-- 
    Document   : owner
    Created on : Apr 17, 2019, 2:28:40 PM
    Author     : sidhu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>House Rental</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<!--
Template 2027 Melody
http://www.tooplate.com/view/2027-melody
-->
<link href="css/tooplate_style.css" rel="stylesheet" type="text/css" />
<link href="css/jquery.lightbox-0.5.css" rel="stylesheet" type="text/css" media="screen" /> 

<script type='text/javascript' src='js/jquery.min.js'></script>
<script type='text/javascript' src='js/jquery.scrollTo-min.js'></script>
<script type='text/javascript' src='js/jquery.localscroll-min.js'></script>
<script type="text/javascript" src="js/jquery.lightbox-0.5.js"></script> 

<script type="text/javascript">
$(document).ready(function () 
{
	$.localScroll();
	$('#map a').lightBox();
});
</script>

</head>
   
<body>
 <%
if(request.getParameter("m")!=null){%>
    
    <script>alert('Registration Success..!')</script>


<%}
if(request.getParameter("m1")!=null){%>

 <script>alert('Login Failed.. Username/Password Incorrect!')</script>
 <%
}
%>
<div id="tooplate_wrapper">
	<div id="tooplate_header">
    	<div id="top"></div>
		
        <div id="tooplate_menu">
            <ul>
              <li><a href="index_1.jsp">Home</a></li>
                <li><a href="owner.jsp">Owner</a></li>
                <li><a href="client.jsp">Client</a></li>
                <li><a href="customer.jsp">Customer</a></li>
                <li><a href="aboutus.jsp">About Us</a></li>
            </ul>    	
        </div> <!-- end of tooplate_menu -->
	<div id="site_title">
            <br>
            <font  size="7" color="black">Online House Rental Management</font>
             </div>
	</div>
        <div id="home"></div>
        <div class="content_box">
            <h2>Owner Login</h2>
                 
                        <br><br>
                        
           
                                <center>
                                    <form action="ownerlogin" method="post">
                            <table>
                               <tr>
                                    <td align="right"><font size="2" color="white"> User Name: </font>
                                    </td><td> 
                                    <input type="text" align="left" size="25" name="username" placeholder=UserName required /></td>
                                </tr>
                                <tr>
                                    <td align="right"><font size="2" color="white">Password:</font>
                                    </td><td> 
                                    <input type="password" align="left" size="25" name="password" placeholder=Password required /></td>
                                </tr>
                               <tr>
                                    <td>
                                        <input type="submit" value="Submit">
                                    </td>
                                     <td>
                                         <input type="reset" align="left" value='Reset'  />
                                    </td>
                                </tr>
                          </table> 
                                    </form>
                                    <br><a href="ownerregs.jsp"><font size="2">Click Here for Registration</a></br>
</center>
            
                                                                        
</div>
</body>
</html>
