/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import com.sun.istack.internal.logging.Logger;

import java.io.IOException;
import java.io.PrintWriter;
//import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import sun.util.logging.PlatformLogger;

/**
 *
 * @author Dell
 */
public class register extends HttpServlet {

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
            
          //  Connection con=null;
            
             String deptname=request.getParameter("deptname");
              String name=request.getParameter("username");
               String mobile=request.getParameter("phoneno");
                String gender=request.getParameter("gender");
              String email=request.getParameter("email");
             String password=request.getParameter("psw");
              String repassword=request.getParameter("psw-repeat");
              String image=request.getParameter("image");
              
             
                   
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vendingmachine","root","");
                  
                  Statement st=conn.createStatement();
                  System.out.print("-------");
                   int  a=st.executeUpdate("insert into register values('"+name+"','"+mobile+"','"+gender+"','"+password+"','"+repassword+"','"+email+"','"+deptname+"','"+image+"')");
               
                   if(a>0)
                   {
                       RequestDispatcher r=request.getRequestDispatcher("ulogin.jsp");
                       r.forward(request, response);
                       
                   }
                   else
                   {
                     RequestDispatcher r=request.getRequestDispatcher("register.jsp");
                     r.include(request, response);
                   }
                   
                   System.out.println("===");
                   conn.close();
                  
              }
              
              catch(SQLException ex)
              {
                  Logger.getLogger(register.class.getName()).log(Level.SEVERE,null,ex);
              } catch (ClassNotFoundException ex) {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
              }}         
            
            
            
            /* TODO output your page here. You may use following sample code. */
           /* out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet register</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet register at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>"); */
        
    

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
