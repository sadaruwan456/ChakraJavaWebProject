/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
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
import java.util.ArrayList;
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
public class CategoryLoad extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            SessionFactory factory = NewHibernateUtil.getSessionFactory();
            Session session = factory.openSession();

            Criteria criteria1 = session.createCriteria(Material.class);
            List<Material> materialList = criteria1.list();

            Criteria criteria2 = session.createCriteria(Occasion.class);
            List<Occasion> occationlist = criteria2.list();

            Criteria criteria3 = session.createCriteria(PrintPattern.class);
            List<PrintPattern> printlist = criteria3.list();

            Criteria criteria4 = session.createCriteria(Sleeve.class);
            List<Sleeve> sleevelist = criteria4.list();

            Criteria criteria5 = session.createCriteria(Neck.class);
            List<Neck> necklist = criteria5.list();

            Criteria criteria6 = session.createCriteria(Sizes.class);
            List<Sizes> sizeslist = criteria6.list();

            Criteria criteria7 = session.createCriteria(Discount.class);
            List<Discount> discountlist = criteria7.list();

            Criteria criteria8 = session.createCriteria(SpOffers.class);
            List<SpOffers> Spofferlist = criteria8.list();

            ArrayList<Object> all = new ArrayList<>();
            all.add(materialList);
            all.add(occationlist);
            all.add(printlist);
            all.add(sleevelist);
            all.add(necklist);
            all.add(sizeslist);
            all.add(discountlist);
            all.add(Spofferlist);

            Gson gson = new Gson();
            String jsonString = gson.toJson(all);
            
            response.getWriter().write(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
