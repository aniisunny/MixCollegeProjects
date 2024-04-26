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
import javax.swing.JOptionPane;

/**
 *
 * @author sidhu
 */
public class Addhouse extends HttpServlet {

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
             String s=request.getParameter("location");
           
            String s1=request.getParameter("category");
         
            String s2=request.getParameter("bedroom");
           
            String s3=request.getParameter("name");
           
            String s4=request.getParameter("Hno");
            
            String s5=request.getParameter("address");
            
            String s6=request.getParameter("mobile");
            
             String s8=request.getParameter("Rent");
             
            String s7=request.getParameter("image");
            
            String status="Not Booked";
            Connection con=null;
            PreparedStatement ps=null;
            Class.forName("com.mysql.jdbc.Driver");
  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","");
  ps=con.prepareStatement("insert into house values(?,?,?,?,?,?,?,?,?,?)");
   ps.setObject(1,s);
   ps.setObject(2,s1);
   ps.setString(3,s2);
   ps.setString(4,s3);
   ps.setString(5,s5);
   ps.setString(6,s4);
   ps.setString(7,s6);
   ps.setString(8,s8);
   ps.setString(9,s7); 
   ps.setString(10,status);
   int i=ps.executeUpdate();
   if(i>0)
   {
         RequestDispatcher r=request.getRequestDispatcher("ownerhome.jsp");
               r.forward(request, response);
   }
   else
   {
    RequestDispatcher r=request.getRequestDispatcher("Addhouse.jsp");
               r.include(request, response);
   }
     System.out.println("=============");
                  /* TODO output your page here. You may use following sample code. */
           /* out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Addhouse</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Addhouse at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
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
