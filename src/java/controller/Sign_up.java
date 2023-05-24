/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernate.Customer;
import hibernate.NewHibernateUtil;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author dsada
 */
public class Sign_up extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
           
           
            
            DiskFileItemFactory dfif = new DiskFileItemFactory();
            ServletFileUpload sfu = new ServletFileUpload(dfif);
            List<FileItem> fil = sfu.parseRequest(request);
            
            SessionFactory factory = NewHibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();
            
            Customer customer = new Customer();
            for (FileItem i : fil) {
                if(i.isFormField()){
                    if(i.getFieldName().equals("email_txt")){
                       customer.setEmail(i.getString());
                    }
                    if(i.getFieldName().equals("password_txt")){
                        customer.setPassword(i.getString());
                    }
                    if(i.getFieldName().equals("fname_txt")){
                        customer.setFName(i.getString());
                    }
                    if(i.getFieldName().equals("lname_txt")){   
                       customer.setLName(i.getString());
                    }
                    if(i.getFieldName().equals("dob_txt")){
                        Date date1=new SimpleDateFormat("yyyyMMMdd").parse(i.getString());  
                        customer.setDob(date1);
                    }
                    
                }else{
                    String appPath = getServletContext().getRealPath("");
                    String name  = System.currentTimeMillis()+".png";
                    String filePath = appPath+"//Profile_Images//"+name;
                    File f  = new File(filePath);
                    i.write(f);
                    customer.setPicPath(name);
                }
            }
            session.save(customer);
            transaction.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
