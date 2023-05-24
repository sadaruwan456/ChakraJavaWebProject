<%-- 
    Document   : Admin Home
    Created on : Apr 28, 2020, 12:32:47 PM
    Author     : dsada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="CSS/AdminCss.css"/>

        <title>Chakra Low QTY Page</title>
    </head>


    <body>
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
                               
                            </div>
                        </div>
                        <div class="sub_filter01">
                            <span class="oder_hed">Products Manage</span>
                            <a class="oder_items">Add New Product</a>
                            <a class="oder_items">Edit Product</a>
                            <a class="oder_items">Low Stocks</a>
                            <a class="oder_items">Add Discounts And Offers</a>
                            <a class="oder_items">Change Delivery Address</a>
                        </div>
                        <div class="sub_filter01">
                            <span class="oder_hed">Delivery Manage</span>
                            <a class="oder_items">Deliver Requests</a>
                            <a class="oder_items">Delivering Orders</a>
                            <a class="oder_items">Deliver Complete Orders</a>
                        </div>
                        <div class="sub_filter01">
                            <span class="oder_hed">Other</span>
                            <a class="oder_items">Add New Admin</a>
                            <a class="oder_items">All Summaries</a>
                        </div>



                    </div>




                </div>
                <div class="section2">
                    <div class="admin_head_div">
                    <span class="Admin_head">Chakra Admin Panel</span>                        
                    </div>

                  
                    <!--------------------------Low QTY Table------------------------------------------->
                    

                    <div class="table_div">
                        <table class="table_t">
                            <tr class="th">
                                <td>Item ID</td>
                                <td>Item</td>
                                <td>Name</td>
                                <td>Unite Price</td>
                                <td>QTY</td>
                                <td>Add QTY</td>
                                
                            </tr>
                            <tr>
                                <td>121354</td>
                                <td><img src="Product_Images/RedT.png" class="table_img"/></td>
                                <td>Chakra T-shirt</td>
                                <td>Rs.1450.00</td>
                                <td>8</td>
                                <td><a>Add QTY</a></td>
                            </tr>
                            
                        </table>
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
