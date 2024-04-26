/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sidhu
 */
public class ownerlogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String s=request.getParameter("username");
           
            String s1=request.getParameter("password");
            String status="waiting";
            String status1="Authorized";
         Connection con=null;
          HttpSession h1=request.getSession();
         Class.forName("com.mysql.jdbc.Driver");
  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","");
  Statement st=con.createStatement();
  ResultSet rs;
  String s2="select * from register where Uname='"+s+"' and pwd='"+s1+"' and status='"+status1+"'";
  rs=st.executeQuery(s2);
 if(rs.next())
 {
      h1.setAttribute("username", rs.getString("Uname"));
    RequestDispatcher r=request.getRequestDispatcher("ownerhome.jsp?m=success");
               r.forward(request, response);
 }
 else
 {
      String s3="select * from register where Uname='"+s+"' and pwd='"+s1+"' and status='"+status+"'";
  rs=st.executeQuery(s3);

               
               if(rs.next())
			{
			out.print("Sorry You are not authorized user");
			
			}
			else
			{
				response.sendRedirect("customer.jsp?m1=Failed");
			}
  
   }
            /* TODO output your page here. You may use following sample code. */
           /* out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ownerlogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ownerlogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
        }
        catch(Exception e)
 {
     System.out.println(e);
 }
    }
            /* TODO output your page here. You may use following sample code. */
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ownerlogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ownerlogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
