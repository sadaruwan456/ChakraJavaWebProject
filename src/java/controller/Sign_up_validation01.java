/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import hibernate.Customer;
import hibernate.NewHibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dsada
 */
public class Sign_up_validation01 extends HttpServlet {

   
  

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String email = request.getParameter("email");
            String pw = request.getParameter("pw");
            
            SessionFactory factory = NewHibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            Criteria criteria = session.createCriteria(Customer.class);
            criteria.add(Restrictions.eq("email", email));
            Customer customer = (Customer) criteria.uniqueResult();
            boolean validateEmail = model.Validation.validateEmail(email);
            boolean validatePassword = model.Validation.validatePassword(pw);
            
            String emailvalide = "";
            String pwvalidate = "";
            String already = "";
            
            if(customer==null){
                already="valid";
            }
            
            if(validateEmail){
                emailvalide = "valid";
                
            }else{
            emailvalide ="invalid";
            }
            
            if(validatePassword){
            pwvalidate = "valid";
            }else{
            pwvalidate = "invalid";
            }
            
            String [] data = {emailvalide,pwvalidate,already};
            Gson gson = new Gson();
            String jsons = gson.toJson(data);
            response.getWriter().write(jsons);
            
        } catch (Exception e) {
        }
    }

 

}
