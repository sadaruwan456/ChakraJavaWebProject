/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernate.NewHibernateUtil;
import hibernate.Product;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dsada
 */
public class productUpload extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            DiskFileItemFactory dfif = new DiskFileItemFactory();
            ServletFileUpload sfu = new ServletFileUpload(dfif);
            List<FileItem> fi = sfu.parseRequest(request);

            SessionFactory factory = NewHibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();
            
            Criteria criteria = session.createCriteria(Product.class);
            
            Product product1 = (Product) request.getSession().getAttribute("newpro");
            String pName = product1.getPName();
            
            criteria.add(Restrictions.eq("PName", pName));
            Product pronew = (Product) criteria.uniqueResult();
           
            
            FileItem fileIt = fi.get(0);
            long mills = System.currentTimeMillis();

            String appPath = getServletContext().getRealPath("");
            String filePath = appPath + "//Product_Images//" + mills + ".png";
//            System.out.println("22");

            File file = new File(filePath);
            fileIt.write(file);
            pronew.setPicPath(mills+".png");
            session.update(pronew);
            transaction.commit();
            
           response.getWriter().write(appPath);
           request.getSession().removeAttribute("newpro");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
