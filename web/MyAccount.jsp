<%-- 
    Document   : MyAcount
    Created on : Apr 28, 2020, 12:32:47 PM
    Author     : dsada
--%>

<%@page import="hibernate.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="CSS/MyAcountCSS.css"/>

        <title>Chakra My Account Page</title>
    </head>

<%
  Customer customer = (Customer) session.getAttribute("customer");
%>
    <body>
        <div class="align_footer">


            <section>
                <div class="section1">
                    <img src="IMG/chakraTMicon.jpg" class="logo"/>
                    <div class="filter_section">

                        <div class="sub_filter01">
                            <span class="fname_span"><%= customer.getFName() %></span>
                            <span class="lname_span"><%= customer.getLName() %></span>

                            <div class="pro_img_div">
                                <img src="<%= request.getContextPath()%>/Profile_Images/<%= customer.getPicPath() %>" class="pro_img"/>                         
                                <a>Edit Profile</a>
                            </div>
                        </div>
                        <div class="sub_filter01">
                            <span class="oder_hed">Orders</span>
                            <a class="oder_items">To be Delivered</a>
                            <a class="oder_items">Delivering</a>
                            <a class="oder_items">Delivery Completed</a>
                            <a class="oder_items">Refund & Disputes</a>
                            <a class="oder_items">Change Delivery Address</a>
                        </div>



                    </div>




                </div>
                <div class="section2">
                    
                    <nav>
                        <a href="Home.jsp" class="navi_item">Home</a>
                        <a class="navi_item">Items(s)</a>
                        <a class="navi_item">Wish List</a>
                        <a href="#" class="navi_item active">My Account</a>
                        <a class="navi_item">About Us</a>
                        <a class="navi_item">Contact Us</a>
                    </nav>

                    <!--------------------------products------------------------------------------->
                    <div class="summary_main">
                        
                        <div class="summary_sub01">
                            <span>Orders Summaries</span>
                        </div>
                        
                        <div class="summary_sub02">
                            
                            <div class="summary_con">
                                <span>0</span>
                                <span>All Orders</span>

                            </div>
                            <div class="summary_con">
                                <span>0</span>
                                <span>Awaiting Payments</span>
                            </div>
                            <div class="summary_con">
                                <span>0</span>
                                <span>Awaiting Delivery</span>
                            </div>
                            <div class="summary_con">
                                <span>0</span>
                                <span>Awaiting Feedback</span>
                            </div>
                            <div class="summary_con_last">
                                <span>0</span>
                                <span>Disputes</span>
                            </div>
                        </div>
                    </div>











                </div>
            </section> 
        </div>
        <div class="footer">
            <div class="outer">
                <div class="inner1">
                    <h4>Information</h4>
                    <a>About</a>
                    <a>Delivery</a>
                    <a>Privacy Policy</a>
                    <a>Terms & Condition</a>
                </div>
                <div class="inner2">
                    <h4>Customer Information</h4>
                    <a>Contact Us</a>
                    <a>Delivery Issus</a>
                    <a>Other Inquiries</a>
                </div>
                <div class="inner1">
                    <h4>My Account</h4>
                    <a>Oder History</a>
                    <a>Wish List</a>
                    <a>News Latter</a>
                </div>
                <div class="inner2">
                    <h4>Follow Us</h4>
                    <a>Facebook</a>
                    <a>Twitter</a>
                    <a>YouTube</a>
                    <a>Instagram</a>
                </div>

            </div>
            <div class="copyright">
                <span>Powered By DeamSL  © 2020</span>
            </div>
        </div>

     
    </body>
</html>
