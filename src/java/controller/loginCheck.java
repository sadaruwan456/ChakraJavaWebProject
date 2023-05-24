/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class loginCheck extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String un = request.getParameter("un");
            String pw = request.getParameter("pw");
            
            System.out.println(un);
            System.out.println(pw);
            
            SessionFactory factory = NewHibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            
            Criteria criteria1 = session.createCriteria(Customer.class);
            criteria1.add(Restrictions.eq("email", un));
            criteria1.add(Restrictions.eq("password", pw));
            Customer customer = (Customer) criteria1.uniqueResult();
            
            String status;
           
            if(customer!=null){
                status = "true";
               request.getSession().setAttribute("customer", customer);
                
            }else{
            status = "false";
            }
            response.getWriter().write(status);
            
          
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   

}
