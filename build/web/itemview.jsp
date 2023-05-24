<%-- 
    Document   : itemview
    Created on : Apr 30, 2020, 12:57:13 PM
    Author     : dsada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="CSS/itemview_css.css"/>
        <title>Chakra View Item</title>
    </head>
    <body  onload="loadProfile()">
        <div class="align_footer">
            <section>
                <div class="section1">
                    <img src="IMG/chakraTMicon.jpg" class="logo"/>
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
                        <a class="navi_item active">Items(s)</a>
                        <a class="navi_item">Wish List</a>
                        <a href="Login.jsp" class="navi_item">My Account</a>
                        <a class="navi_item">About Us</a>
                        <a class="navi_item">Contact Us</a>
                    </nav>


                </div>

            </section>
            <div class="item_view">

                <div class="outer_item">


                    <div class="item_subimg">
                        <div class="view_item_img">
                            <img  src="Product_Images/RedT.png" class="product_view_img"/>
                        </div>

                        <div class="item_name_div">
                            <span class="item_head_name">Chakra Red T-Shirt</span>
                            <span class="item_view_descropt">casual solid plain check pattern and tropic  t-shirt</span>
                            <span class="item_price_head">Rs. 1450.00/=</span>
                            <span class="item_color_hed">color</span>
                            <span class="item_color_div" style="background-color: red;"></span>
                            <span class="size_hed">Sizes</span>

                            <select class="size_div">
                                <option>Select Size</option>
                                <option>XS</option>
                                <option>S</option>
                                <option>M</option>
                                <option>L</option>
                                <option>XL</option>
                                <option>XXL</option>
                            </select>



                            <span class="avi_span">Quantity</span>
                            <div class="qty_div">

                                <img src="IMG/plus-circle-solid.svg" class="qty_btn"/>
                                <div class="qty_num">

                                    <span>0</span>
                                </div>
                                <img src="IMG/minus-circle-solid.svg" class="qty_btn"/>

                                <span class="qty_span">Available : 10</span>

                            </div>


                        </div>

                    </div>
                    <div class="btn_div">
                        <a class="btn_cart">Add to Cart</a><br/>
                        <a class="btn_buy">Buy it Now</a><br/>
                        <a class="btn_wish">Add to Wishlist</a>

                    </div>
                </div>   

            </div>


            <div class="similar_items_hed">
                <span>Similar Items</span>
            </div>

            <div class="Product_content">



                <div class="products">

                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>
                    <div class="product01">
                        <div class="imagebox">
                            <img src="Product_Images/blackT.png"/>
                        </div>
                        <div class="specify">
                            <span class="item_name_h">Chakra T-Shirt</span>
                            <span class="color_hed">BLACK</span>
                            <div class="price_div">Rs. 1450.00</div>

                            <label class="lb">Size</label>
                            <ul>
                                <li>XS</li>
                                <li>S</li>
                                <li>M</li>
                                <li>L</li>
                                <li>XL</li>
                                <li>XXL</li>
                            </ul>

                            <a class="btn_cart">Add to Cart</a><br/>
                            <a class="btn_buy">Buy it Now</a><br/>
                            <a class="btn_wish">Add to Wishlist</a>



                        </div>
                    </div>


                </div>
            </div>

        </div> 

        <!------------------footer--------------------->

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
