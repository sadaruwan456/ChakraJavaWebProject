<%-- 
    Document   : SignUp
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
        <title>Chakra SignUp Page</title>
    </head>
    <body>
        <div class="align_footer">
            <div id="myModal" class="modal">

                <!-- Modal content -->
                <div class="modal-content">
                    <span class="close" id="close" onclick="popClose()">&times;</span>
                    <div class="pop_hed">
                        <span>Email Verification</span>
                    </div>
                    <div class="pop_con">
                        <span>Enter OTP code</span>
                        <input type="text" id="otp_txt" class="otp_txt"/>
                        <button class="otp_btn" onclick="nextact()">Enter</button>
                        <span class="valide_lb" id="valide_lb">Invalid Code</span>
                    </div>
                </div>

            </div>
            <section>
                <div class="section1">
                    <img src="IMG/chakraTMicon.jpg" class="logoh"/>

                    <div class="outer_design">
                        <div class="back_img_sing">
                            <img src="Product_Images/whiteT.png"/>
                        </div>

                        <div class="design_div">

                            <div class="design_des_div">
                                <span class="design_des">We selling Only best quality T-Shirts made in Sri Lanka </span>
                                <span class="design_plz">Please</span>
                                <div class="log_dec">
                                    <span class="design_log_span">Register Now</span>
                                    <img src="IMG/hand-point-right-solid.svg" class="img_svg"/>
                                </div>

                                <span class="design_last">and stay with us...</span>

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

                    <form onsubmit="return  testSect();" action="Sign_up"  method="POST" enctype="multipart/form-data" >
                        <div class="main_signUp_div" >
                            <div class="sign_div01" id="sign_div01">

                                <div class="signup-div">
                                    <div class="logo"></div>
                                    <div class="tittle">Chakra</div>
                                    <div class="sub-tittle">Store</div>
                                    <div class="fields">

                                        <div class="txt_fields_span">
                                            <span>Email</span>
                                        </div>
                                        <div class="txt_fields" id="emaildiv">
                                            <input  type="text" class="pass-input" onkeyup="txtTypeEmail();" placeholder="Email.." name="email_txt" id="email_txt"/>
                                        </div>
                                        <label class="error_span" id="error_span">Already Exist...</label>
                                        <div class="txt_fields_span_password" >
                                            <span>Password</span>
                                        </div>
                                        <div class="txt_fields" id="passworddiv">
                                            <input type="password" class="pass-input" onkeyup="passwordType();" placeholder="Password..." name="password_txt" id="password_txt"/>
                                        </div>

                                        <div class="txt_fields" id="passworcomddiv">
                                            <input type="password" class="pass-input" onkeyup="passwordcomType();" placeholder="Confirm Password..." name="passwordcom_txt" id="passwordcom_txt"/>
                                        </div>

                                        <a class="next_btn" onclick="testData()">Next</a>

                                        <div class="link">
                                            <a href="Login.jsp">LogIn</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="sign_div02">
                                <div class="signup-div">
                                    <div class="logo"></div>
                                    <div class="tittle">Chakra</div>
                                    <div class="sub-tittle">Store</div>
                                    <div class="fields">

                                        <div class="txt_fields_span">
                                            <span>First Name</span>
                                        </div>
                                        <div class="txt_fields" id="fnamediv">
                                            <input type="text" class="user-input" onkeyup="txtTypedfname();" placeholder="First Name..." name="fname_txt" id="fname_txt"/>
                                        </div>

                                        <div class="txt_fields_span">
                                            <span>Last Name</span>
                                        </div>
                                        <div class="txt_fields" id="lnamediv">
                                            <input type="" class="pass-input" onkeyup="txtTypedlname();"  placeholder="Last Name..." name="lname_txt" id="lname_txt"/>
                                        </div>

                                        <div class="txt_fields_span">
                                            <span>Date Of Birth</span>
                                        </div>
                                        <div class="txt_fields" id="dobdiv">
                                            <input type="date" class="pass-input" onchange="dobChange();" name="dob_txt" id="dob_txt"  />
                                        </div>

                                        <div class="txt_fields_span">
                                            <span>Profile Pic</span>
                                        </div>
                                        <input type="file" class="file_pic" name="pro_pic" id="pro_pic"/>
                                        <button class="signin-button">Sign Up</button>


                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>

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

        <script type="text/javascript" src="JS/signup_view.js"></script>


    </body>
</html>
