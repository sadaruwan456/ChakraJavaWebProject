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
import hibernate.Product;
import hibernate.ReturnType;
import hibernate.Sleeve;
import hibernate.SpOffers;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.PrimaryKey;

/**
 *
 * @author dsada
 */
public class ProductsAdd extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            String name = request.getParameter("pname");
            String material = request.getParameter("material");
            String occation = request.getParameter("occation");
            String print = request.getParameter("print");
            String sleeve = request.getParameter("sleeve");
            String neck = request.getParameter("neck");
            String sisez = request.getParameter("sizes");
            String return_type = request.getParameter("return");
            String cost = request.getParameter("cost");
            String price = request.getParameter("price");
            String qty1 = request.getParameter("qty");
            String discount = request.getParameter("discount");
            String offer = request.getParameter("offer");

            int qty = Integer.parseInt(qty1);
            
            System.out.println(name);
            System.out.println(material);
            System.out.println(occation);
            System.out.println(print);
            System.out.println(sleeve);
            System.out.println(neck);
            System.out.println(sisez);
            System.out.println(return_type);
            System.out.println(cost);
            System.out.println(price);
            System.out.println(qty1);
            System.out.println(discount);
            System.out.println(offer);

            SessionFactory factory = NewHibernateUtil.getSessionFactory();
            Session session = factory.openSession();

            Criteria criteriaPro = session.createCriteria(Product.class);
            criteriaPro.add(Restrictions.eq("PName", name));

            Product expro = (Product) criteriaPro.uniqueResult();
            if (expro == null) {

                Transaction transaction = session.beginTransaction();

                Criteria criteria1 = session.createCriteria(Material.class);
                criteria1.add(Restrictions.eq("name", material));
                Material materialtxt = (Material) criteria1.uniqueResult();

                Criteria criteria2 = session.createCriteria(Occasion.class);
                criteria2.add(Restrictions.eq("name", occation));
                Occasion occationtxt = (Occasion) criteria2.uniqueResult();

                Criteria criteria3 = session.createCriteria(PrintPattern.class);
                criteria3.add(Restrictions.eq("name", print));
                PrintPattern printtxt = (PrintPattern) criteria3.uniqueResult();

                Criteria criteria4 = session.createCriteria(Sleeve.class);
                criteria4.add(Restrictions.eq("name", sleeve));
                Sleeve sleevetxt = (Sleeve) criteria4.uniqueResult();

                Criteria criteria5 = session.createCriteria(Neck.class);
                criteria5.add(Restrictions.eq("name", neck));
                Neck necktxt = (Neck) criteria5.uniqueResult();

                Criteria criteria6 = session.createCriteria(ReturnType.class);
                criteria6.add(Restrictions.eq("name", return_type));
                ReturnType returnTypetxt = (ReturnType) criteria6.uniqueResult();

                Criteria criteria7 = session.createCriteria(Discount.class);
                criteria7.add(Restrictions.eq("name", discount));
                Discount discounttxt = (Discount) criteria7.uniqueResult();

                Criteria criteria8 = session.createCriteria(SpOffers.class);
                criteria8.add(Restrictions.eq("name", offer));
                SpOffers offertxt = (SpOffers) criteria8.uniqueResult();

                Product product = new Product();

                product.setPName(name);
                product.setMaterial(materialtxt);
                product.setOccasion(occationtxt);
                product.setPrintPattern(printtxt);
                product.setSleeve(sleevetxt);
                product.setNeck(necktxt);
                product.setSizes(sisez);
                product.setReturnType(returnTypetxt);
                product.setCost(Double.parseDouble(cost));
                product.setPrice(Double.parseDouble(price));
                product.setQty(qty);
                product.setDate(new Date());
                product.setStatus(1);
                product.setDiscount(discounttxt);
                product.setSpOffers(offertxt);

                request.getSession().setAttribute("newpro", product);
                session.save(product);
                transaction.commit();

                response.getWriter().write("done");
            } else {
                response.getWriter().write("Already Exist");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
