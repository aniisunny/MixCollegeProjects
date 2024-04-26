<%-- 
    Document   : activatecustomer1
    Created on : Apr 21, 2019, 4:40:01 PM
    Author     : sidhu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@ page session="true" %>
 	<%
  		
   	try {
		   
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","");
                    Statement st = con.createStatement();
			String id=request.getParameter("id");
			String str = "Authorized";
       		
       		String query1 ="update customer set status='"+str+"' where id="+id+" ";
	   		st.executeUpdate (query1);
			con.close();
               RequestDispatcher r=request.getRequestDispatcher("viewcust.jsp");
               r.forward(request, response);			
//response.sendRedirect("viewcustomer.jsp?m1=activated");  
			
			
	   		
       	}
      	catch(Exception e)
     	{
			out.println(e.getMessage());
   		}
   		
	%>

