<%-- 
    Document   : searchhouse
    Created on : Apr 24, 2019, 10:18:08 PM
    Author     : sidhu
--%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
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
            <h2>Results</h2>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>


<%
   String area=request.getParameter("area");
  
   ResultSet rs=null;
 try{
    
  Connection con = null;
   Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","");
    String status="Not Booked"; 
     System.out.println("2");
	PreparedStatement pst=con.prepareStatement("select * from house where location = '"+area+"' and status='"+status+"'");
        
        pst.execute();
        rs =pst.getResultSet();
	
      
    }catch(Exception e){
        e.printStackTrace();
        }
%>
<center>
<table>        
             <% while (rs.next()){

                 String category=rs.getString("Category");
                 String bedroom=rs.getString("Bedrooms");
                 String rent=rs.getString("Rent");
                  String Houseno=rs.getString("Hno");
                   String image=rs.getString("photo");
                 %>
            
           
            
            <tr width="100%">
                <td><img src="Gallery/<%=image%>" width="100" height="100"></td>
                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
               <td> <b> Category Name : &nbsp;</b>
                <b><%=rs.getString("category")%></b><br>  

                <b>Bedrooms: &nbsp;</b> <b><%=bedroom%></b><br>
                 <b>House no:&nbsp;</b><b><%=rs.getString("Hno")%></b><br/>
                    <b>Address: &nbsp;</b><b><%=rs.getString("Address")%></b><br/>
                     <b>Owner: &nbsp;</b><b><%=rs.getString("Name")%></b><br/>
                    <b>Mobile: &nbsp;</b><b><%=rs.getString("Mob")%></b><br/>
                    <b>Rent/monthly: &nbsp;</b><b><%=rs.getString("Rent")%></b><br/>
                    
                     
                </td>
            </tr>
            <tr> <td> 
                <button onclick="myFunction()"><a href=housestatus.jsp>Book Now</a></button>

<script>
function myFunction() {
  alert("Booking Success!");
}
</script>
            </td></tr> 
                
        <%}
        
            
        %> 
        
        </table>
        </center>
</div>
</div>
</body>
</html>
