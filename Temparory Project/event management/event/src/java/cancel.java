/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class cancel extends HttpServlet {

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
             
            String s9="cancelevent";
            
            String id= request.getParameter("id");
            System.out.println(id);
            Class.forName("com.mysql.jdbc.Driver");
           Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vendingmachine","root","");
                  
           Statement st=con.createStatement();
           // ResultSet rs;
           // String sql="select * from bookingevent where bookingid='"+id+"'";
           
             int  a=st.executeUpdate("insert into cancelevent(booking_id,dept_name,event_name,event_place,capacity,date,beg_time,end_time) select bookingid,deptname,event_type,event_place,capacity,date,begtime,endtime from bookingevent where bookingid='"+id+"' ");
          
            
             if(a>0)
             {
                 System.out.println("hiiiii");
                st.executeUpdate("delete from bookingevent where bookingid='"+id+"' ");
                  RequestDispatcher r=request.getRequestDispatcher("cancelevent.jsp");
                  r.include(request, response);
                  
             }
             else
             {
                 System.out.println("11111111111111");
             }
                  }
                  catch(ClassNotFoundException e)
                  {
                      e.printStackTrace();
                  }
                  catch(SQLException e)
                  {
                      e.printStackTrace();
                  }
            
            
        }
    
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
          /*  out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cancel</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cancel at " + request.getContextPath() + "</h1>");
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
