/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class OtpCheck extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String otpn = request.getParameter("otp");
            String otps = (String) request.getSession().getAttribute("otpCode");
           if(otpn.equals(otps)){
               response.getWriter().write("valid");
           }else{
               response.getWriter().write("invalid");
           } 
           
        } catch (Exception e) {
        }
    }

}
