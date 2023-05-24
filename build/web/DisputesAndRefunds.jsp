<%-- 
    Document   : DisputAndRefunds
    Created on : Apr 28, 2020, 12:32:47 PM
    Author     : dsada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="CSS/MyAcountCSS.css"/>

        <title>Chakra Dispute Orders</title>
    </head>


    <body onload="loadProfile()">
        <div class="align_footer">


            <section>
                <div class="section1">
                    <img src="IMG/chakraTMicon.jpg" class="logo"/>
                    <div class="filter_section">

                        <div class="sub_filter01">
                            <span class="fname_span">Dilanka</span>
                            <span class="lname_span">Sadaruwan</span>

                            <div class="pro_img_div">
                                <img src="Profile_Images/04.jpg" class="pro_img"/>                         
                                <a>Edit Profile</a>
                            </div>
                        </div>
                        <div class="sub_filter01">
                            <span class="oder_hed">Orders</span>
                            <a  class="oder_items ">To be Delivered</a>
                            <a href="Delivering.jsp" class="oder_items">Delivering</a>
                            <a class="oder_items">Delivery Completed</a>
                            <a class="oder_items acive_link">Refund & Disputes</a>
                            <a class="oder_items">Change Delivery Address</a>
                        </div>



                    </div>




                </div>
                <div class="section2">
                    <div class="srch_hed_div">
                    <div class="srch_ft_div">
                        <input type="text" placeholder="Serach..." class="txtscrh"/><button class="btnscrh">Search</button>
                        <img src="IMG/phone-volume-solid.svg" class="call_icon"/>
                        <span class="tel_no">+94 76 942 4681</span>
                        <img src="IMG/shopping-cart-solid.svg" class="cart_img"/>

                    </div>

                    <div class="pro_pic_div" id="load_pro" >
                       
                       
                    </div>

                </div>
                    <nav>
                        <a href="Home.jsp" class="navi_item">Home</a>
                        <a class="navi_item">Items(s)</a>
                        <a class="navi_item">Wish List</a>
                        <a href="#" class="navi_item">My Account</a>
                        <a class="navi_item">About Us</a>
                        <a class="navi_item">Contact Us</a>
                    </nav>

                    <!--------------------------products------------------------------------------->
                    <div class="outer_delivery">
                        <div class="to_be_hed_div">

                            <span class="to_be_hed">Refund & Disputes</span>
                        </div>
                        <div class="Oder_deliver_main">

                            <div class="deliver_img_div">
                                <img src="Product_Images/RedT.png" class=""/>
                            </div>

                            <div class="deliver_name_div">
                                <span class="name_span">Chakra T-shirt</span>
                                <span class="qty_d_span">Quantity: 1</span>
                            </div>

                            <div class="deliver_dis_div">
                                <span class="purch_date">Purchase Date : 2020/05/20</span>
                                <span class="purch_date">Price : Rs.1450.00</span>
                            </div>
                            <div class="deliver_dis_div">
                               
                               <a class="Delete_btn">Delete</a>
                                
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
<script type="text/javascript" src="JS/load_login.js"></script>

    </body>
</html>
