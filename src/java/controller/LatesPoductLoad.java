/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernate.LatestProducts;
import hibernate.NewHibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author dsada
 */
public class LatesPoductLoad extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            SessionFactory factory = NewHibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            Criteria criteria = session.createCriteria(LatestProducts.class);
            List <LatestProducts>  latestProducts = criteria.list();
            
            
            request.setAttribute("LatestProduct", latestProducts);
            request.getRequestDispatcher("LatestPro_view.jsp").forward(request, response);
            
        } catch (Exception e) {
        }
    }

   
}
