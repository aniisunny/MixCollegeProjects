<%-- 
    Document   : viewhouse
    Created on : Apr 17, 2019, 4:37:06 PM
    Author     : sidhu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
<%

   
    String name=String.valueOf(session.getAttribute("name"));
    
    %>
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
            <h2>House Details</h2>
<%@ page import ="java.sql.*" %>
<%
   
   ResultSet rs=null;
 try{
    
  Connection con = null;
 Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","");
     
     System.out.println("2");
	PreparedStatement pst=con.prepareStatement("select * from house ");
        
        pst.execute();
        rs =pst.getResultSet();

    }
 catch(Exception e){
        e.printStackTrace();
        }
%>
<center>
<table>        
         <% while(rs.next()){

                 String category=rs.getString("Category");
                 String bedroom=rs.getString("Bedrooms");
                 String Location=rs.getString("Location");
                 String Owner=rs.getString("Name");
                 String status=rs.getString("status");
                 
                 %>
            
            <%
            String image=rs.getString("photo");
           
            %>
            <tr width="100%">
                <td><img src="Gallery/<%=image%>" width="100" height="100"> </td>
       
               
                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
               <td> <b>Location: &nbsp;</b><b><%=Location%></b><br> <b> Category : &nbsp;<b><%=rs.getString("Category")%></b></b>
                <br>  
 
                <b>Bedrooms: &nbsp;</b><b><%=bedroom%></b><br>
                
                    <b>Address: &nbsp;</b><b><%=rs.getString("Address")%></b><br/>
                     <b>Owner: &nbsp;</b><b><%=Owner%></b><br>
                    <b>Mobile: &nbsp;</b><b><%=rs.getString("Mob")%></b><br/>

                </td>
            </tr>
            <tr><td><b>Status: &nbsp;</b><%=status%></td></tr>
            </tr>
        <%}
        
            
        %> 
        </table>
        </div>    
    </body>
</html>
