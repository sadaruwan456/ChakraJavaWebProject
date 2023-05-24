<%-- 
    Document   : login_load
    Created on : May 9, 2020, 7:13:58 PM
    Author     : dsada
--%>

<%@page import="hibernate.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    Customer customer = (Customer) session.getAttribute("customer");

%>




<%    if (customer != null) {
        String appPath = getServletContext().getRealPath("");
        String filePath = appPath + "//Profile_Images//"+customer.getPicPath();
%>

<img src="<%= request.getContextPath() %>/Profile_Images/<%= customer.getPicPath() %>" title="<%= customer.getFName() %> <%= customer.getLName() %>" class="pic_cus" />

<a class="logout_btn" onclick="logOut()">LogOut</a>

<%} else {
%>

<img src="IMG/user-circle-regular.svg" class="profile_img"/>

<a class="login_btn" href="Login.jsp">Login</a>

<%
    }
%>