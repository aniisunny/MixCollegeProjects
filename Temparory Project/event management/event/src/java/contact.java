/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class contact extends HttpServlet {

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
           
            
             String s1=request.getParameter("name");
          
          String s2=request.getParameter("phoneno");
            
          String s3=request.getParameter("email");
          
          String s4=request.getParameter("subject");
          
          String s5=request.getParameter("message");
          
         
        
          Connection con=null;
          PreparedStatement ps=null;
          
         Class.forName("com.mysql.jdbc.Driver");     //this is a package inside jara file which coomunicate java and database and dreive is only class(inside jar file)
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vendingmachine","root","");    //used for address(url)purpose pu
              
              ps=con.prepareStatement("insert into feedback values(?,?,?,?,?)");
              ps.setObject(1,s1);
              ps.setObject(2,s2);
              ps.setObject(3,s3);
              ps.setObject(4,s4);
              ps.setObject(5,s5);
             
              
              int i=ps.executeUpdate();
              if(i>0)
              {
                  RequestDispatcher r=request.getRequestDispatcher("home.jsp");
                  r.forward(request, response);
                  
              }
              else
              {
                  RequestDispatcher r=request.getRequestDispatcher("contact.jsp");
                  r.include(request, response);
              }
              System.out.println("===================");
              
            
            
            
            
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
          /*  out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet contact</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet contact at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>"); */
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

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
