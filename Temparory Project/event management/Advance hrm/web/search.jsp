<%-- 
    Document   : search
    Created on : Apr 17, 2019, 4:28:31 PM
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

<div id="tooplate_wrapper">
	<div id="tooplate_header">
    	<div id="top"></div>
		
        <div id="tooplate_menu">
            <ul>
            <li><a href="customerhome.jsp">Home</a></li>
                <li><a href="viewprofl.jsp">View Profile</a></li>
                <li><a href="search.jsp">Search</a></li>                
                <li><a href="index_1.jsp">Logout</a></li>
            </ul>    	
        </div> <!-- end of tooplate_menu -->
	<div id="site_title">
            <br>
            <font  size="7" color="black">Online House Rental Management</font>
             </div>
	</div>
        <div id="home"></div>
        <div class="content_box">
            <h2>Search </h2>
                    <form action="searchhouse.jsp" method="post" id="adminact" >
                        <br><br>
                        <center>


                            <table>
                                <tr>
                                    <td align="right"><font size="2" color="white"> Enter Area: </font>
                                    </td><td> 
                                    <input type="text" align="left" size="25" name="area" placeholder="Area Name" required /></td>
                                </tr> <tr></tr> <tr></tr> <tr></tr> <tr></tr> <tr></tr> <tr></tr>
                                
                                <tr></tr> <tr></tr> <tr></tr>
                                <tr><td></td>
                                    <td>
                                       <center> <font size="2" color="green">
                                           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                       <input type="submit" form="adminact" align="right" value='Search' />
                                    </td>
                                     <td>
                                        <font size="2" color="green"> 
                                            
                                    </td>
                                </tr>
                            </center>
                                        
                                        </table><br>
</div>
</body>
</html>
