<%-- 
    Document   : viewcust
    Created on : Apr 17, 2019, 4:36:00 PM
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

<div id="tooplate_wrapper">
	<div id="tooplate_header">
    	<div id="top"></div>
		
        <div id="tooplate_menu">
            <ul>
                <li><a href="clienthome.jsp">Home</a></li>
                <li><a href="viewowner.jsp">View Owner</a></li>
                <li><a href="viewcustomer.jsp">View Customer</a></li>                
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
            <h2>View & Activate</h2>
           <table width="564" border="1" align="center"  cellpadding="0" cellspacing="0"  >
          <tr>
            <td  width="39"  valign="bottom" height="34" style="color: pink"><div align="center" class="style15 style21 style7 style6 style5">ID</div></td>
            <td  width="118" valign="bottom" height="34" style="color: pink"><div align="center" class="style15 style21 style7 style6 style5">User Image</div></td>
            <td  width="112" valign="bottom" height="34" style="color: pink"><div align="center" class="style15 style21 style7 style6 style5">User Name</div></td>
            <td  width="100" valign="bottom" height="34" style="color: pink"><div align="center" class="style15 style21 style7 style6 style5">Email</div></td>
            <td  width="108" valign="bottom" height="34" style="color: pink"><div align="center" class="style15 style21 style7 style6 style5">Mobile</div></td>
            <td  width="100"  valign="bottom" height="34" style="color: pink"><div align="center" class="style15 style21 style7 style6 style5">Status</div></td>
          </tr>
      <%@page import="java.sql.*"%>
      <%@ page session="true" %>
      <%
					  
						String s1,s2,s3,s4,s5,s6;
						int i=0;
						try 
						
                                                {     
                                                       Class.forName("com.mysql.jdbc.Driver");
                                                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","");
                                                
						   	String query="select * from customer"; 
						   	Statement st=con.createStatement();
						   	ResultSet rs=st.executeQuery(query);
					   		while ( rs.next() )
					   		{
								i=rs.getInt(1);
								s1=rs.getString(2);
								s2=rs.getString(4);
								s3=rs.getString(6);
								s4=rs.getString(9);
								s5=rs.getString(10);
								
		
					%>
  
          <tr>
            <td  valign="baseline" height="0"><p class="style22 style4 style5">&nbsp;</p>
                <div align="center" class="style22 style4 style5">
                <%out.println(i);%>

               </div></td>
            <td width="118" rowspan="1" ><div class="style22 style4 style5" style="margin:10px 13px 10px 13px;" > <a class="#" id="img1" href="#" >
                <input  name="image" type="image" src="Gallery/<%=s4%>" style="width:90px; height:90px;">
            </a> </div></td>
            <td  valign="baseline" height="0"><p class="style22 style4 style5">&nbsp;</p>
                <div align="center" class="style22 style4 style5">
                <%out.println(s1);%>   
                
                </div></td>
            <td  valign="baseline" height="0"><p class="style22 style4 style5">&nbsp;</p>
                <div align="center" class="style22 style4 style5">
                <%out.println(s2);%> 
                  <p>&nbsp; </p>
                </div></td>
            <td  valign="baseline" height="0"><p class="style22 style4 style5">&nbsp;</p>
                <div align="center" class="style22 style4 style5">
                 <%out.println(s3);%> 
                  <p>&nbsp; </p>
                </div></td>
           <%
						if(s5.equalsIgnoreCase("waiting"))
						{
						
						%>
            <td  width="100" valign="baseline" height="0" style="color:#000000;"align="center"><div align="center" class="style22 style4 style5">
                <p>&nbsp;</p>
            <a href="activatecustomer1.jsp?id=<%=i%>">waiting</a> </div></td>
            <%
						}
						else
						{
						%>
            <td width="71" height="0"  valign="baseline"><p class="style22 style4 style5">&nbsp;</p>
                <div align="center" class="style22 style4 style5">
                 <%out.println(s5);%>    
            </div></td>
             <%
						}
						%>
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
                             
            <tr>
            <td  valign="baseline" height="0">&nbsp;</td>
            <td  valign="baseline" height="0">&nbsp;</td>
            <td  valign="baseline" height="0">&nbsp;</td>
            <td  valign="baseline" height="0">&nbsp;</td>
            <td  valign="baseline" height="0">&nbsp;</td>
            <td  valign="baseline" height="0">&nbsp;</td>
</tr>
                    
        </table>
        </div>
    </body>
</html>
