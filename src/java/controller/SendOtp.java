/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dsada
 */
public class SendOtp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String to = request.getParameter("email");
            System.out.println(to);
            String sub = "Chakra Email Verification";
  
            
            char[] generatorOTP = model.OTPgen.generatorOTP(4);
            String otp = new String(generatorOTP);
            System.out.println(otp);
            String con = "Your OPT Code :"+otp;
            
            
            
            Properties p = System.getProperties();
             p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", "587");
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            
           Authenticator authenticator = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    PasswordAuthentication authentication = new PasswordAuthentication("testchakrat2020@gmail.com", "sadaruwan12");
                    return authentication; //To change body of generated methods, choose Tools | Templates.
                }
               
               
};
            
            Session session  = Session.getInstance(p, authenticator);
            
          MimeMessage email =  new MimeMessage(session);
          email.setFrom(new InternetAddress("prodila.97@gmail.com"));
          email.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
          email.setSubject(sub);
//          String htmlcc = "<h1>Dilanka Sadaruwan</h1>"+"</br>"+"<input type = 'text'/>";
//          email.setContent(htmlcc,"text/html");
          email.setText(con);
          if(request.getSession().getAttribute("otpCode")!=null){
                request.getSession().removeAttribute("otpCode");
                if(request.getSession().getAttribute("otpCode")==null){
                    request.getSession().setAttribute("otpCode", otp);
                }
          }else{
          request.getSession().setAttribute("otpCode", otp);
          }
            System.out.println(request.getSession().getAttribute("otpCode"));
          Transport.send(email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
