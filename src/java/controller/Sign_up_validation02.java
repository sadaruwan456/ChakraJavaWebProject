/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dsada
 */
public class Sign_up_validation02 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            
            String fnameValid = "";
            String lnameValid = "";
            
            if (!fname.matches("[a-zA-Z_]+")) {
                fnameValid = "invalid";
            } else {
                fnameValid = "valid";

            }
            
            if(!lname.matches("[a-zA-Z_]+")){
                lnameValid = "invalid";
            }else{
            lnameValid = "valid";
            }
String [] data = {fnameValid,lnameValid};
            Gson gson = new Gson();
            String jsons = gson.toJson(data);
            response.getWriter().write(jsons);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
