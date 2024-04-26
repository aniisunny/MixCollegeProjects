<%-- 
    Document   : ownerregs
    Created on : Apr 17, 2019, 4:27:23 PM
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
            <h2>Owner Registration Form</h2>
		  <form action=ownerreg method="post" ><center>
					  <table width="567">
                                            
                        <tr>
                          <td width="238" height="43">User Name</td>
                          <td width="317">
                          <input id="username" name="username" required class="text" placeholder="UserName" /></td>
                        </tr>
                        <tr>
                          <td height="43">Password</td>
                          <td>
                          <input type="password" id="password" required name="password" class="text" placeholder="Password"/></td>
                        </tr>
                        <tr>
                          <td height="43">Email</td>
                          <td>
                          <input type="email" id="email" name="email" required class="text" placeholder="Email" /></td>
                        </tr>
                        <tr>
                          <td height="43">Mobile</td>
                          <td>
                          <input id="mobile" name="mobile" class="text" required placeholder="Mobile"/></td>
                        </tr>
                        <tr>
                          <td height="43">Date of Birth</td>
                          <td>
                              <input type="date" id="dob" name="dob" required class="text" placeholder="DOB"/></td>
                        </tr>
                        <tr>
                          <td height="43">Gender</td>
                          <td><select id="gender" name="gender" required style="width:175px;" class="text">
                            <option>--Select--</option>
                            <option>MALE</option>
                            <option>FEMALE</option>
                          </select></td>
                        </tr>
                        <tr>
                          <td height="65">Address</td>
                          <td>
                              <textarea id="address" name="address" required rows="3" cols="30" placeholder="Address"> 
                              </textarea></td>
                        </tr>
                                              <tr>
                          <td height="65">Picture</td>
                          <td>
                              <input type="file" id="image" required name="image"> 
                              </input></td>
                        </tr>
                        <tr>
                          <td height="43" rowspan="3">
                            <p>&nbsp;</p></td>
                          <td align="left" valign="middle"> <p>&nbsp;
                            </p>
                            <p>
                              <input name="submit" type="submit" value="REGISTER" />
                            </p>
                            <div align="right">
                           
                          </div></td>
                        </tr>
                                              </center>
                      </table>
            </form>
          </center>
					</div>
</div>
</body>
</html>
