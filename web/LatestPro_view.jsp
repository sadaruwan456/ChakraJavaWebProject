<%-- 
    Document   : LatestPro_view
    Created on : May 11, 2020, 2:36:41 PM
    Author     : dsada
--%>

<%@page import="java.util.List"%>
<%@page import="hibernate.LatestProducts"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        List<LatestProducts> l_product = (List<LatestProducts>) request.getAttribute("LatestProduct");

        for (LatestProducts i : l_product) {


    %>

    <div class="product01">
        <div class="imagebox">
            <img src="Product_Images/<%= i.getProduct().getPicPath() %>"/>
        </div>
        <div class="specify">
            <span class="item_name_h"><%= i.getProduct().getPName()%></span><br/>
            <div class="price_div">Rs. <%= i.getProduct().getPrice()%></div>
            
            <label class="lb">Size</label>
            <ul>
            <%
                String s1 = i.getProduct().getSizes();
                String[] words = s1.split(",");

                for (String x : words) {


            %>
            
                <li><%= x %></li>
               
            <%
            }
            %>
            </ul>
            <a class="btn_cart">Add to Cart</a><br/>
            <a class="btn_buy">Buy it Now</a><br/>
            <a class="btn_wish">Add to Wishlist</a>



        </div>
    </div>

    <%        }
    %>