<%-- 
    Document   : Admin Add New Product
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

        <title>Chakra Admin Add New Product Page</title>
    </head>


    <body onload="caregoryLoat()">
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
                            <a href="#" class="oder_items active">Add New Product</a>
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


                    <!--------------------------New Product Add------------------------------------------->
                    <div class="main_product_add_outer">
                        <div class="main_product_add_inner">

                            <span class="new_product_hed">New Product Registration</span>


                            <span class="sub_hed">Basic Details</span>
                            <div class="product_img_name_div">
                                <div class="p_name_div">
                                    <div class="p_id_div">
                                        <span>Product ID :</span>
                                        <input type="text" id="p_id"/>
                                    </div>
                                    <div class="p_name_sub_div">
                                        <span>Product Name :</span>
                                        <input type="text" id="p_name" />
                                    </div>

                                    <div class="p_img_div">
                                        <span>Item Photo :</span>
                                        <input type="file" class="file_input" id="file_input" name="p_image"/>
                                    </div>
                                </div>
                            </div>


                            <!--------------------------------category div------------------>
                            <div class="Product_category_div">
                                <span class="sub_hed">Category Details</span>

                                <div class="category_sub_div">
                                    <span>Material :</span>
                                    <select id="materialselect">

                                    </select>
                                    <input type="text" onkeyup="materialAdd(2)" id="material_txt"/>
                                    <a class="Add_btn" onclick="materialAdd(1)">Add</a>
                                </div>

                                <div class="category_sub_div">
                                    <span>Occasion :</span>
                                    <select id="occasionselect">

                                    </select>
                                    <input type="text" onkeyup="occationAdd(2)" id="occasion_txt"/>
                                    <a class="Add_btn" onclick="occationAdd(1)">Add</a>
                                </div>

                                <div class="category_sub_div">
                                    <span>Print & Pattern :</span>
                                    <select id="printselect">

                                    </select>
                                    <input type="text" onkeyup="printAdd(2)" id="printtype_txt"/>
                                    <a class="Add_btn" onclick="printAdd(1)">Add</a>
                                </div>

                                <div class="category_sub_div">
                                    <span>Sleeve Type :</span>
                                    <select id="sleeveselect">

                                    </select>
                                    <input type="text" onkeyup="sleeveAdd(2)" id="sleevetype_txt"/>
                                    <a class="Add_btn" onclick="sleeveAdd(1)">Add</a>
                                </div>


                                <div class="category_sub_div">
                                    <span>Neck Type :</span>
                                    <select id="neckselect">

                                    </select>
                                    <input type="text" onkeyup="neckAdd(2)" id="necktype_txt"/>
                                    <a class="Add_btn" onclick="neckAdd(1)">Add</a>
                                </div>

                                <div class="category_sub_div">
                                    <span>Sizes :</span>
                                    <div class="sis_inner">
                                        <div class="sis_sub_div">
                                            <span>XS</span>
                                            <input type="checkbox" id="xs"/>
                                        </div>
                                        <div class="sis_sub_div">
                                            <span>S</span>
                                            <input type="checkbox" id="s"/>
                                        </div>
                                        <div class="sis_sub_div">
                                            <span>M</span>
                                            <input type="checkbox" id="m"/>
                                        </div>
                                    </div>
                                    <div class="sis_inner">
                                        <div class="sis_sub_div">
                                            <span>L</span>
                                            <input type="checkbox" id="l"/>
                                        </div>
                                        <div class="sis_sub_div">
                                            <span>XL</span>
                                            <input type="checkbox" id="xl"/>
                                        </div>
                                        <div class="sis_sub_div">
                                            <span>XXL</span>
                                            <input type="checkbox" id="xxl"/>

                                        </div>

                                    </div>
                                </div>

                            </div>


                            <div class="retun_div">
                                <span style="font-weight: bold;">Return :</span>
                                <div class="return_sub">
                                    <div>
                                        <span>Acept</span>
                                        <input type="radio" value="Accept" id="assra" name="return"/>
                                    </div>
                                    <div>
                                        <span>Reject</span>
                                        <input type="radio" value="Reject" id="rejra" name="return"/>
                                    </div>
                                </div>
                            </div>

                            <div class="price_main_div">

                                <div class="price_set_div">
                                    <span class="sub_hed">Price Details</span>

                                    <div class="cost_div">
                                        <span>Cost :</span>
                                        <input type="text" id="cost_txt"/>
                                    </div>
                                    <div class="Selling_price_div">
                                        <span>Price :</span>
                                        <input type="text" id="price_txt"/>
                                    </div>
                                    <div class="db_qty_div">
                                        <span>Quantity :</span>
                                        <input type="number" id="qty_txt"/>
                                    </div>
                                </div>


                                <div class="discount_set_div">
                                    <span class="sub_hed">Discount Details</span>

                                    <div class="discount_div">
                                        <span>Discount :</span>
                                        <select id="discountselect" >

                                        </select>

                                        <input type="text" id="dis_txt"/>
                                        <a class="Add_btn" onclick="discountAdd()">Add</a>
                                    </div>

                                    <span class="offer_hed">Special Offers</span>
                                    <div class="buy_count">
                                        <select id="offercelect">

                                        </select>

                                        <span class="buyspan">Buy :</span>
                                        <input type="number" id="buy_txt" class="sp_in"/>

                                        <span class="getspan">Get :</span>
                                        <input type="number" id="get_txt" class="sp_in"/>

                                        <a class="Add_btn" onclick="offerAdd()">Add</a>   
                                    </div>

                                </div>
                            </div>

                            <div class="btn_div">

                                <button class="save_btn" onclick="getProducts()">Save</button>
                                <a class="clear_btn" onclick="clearFields()">Clear</a>
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
        <script type="text/javascript" src="JS/Products_Loads.js"></script>
        <script type="text/javascript" src="JS/signup_view.js"></script>
    </body>
</html>
