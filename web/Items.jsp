<%-- 
    Document   : Items
    Created on : Apr 28, 2020, 12:32:47 PM
    Author     : dsada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="CSS/items_page_css.css"/>
        <title>Chakra Items Page</title>
    </head>
    
    
    <body onload="loadProfile()">
        <div class="align_footer">
            
        
        <section>
            <div class="section1">
                <img src="IMG/chakraTMicon.jpg" class="logo"/>
                <div class="filter_section">

                    <div class="sub_filter01">
                        <span>Sort By</span>
                        <select>
                            <option>New</option>
                            <option>Popular</option>
                            <option>hight price</option>
                            <option>low price</option>
                            <option>Top Selling</option>
                            <option>Low QTY</option>
                        </select>
                    </div>


                    <div class="sub_filter02">
                        <span class="sp_p">Price</span><br/>

                        <span class="ld_p">From</span>
                        <input type="text" class="p_txt"/>

                        <span class="ld_p">To</span>
                        <input type="text" class="p_txt"/> 
                    </div>




                    <div class="sub_filter01">
                        <span>Search By Occasion </span>
                        <select>
                            <option>casual wear</option>
                            <option>Summer Collection</option>
                            <option>party wear</option>
                            <option>never out of style</option>
                            <option>active wear</option>
                            <option>work wear</option>
                        </select> 
                    </div>



                    <div class="sub_filter01">
                        <span>Search By material</span>
                        <select>
                            <option>cotton</option>
                            <option>linen</option>
                            <option>polyester</option>
                            <option>rayon</option>
                            <option>poly/cotton blend</option>
                            <option>tri-blends</option>
                            <option>nylon</option>
                        </select>
                    </div>




                    <div class="sub_filter01">
                        <span>Print & Pattern</span>
                        <select>
                            <option>printed</option>
                            <option>solids</option>
                            <option>checks</option>
                            <option>ombre</option>
                            <option>Tropical</option>
                        </select>
                    </div>




                    <div class="sub_filter01">
                        <span>Search By Sleeve</span>

                        <select>
                            <option>short sleeves</option>
                            <option>sleeveless</option>
                            <option>long sleeve</option>
                        </select>
                    </div>

                    <div class="sub_filter01">
                        <span>Search By neck style</span>
                        <select>
                            <option>round</option>
                            <option>v-neck</option>
                            <option>Hood</option>
                            <option>polo neck</option>
                            <option>shirt collar</option>
                            <option>High Neck</option>
                        </select>
                    </div>
                    <div class="sub_filter03">
                        <span class="ch_mn">Return Status</span>
                        <div class="check_div">
                        <span>Accept</span>
                        <input type="radio" name="rt_r"/>
                            
                        </div>
                        
                        <div class="check_div">
                            
                        <span>Reject</span>
                        <input type="radio" name="rt_r"/>
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

                    <div class="pro_pic_div" id="load_pro">
                        
                       
                 
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

                <!--------------------------products------------------------------------------->
                <div class="content1">
                    
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
