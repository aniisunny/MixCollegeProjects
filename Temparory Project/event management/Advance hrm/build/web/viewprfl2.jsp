<%-- 
    Document   : viewprfl2
    Created on : Apr 17, 2019, 4:39:04 PM
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

   
    String username=String.valueOf(session.getAttribute("username"));
    
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
            <h2> <%=username%>'s Profile</h2>
            <table width="547" border="1.5" align="center"  cellpadding="0" cellspacing="0"  >
   <%@page import="java.sql.*"%>
   <%@ page session="true" %>
   
   <%
						
						
						
						String s1,s2,s3,s4,s5,s6;
						int i=0;
						try                                                    
                                                    
						{
                                                     Class.forName("com.mysql.jdbc.Driver");
                                                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","");
                                                        Statement st = con.createStatement();
						   	String query="select * from register where Uname='"+username+"'"; 
						   	
						   	ResultSet rs=st.executeQuery(query);
					   		if ( rs.next() )
					   		{
							
								
								s2=rs.getString(1);
								s3=rs.getString(2);
                                                                s4=rs.getString(6);
                                                                
								s5=rs.getString(7);
                                                                s6=rs.getString(10);
                                                                 s1=rs.getString(9);
							
								%>

        <tr>
          <td width="230" rowspan="6" ><div class="style7" style="margin:10px 13px 10px 13px;" ><a class="#" id="img1" href="#" >
              <input  name="image" type="image" src="Gallery/<%=s1%>" style="width:200px; height:200px;">
          </a></div></td>
        </tr>
        <tr>
          <td  width="145" valign="middle" height="40" style="color: #2c83b0;"><div align="left" class="style3 style4 style14 style7 style15 style20 style8 style9" style="margin-left:20px;"><strong>Id</strong></div></td>
          <td  width="164" valign="middle" height="40" style="color:#000000;"><div align="left" class="style23 style9 style10" style="margin-left:20px;">
        <%out.println(s2);%>
          </div></td>
        </tr>
        <tr>
          <td  width="145" valign="middle" height="40" style="color: #2c83b0;"><div align="left" class="style3 style4 style14 style7 style15 style20 style8 style9" style="margin-left:20px;"><strong>Name</strong></div></td>
          <td  width="164" valign="middle" height="40"><div align="left" class="style23 style9 style10" style="margin-left:20px;">
            <%out.println(s3);%>
          </div></td>
        </tr>
        <tr>
          <td  width="145" align="left" valign="middle" height="40" style="color: #2c83b0;"><div align="left" class="style3 style4 style14 style7 style15 style20 style8 style9" style="margin-left:20px;"><strong>E-Mail</strong></div></td>
          <td  width="164" align="left" valign="middle" height="40"><div align="left" class="style23 style9 style10" style="margin-left:20px;">
            <%out.println(s4);%>
          </div></td>
        </tr>
        <tr>
          <td  width="145" align="left" valign="middle" height="40" style="color: #2c83b0;"><div align="left" class="style3 style4 style14 style7 style15 style20 style8 style9" style="margin-left:20px;"><strong>Mobile</strong></div></td>
          <td  width="164" align="left" valign="middle" height="40"><div align="left" class="style23 style9 style10" style="margin-left:20px;">
          <%out.println(s5);%>  
          </div></td>
        </tr>
        <tr>
          <td   width="145" align="left" valign="middle" height="51" style="color: #2c83b0;"><div align="left" class="style3 style4 style14 style7 style15 style20 style8 style9" style="margin-left:20px;"><strong>Status</strong></div                        ></td>
          <td  width="164" align="left" valign="middle" height="51" style="color: #2c83b0;"><div align="left">
              <div align="left" class="style23 style9 style10" style="margin-left:20px;">
              <%out.println(s6);%>         
              </div></td>
        </tr>
       <%
						}
						con.close();
					}
					catch(Exception e)
					{
						out.println(e.getMessage());
					}
					%>
      </table>
                    
</div>
    </body>
</html>
