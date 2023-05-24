<%-- 
    Document   : Admin Edite Product
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

        <title>Chakra Admin Edit Product Details Page</title>
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
                            <a href="#" class="oder_items">Add New Product</a>
                            <a class="oder_items active">Edit Product</a>
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

                            <span class="new_product_hed">Edit Product Details</span>


                            <span class="sub_hed">Basic Details</span>
                            <div class="product_img_name_div">
                                <div class="p_name_div">
                                    <div class="p_id_div">
                                        <span>Product ID :</span>
                                        <input type="text" id="p_id"/>
                                    </div>
                                    <div class="p_name_sub_div">
                                        <span>Product Name :</span>
                                        <input type="text" id="p_name"/>
                                    </div>
                                    <div class="p_color_div">
                                        <span>Color(code) :</span>
                                        <input type="text" id="p_name"/>
                                    </div>
                                    <div class="p_img_div">
                                        <span>Item Photo :</span>
                                        <input type="file"/>
                                    </div>
                                </div>
                            </div>


                            <!--------------------------------category div------------------>
                            <div class="Product_category_div">
                                <span class="sub_hed">Category Details</span>

                                <div class="category_sub_div">
                                    <span>Material :</span>
                                    <select id="materialselect">
                                        <option>Niloan</option>
                                        <option>Cotton</option>
                                    </select>
                                    <input type="text" id="material_txt"/>
                                    <a class="Add_btn">Add</a>
                                </div>

                                <div class="category_sub_div">
                                    <span>Occasion :</span>
                                    <select id="occasionselect">
                                        <option>Casual</option>
                                        <option>Formal</option>
                                    </select>
                                    <input type="text" id="occasion_txt"/>
                                    <a class="Add_btn">Add</a>
                                </div>

                                <div class="category_sub_div">
                                    <span>Print & Pattern :</span>
                                    <select id="printselect">
                                        <option>Solid</option>
                                        <option>Printed</option>
                                    </select>
                                    <input type="text" id="printtype_txt"/>
                                    <a class="Add_btn">Add</a>
                                </div>

                                <div class="category_sub_div">
                                    <span>Sleeve Type :</span>
                                    <select id="sleeveselect">
                                        <option>Long Sleeve</option>
                                        <option>Short Sleeve</option>
                                    </select>
                                    <input type="text" id="sleevetype_txt"/>
                                    <a class="Add_btn">Add</a>
                                </div>


                                <div class="category_sub_div">
                                    <span>Neck Type :</span>
                                    <select id="neckselect">
                                        <option>Rounded</option>
                                        <option>Box</option>
                                    </select>
                                    <input type="text" id="necktype_txt"/>
                                    <a class="Add_btn">Add</a>
                                </div>

                                <div class="category_sub_div">
                                    <span>Sizes :</span>
                                    <select id="sizeselect">
                                        <option>XS</option>
                                        <option>S</option>
                                    </select>
                                    <input type="text" id="size_txt"/>
                                    <a class="Add_btn">Add</a>
                                </div>

                            </div>


                            <div class="retun_div">
                                <span style="font-weight: bold;">Return :</span>
                                <div class="return_sub">
                                    <div>
                                        <span>Acept</span>
                                        <input type="radio" name="return"/>
                                    </div>
                                    <div>
                                        <span>Reject</span>
                                        <input type="radio" name="return"/>
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
                                        <input type="text" id="qty_txt"/>
                                    </div>
                                </div>


                                <div class="discount_set_div">
                                    <span class="sub_hed">Discount Details</span>

                                    <div class="discount_div">
                                        <span>Discount :</span>
                                        <input type="text" id="dis_txt"/>
                                    </div>

                                    <div class="buy_count">
                                        <span class="offer_hed">Special Offers</span>
                                        <span>Buy Count :</span>
                                        <input type="text"/>
                                        <span>Get Count :</span>
                                        <input type="text"/>
                                    </div>

                                </div>
                            </div>
                            
                            <div class="btn_div">
                                <a class="save_btn">Update</a>
                                <a class="clear_btn">Clear</a>
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
