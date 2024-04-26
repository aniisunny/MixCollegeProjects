<%-- 
    Document   : housestatus
    Created on : Apr 24, 2019, 8:59:56 PM
    Author     : sidhu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@ page session="true" %>
 <%
  		
   	try {
		   
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","");
                        Statement st = con.createStatement();
			//String id=request.getParameter("id");
			String str = "Booked";
       		
       		String query1 ="update house set status='"+str+"'";
	   		st.executeUpdate (query1);
			con.close();
             		
RequestDispatcher r=request.getRequestDispatcher("customerhome.jsp");
               r.forward(request, response);  
			
			
	   		
       	}
      	catch(Exception e)
     	{
			out.println(e.getMessage());
   		}
   		
	%>
