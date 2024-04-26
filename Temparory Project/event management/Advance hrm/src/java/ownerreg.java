/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sidhu
 */
public class ownerreg extends HttpServlet {

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
         
            String s2=request.getParameter("email");
           
            String s3=request.getParameter("mobile");
           
            String s4=request.getParameter("dob");
            
            String s5=request.getParameter("gender");
            
            String s6=request.getParameter("address");
             
            String s7=request.getParameter("image");
            
            String status="waiting";
         
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","");
           Statement stmt=con.createStatement();
            System.out.println("hiii---------");
           int rs=stmt.executeUpdate("insert into register(Uname,pwd,Dob,Gender,email,phoneno,Address,photo,status) values('"+s+"','"+s1+"','"+s4+"','"+s5+"','"+s2+"','"+s3+"','"+s6+"','"+s7+"','"+status+"')");
           if(rs>0)
           {
               RequestDispatcher r=request.getRequestDispatcher("owner.jsp");
               r.forward(request, response);
           }
           else
           {
                 RequestDispatcher r=request.getRequestDispatcher("ownerregs.jsp");
               r.include(request, response);
           }
            System.out.println("=============");
           
           con.close();
        }
               catch (Exception e) {
                   e.printStackTrace();
            
        }
            /* TODO output your page here. You may use following sample code. */
           /* out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ownerreg</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ownerreg at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
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
