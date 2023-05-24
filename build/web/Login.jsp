<%-- 
    Document   : Login
    Created on : Apr 29, 2020, 12:15:03 AM
    Author     : dsada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="CSS/Login_css.css"/>
        <title>Chakra User Login Page</title>
    </head>
    <body>
        <div class="align_footer">
            <div id="myModal" class="modal">

                <!-- Modal content -->
                <div class="modal-content">
                    <span class="close" id="close" onclick="popClose01()">&times;</span>
                    <div class="pop_hed_login">
                        <span>Incorrect Password or Username...!</span>
                    </div>
                    <div class="pop_con_login">
                        <img src="IMG/icons8-warning-100.png" class="warn_img"/>
                        <button class="btn_close" onclick="popClose01()">close</button>
                    </div>
                </div>

            </div>
            <div id="myModalDone" class="modal_done">

                <!-- Modal content -->
                <div class="modal-content">
                    <span class="close" id="close" onclick="popClose02()">&times;</span>
                    <div class="pop_hed_login_done">
                        <span>Login Successful</span>
                    </div>
                    <div class="pop_con_login">
                        <img src="IMG/icons8-ok-100.png" class="warn_img"/>
                        <a href="Home.jsp" class="btn_close2">Close</a>
                    </div>
                </div>

            </div>
            <section>
                <div class="section1">
                    <img src="IMG/chakraTMicon.jpg" class="logoh"/>

                    <div class="outer_design">
                        <div class="back_img">
                            <img src="Product_Images/whiteT.png"/>
                        </div>
                        <div class="design_div">

                            <div class="design_des_div">
                                <span class="design_des">We selling Only best quality T-Shirts made in Sri Lanka </span>
                                <span class="design_plz">Please</span>
                                <div class="log_dec">
                                    <span class="design_log_span">Login </span>
                                    <img src="IMG/hand-point-right-solid.svg" class="img_svg"/>
                                </div>

                                <span class="design_last">and stay with us</span>

                            </div>
                        </div>

                    </div>


                </div>

                <div class="section2">                               
                    <nav>
                        <a href="Home.jsp" class="navi_item">Home</a>
                        <a class="navi_item">Items(s)</a>
                        <a class="navi_item">Wish List</a>
                        <a class="navi_item">My Account</a>
                        <a class="navi_item">About Us</a>
                        <a class="navi_item">Contact Us</a>
                    </nav>


                    <div class="login-div">
                        <div class="logo"></div>
                        <div class="tittle">Chakra</div>
                        <div class="sub-tittle">Store</div>
                        <div class="fields">
                            <div class="username">
                                <svg fill="#999" class="svg-icon" viewBox="0 0 20 20" >
                                <path d="M17.388,4.751H2.613c-0.213,0-0.389,0.175-0.389,0.389v9.72c0,0.216,0.175,0.389,0.389,0.389h14.775c0.214,0,0.389-0.173,0.389-0.389v-9.72C17.776,4.926,17.602,4.751,17.388,4.751 M16.448,5.53L10,11.984L3.552,5.53H16.448zM3.002,6.081l3.921,3.925l-3.921,3.925V6.081z M3.56,14.471l3.914-3.916l2.253,2.253c0.153,0.153,0.395,0.153,0.548,0l2.253-2.253l3.913,3.916H3.56z M16.999,13.931l-3.921-3.925l3.921-3.925V13.931z"></path>
                                </svg> <input type="text" id="cus_username" class="user-input" placeholder="Email..."/>
                            </div>
                            <div class="password">
                                <svg fill="#999" class="svg-icon" viewBox="0 0 20 20">
                                <path d="M17.308,7.564h-1.993c0-2.929-2.385-5.314-5.314-5.314S4.686,4.635,4.686,7.564H2.693c-0.244,0-0.443,0.2-0.443,0.443v9.3c0,0.243,0.199,0.442,0.443,0.442h14.615c0.243,0,0.442-0.199,0.442-0.442v-9.3C17.75,7.764,17.551,7.564,17.308,7.564 M10,3.136c2.442,0,4.43,1.986,4.43,4.428H5.571C5.571,5.122,7.558,3.136,10,3.136 M16.865,16.864H3.136V8.45h13.729V16.864z M10,10.664c-0.854,0-1.55,0.696-1.55,1.551c0,0.699,0.467,1.292,1.107,1.485v0.95c0,0.243,0.2,0.442,0.443,0.442s0.443-0.199,0.443-0.442V13.7c0.64-0.193,1.106-0.786,1.106-1.485C11.55,11.36,10.854,10.664,10,10.664 M10,12.878c-0.366,0-0.664-0.298-0.664-0.663c0-0.366,0.298-0.665,0.664-0.665c0.365,0,0.664,0.299,0.664,0.665C10.664,12.58,10.365,12.878,10,12.878"></path>
                                </svg> <input type="password" id="cus_password" class="pass-input" placeholder="password..."/>
                            </div>
                            <button class="signin-button" onclick="loginCustomer();">Login</button>

                            <div class="link">
                                <a href="#" >Forgot Password</a> or <a href="SignUp_page.jsp">Sign Up</a>
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

        <script type="text/javascript" src="JS/Login_customer.js"></script>
    </body>
</html>
