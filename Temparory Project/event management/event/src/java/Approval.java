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
public class Approval extends HttpServlet {

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
            String s9="approval";
            
          String id= request.getParameter("id");
            System.out.println(id);
            Class.forName("com.mysql.jdbc.Driver");
           Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vendingmachine","root","");
                  
             Statement st=con.createStatement();
           // ResultSet rs;
           // String sql="select * from bookingevent where bookingid='"+id+"'";
             int  a=st.executeUpdate("insert into approval(booking_id,dept_name,event_name,event_place,capcity,date,beg_time,end_time,status) select bookingid,deptname,event_type,event_place,capacity,date,begtime,endtime,'"+s9+"' from bookingevent where bookingid='"+id+"' ");
           
             // insert into approval (booking_id,dept_name,event) select b.event_type,b.event_place from bookingevent as b WHERE b.bookingid=1
            
             if(a>0)
             {
                 //st.executeUpdate("update approval set status='"+s9+"'  where bookingid='"+id+"' ");
           
                // System.out.println("hiiiii");
                st.executeUpdate("delete from bookingevent where bookingid='"+id+"' ");
                  RequestDispatcher r=request.getRequestDispatcher("viewbooking.jsp");
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
