/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernate.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dsada
 */
public class accLoginCheck extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            Customer customer = (Customer) request.getSession().getAttribute("customer");
            String status;
            if (customer == null) {
                status = "false";
                response.getWriter().write(status);
            }
            if (customer != null) {
                status = "true";
                response.getWriter().write(status);

            }


        } catch (Exception e) {
        }
    }

}
