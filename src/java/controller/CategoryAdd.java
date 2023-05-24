/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernate.Discount;
import hibernate.Material;
import hibernate.Neck;
import hibernate.NewHibernateUtil;
import hibernate.Occasion;
import hibernate.PrintPattern;
import hibernate.Sizes;
import hibernate.Sleeve;
import hibernate.SpOffers;
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
public class CategoryAdd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String material = request.getParameter("material");
            String occation = request.getParameter("occation");
            String print = request.getParameter("print");
            String sleeve = request.getParameter("sleeve");
            String neck = request.getParameter("neck");
            String size = request.getParameter("size");
            String discount = request.getParameter("discount");
            String buycc = request.getParameter("buy_count");
            String getcc = request.getParameter("get_count");
            
            String offer = "Buy"+buycc+" "+"get"+getcc;
            
            
            
            SessionFactory factory = NewHibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();
            
            if(material!=null){
                Material material1 = new Material();
                material1.setName(material);
                session.save(material1);
                transaction.commit();
                response.getWriter().write(material);
            }
            
            if(occation!=null){
                Occasion occasion = new Occasion();
                occasion.setName(occation+"%");
                session.save(occasion);
                transaction.commit();
                response.getWriter().write(occation);
            }
            
            if(print!=null){
                PrintPattern printPattern = new PrintPattern();
                printPattern.setName(print);
                session.save(printPattern);
                transaction.commit();
                response.getWriter().write(print);
            }
            if(sleeve!=null){
                Sleeve sleeve1 = new Sleeve();
                sleeve1.setName(sleeve);
                session.save(sleeve1);
                transaction.commit();
                response.getWriter().write(sleeve);
            }
            if(neck!=null){
                Neck neck1 = new Neck();
                neck1.setName(neck);
                session.save(neck1);
                transaction.commit();
                response.getWriter().write(neck);
            }
            if(size!=null){
                Sizes sizes = new Sizes();
                sizes.setName(size);
                session.save(sizes);
                transaction.commit();
                response.getWriter().write(size);
            }
            if(discount!=null){
                Discount discount1 = new Discount();
                discount1.setName(discount);
                session.save(discount1);
                transaction.commit();
                response.getWriter().write(discount);
            }
            
            if(getcc!=null){
                SpOffers spOffers = new SpOffers();
                spOffers.setName(offer);
                spOffers.setButCount(Integer.parseInt(buycc));
                spOffers.setGetCount(Integer.parseInt(getcc));
                session.save(spOffers);
                transaction.commit();
                response.getWriter().write(offer);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
