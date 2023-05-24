
package controller;

import hibernate.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class logOut extends HttpServlet {


  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Customer customer = (Customer) request.getSession().getAttribute("customer");
            
            if(customer!=null){
                request.getSession().invalidate();
                request.getRequestDispatcher("login_load.jsp").forward(request, response);
            }
        } catch (Exception e) {
        }
    }

   

}
