<%-- 
    Document   : activateowner1
    Created on : Apr 21, 2019, 4:45:23 PM
    Author     : sidhu
--%>

<%@page import="java.sql.*"%>
<%@ page session="true" %>
 	<%
  		
   	try {
		   
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","");
                    Statement st = con.createStatement();
			String id=request.getParameter("id");
			String str = "Authorized";
       		
       		String query1 ="update register set status='"+str+"' where id="+id+" ";
	   		st.executeUpdate (query1);
			con.close();
			//response.sendRedirect("viewowner.jsp?m1=activated");  
			RequestDispatcher r=request.getRequestDispatcher("viewowner.jsp");
               r.forward(request, response);
			
	   		
       	}
      	catch(Exception e)
     	{
			out.println(e.getMessage());
   		}
   		
	%>
