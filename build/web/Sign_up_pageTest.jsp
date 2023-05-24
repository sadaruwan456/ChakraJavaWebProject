<%-- 
    Document   : Login_page
    Created on : Apr 14, 2020, 7:48:30 PM
    Author     : dsada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="CSS/Login_css.css"/>
    </head>
    <body>
        <div class="signup-div">
            <div class="logo"></div>
            <div class="tittle">Chakra</div>
            <div class="sub-tittle">Store</div>
            <div class="fields">
                <div class="txt_fields_span">
                    <span>First Name</span>
                </div>
                <div class="txt_fields">
                     <input type="text" class="user-input" placeholder="First Name..."/>
                </div>
                
                
                <div class="txt_fields_span">
                    <span>Last Name</span>
                </div>
                <div class="txt_fields">
                    <input type="text" class="pass-input" placeholder="Last Name..."/>
                </div>
                
                
                
                <div class="txt_fields_span">
                    <span>Date Of Birth</span>
                </div>
                <div class="txt_fields">
                    <input type="date" class="pass-input" />
                </div>
                
                
                <div class="txt_fields_span">
                    <span>Email</span>
                </div>
                <div class="txt_fields">
                    <input type="text" class="pass-input" placeholder="Email.."/>
                </div>
                
                <div class="txt_fields_span">
                    <span>Password</span>
                </div>
                <div class="txt_fields">
                    <input type="password" class="pass-input" placeholder="Password..."/>
                </div>
                <div class="txt_fields">
                    <input type="password" class="pass-input" placeholder="Confirm Password..."/>
                </div>
                <button class="signin-button">Sign Up</button>
                
                <div class="link">
                    <a href="#">Forgot Password</a> or <a href="#">Sign Up</a>
                </div>
            </div>
        </div>
    </body>
</html>
