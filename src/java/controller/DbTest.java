/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernate.Admin;
import hibernate.NewHibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author dsada
 */
public class DbTest extends HttpServlet {

  
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String name = request.getParameter("un");
            String pw = request.getParameter("pw");
            System.out.println(name);
            System.out.println(pw);
//            
//            SessionFactory factory = NewHibernateUtil.getSessionFactory();
//            Session session = factory.openSession();
//            Transaction transaction = session.beginTransaction();
//            
//            Admin admin = new Admin();
//            admin.setUsername(name);
//            admin.setPassword(pw);
//            session.save(admin);
//            transaction.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  

}
