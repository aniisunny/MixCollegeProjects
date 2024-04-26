<%-- 
    Document   : Addhouse
    Created on : Apr 17, 2019, 2:06:48 PM
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
  <%
if(request.getParameter("m1")!=null){%>
    
    <script>alert('Added Success..!')</script>
  

<%}
if(request.getParameter("m2")!=null){%>

 <script>alert('Added Failed..!')</script>
 <%
}
%>   
<body>

<div id="tooplate_wrapper">
	<div id="tooplate_header">
    	<div id="top"></div>
		
        <div id="tooplate_menu">
            <ul>
               <li><a href="ownerhome.jsp">Home</a></li>
                 <li><a href="viewprfl2.jsp">View Profile</a></li>
                <li><a href="Addhouse.jsp">Add House</a></li>
                <li><a href="viewhouse.jsp">View House</a></li>                
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
            <h2>Add House</h2>
            
            <form action="Addhouse" method="post" ><center>
					  <table width="567">
                                            
                        <tr>
                          <td width="238" height="43">Location</td>
                          <td width="317">
                              <input id="Location" name="location" required class="text" placeholder="Location" /></td>
                        </tr>
                        
                        <tr>
                          <td height="43">Category</td>
                          <td><select id="gender" name="category" required style="width:170px;" class="text">
                                  <option value="">--Select--</option>
                                  <option value="Individual">Individual</option>
                                  <option value="Apartment">Apartment</option>
                          </select></td>
                        </tr>
                        <tr>
                          <td height="43">Bedrooms</td>
                          <td>
                          <input id="Bedrooms" name="bedroom" required class="text" placeholder="Bedrooms"/></td>
                        </tr>
                        <tr>
                          <td height="43">Name</td>
                          <td>
                              <input type="text"  name="name" required class="text" placeholder="Name"/></td>
                        </tr>
                        
                        <td height="65">House no</td>
                          <td>
                              <input id="address" name="Hno" required placeholder="House no"> 
                              </input></td>
                        </tr>
                        
                        <tr>
                          <td height="65">Address</td>
                          <td>
                              <input id="address" name="address" required placeholder="Address"> 
                              </input></td>
                        </tr>
                                               <tr>
                          <td height="65">Mobile</td>
                          <td>
                              <input type="text" name="mobile" required placeholder="Mobile"> 
                              </input></td>
                        </tr>
                           
                        <tr>
                          <td height="65">Rent</td>
                          <td>
                              <input type="text" name="Rent" required placeholder="rent"> 
                              </input></td>
                        </tr>  
                        
                                              <tr>
                          <td height="65">Image</td>
                          <td>
                              <input type="file" name="image" required>  
                              </input></td>
                        </tr>
                                              
                        <tr>
                          <td height="43" rowspan="3">
                            <p>&nbsp;</p></td>
                          <td align="left" valign="middle"> <p>&nbsp;
                            </p>
                            <p>
                              <input name="submit" type="submit" value="Add" />
                            </p>
                            <div align="right">
                           
                          </div></td>
                        </tr>
                                              </center>
                      </table>
            </form>
  
            </div>
        </div>
</body>
</html>
