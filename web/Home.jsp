<%-- 
    Document   : Home
    Created on : Apr 22, 2020, 1:31:18 PM
    Author     : dsada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="CSS/NavibarCss02.css"/>
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico&display=swap" rel="stylesheet">
        <title>Chakra Home Page</title>
    </head>
    <body onload="loadProfile(), latesProLoad()">
        <div class="align_footer">
            <section>
                <div class="section1">
                    <img src="IMG/chakraTMicon.jpg" class="logo"/>
                    <div class="navigate">
                        <img src="IMG/bars-solid.svg" class="toggle"/>
                        <a class="cgr">Categories</a>
                    </div>

                    <div>
                        <a class="submanu">Half Sleeve</a>
                        <a class="submanu">Neck Crew</a>
                        <a class="submanu">Long Sleeve</a>
                        <a class="submanu">Polo Collar</a>
                        <a class="submanu">V-neck</a>
                        <a class="submanu">Douche bag neck</a>
                        <a class="submanu">Henley Collar</a>
                        <a class="submanu">Baseball T-shirt</a>
                        <a class="submanu">Raglan sleeve</a>
                    </div>

                    <div class="spc_item_hed">
                        <span>Special Offers</span>
                    </div>
                    <div class="Special_items_div">

                        <div class="product_sp">
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

                    <nav class="naw_item">
                        <a class="navi_item active">Home</a>
                        <a href="Items.jsp" class="navi_item">Items(s)</a>
                        <a class="navi_item">Wish List</a>
                        <a onclick="loginCheck()" class="navi_item">My Account</a>
                        <a class="navi_item">About Us</a>
                        <a class="navi_item">Contact Us</a>
                    </nav>

                    <div class="slider">
                        <div class="slides">
                            <div class="slide1" id="sld01">
                                <img src="Product_Images/blackT.png" class="img1"/>
                            </div>
                            <div class="slide1" id="sld02" >
                                <img src="Product_Images/whiteT.png" class="img2"/>
                            </div>
                            <div class="slide1" id="sld0">
                                <img src="Product_Images/RedT.png" class="img3"/>
                            </div>
                            <div class="constant">
                                <h1>Chakra T-Shirt</h1>

                                <p>This is a special t-shirt print name of Chakra. Stocks are limited..</p>
                                <a href="#" class="btnshop" onclick="autoAni();">Shop Now</a>

                            </div>
                        </div>
                    </div>







                    <!-----------------------------------------Latest Products------------------------------------------------>
                    <!---------------------------Heder-------------------->
                    <div class="content1">
                        <div class="content1_hed">
                            <span>Latest T-Shirts</span>
                        </div>

                        <div class="products" id="latest_pro_dic">



                            <!-----------------------------------Products----------------------------------------------->




                        </div>





                    </div>
                    <!--                -----------------------------------------------Discounted Items--------------------------------------------------------

-------------------Header----------------------------->
                    <div class="content2_hed">
                        <span>Discounted Items</span>
                    </div>
                    <div class="content2">

                        <div class="products_dic_div"id="">



                            <!-----------------------------------Product02----------------------------------------------->
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
        <script type="text/javascript" src="JS/Navibar02.js"></script>
    </body>
</html>
