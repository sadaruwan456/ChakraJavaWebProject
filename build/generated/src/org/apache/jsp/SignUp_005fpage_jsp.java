package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/Login_css.css\"/>\n");
      out.write("        <title>Chakra SignUp Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"align_footer\">\n");
      out.write("            <div id=\"myModal\" class=\"modal\">\n");
      out.write("\n");
      out.write("                <!-- Modal content -->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <span class=\"close\" id=\"close\" onclick=\"popClose()\">&times;</span>\n");
      out.write("                    <div class=\"pop_hed\">\n");
      out.write("                        <span>Email Verification</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pop_con\">\n");
      out.write("                        <span>Enter OTP code</span>\n");
      out.write("                        <input type=\"text\" id=\"otp_txt\" class=\"otp_txt\"/>\n");
      out.write("                        <button class=\"otp_btn\" onclick=\"nextact()\">Enter</button>\n");
      out.write("                        <span class=\"valide_lb\" id=\"valide_lb\">Invalid Code</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <section>\n");
      out.write("                <div class=\"section1\">\n");
      out.write("                    <img src=\"IMG/chakraTMicon.jpg\" class=\"logoh\"/>\n");
      out.write("\n");
      out.write("                    <div class=\"outer_design\">\n");
      out.write("                        <div class=\"back_img_sing\">\n");
      out.write("                            <img src=\"Product_Images/whiteT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"design_div\">\n");
      out.write("\n");
      out.write("                            <div class=\"design_des_div\">\n");
      out.write("                                <span class=\"design_des\">We selling Only best quality T-Shirts made in Sri Lanka </span>\n");
      out.write("                                <span class=\"design_plz\">Please</span>\n");
      out.write("                                <div class=\"log_dec\">\n");
      out.write("                                    <span class=\"design_log_span\">Register Now</span>\n");
      out.write("                                    <img src=\"IMG/hand-point-right-solid.svg\" class=\"img_svg\"/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <span class=\"design_last\">and stay with us...</span>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"section2\">                               \n");
      out.write("                    <nav>\n");
      out.write("                        <a href=\"Home.jsp\" class=\"navi_item\">Home</a>\n");
      out.write("                        <a class=\"navi_item\">Items(s)</a>\n");
      out.write("                        <a class=\"navi_item\">Wish List</a>\n");
      out.write("                        <a class=\"navi_item\">My Account</a>\n");
      out.write("                        <a class=\"navi_item\">About Us</a>\n");
      out.write("                        <a class=\"navi_item\">Contact Us</a>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                    <form onsubmit=\"return  testSect();\" action=\"Sign_up\"  method=\"POST\" enctype=\"multipart/form-data\" >\n");
      out.write("                        <div class=\"main_signUp_div\" >\n");
      out.write("                            <div class=\"sign_div01\" id=\"sign_div01\">\n");
      out.write("\n");
      out.write("                                <div class=\"signup-div\">\n");
      out.write("                                    <div class=\"logo\"></div>\n");
      out.write("                                    <div class=\"tittle\">Chakra</div>\n");
      out.write("                                    <div class=\"sub-tittle\">Store</div>\n");
      out.write("                                    <div class=\"fields\">\n");
      out.write("\n");
      out.write("                                        <div class=\"txt_fields_span\">\n");
      out.write("                                            <span>Email</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"txt_fields\" id=\"emaildiv\">\n");
      out.write("                                            <input  type=\"text\" class=\"pass-input\" onkeyup=\"txtTypeEmail();\" placeholder=\"Email..\" name=\"email_txt\" id=\"email_txt\"/>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"txt_fields_span_password\" >\n");
      out.write("                                            <span>Password</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"txt_fields\" id=\"passworddiv\">\n");
      out.write("                                            <input type=\"password\" class=\"pass-input\" onkeyup=\"passwordType();\" placeholder=\"Password...\" name=\"password_txt\" id=\"password_txt\"/>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"txt_fields\" id=\"passworcomddiv\">\n");
      out.write("                                            <input type=\"password\" class=\"pass-input\" onkeyup=\"passwordcomType();\" placeholder=\"Confirm Password...\" name=\"passwordcom_txt\" id=\"passwordcom_txt\"/>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <a class=\"next_btn\" onclick=\"testData()\">Next</a>\n");
      out.write("\n");
      out.write("                                        <div class=\"link\">\n");
      out.write("                                            <a href=\"#\">LogIn</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"sign_div02\">\n");
      out.write("                                <div class=\"signup-div\">\n");
      out.write("                                    <div class=\"logo\"></div>\n");
      out.write("                                    <div class=\"tittle\">Chakra</div>\n");
      out.write("                                    <div class=\"sub-tittle\">Store</div>\n");
      out.write("                                    <div class=\"fields\">\n");
      out.write("\n");
      out.write("                                        <div class=\"txt_fields_span\">\n");
      out.write("                                            <span>First Name</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"txt_fields\" id=\"fnamediv\">\n");
      out.write("                                            <input type=\"text\" class=\"user-input\" onkeyup=\"txtTypedfname();\" placeholder=\"First Name...\" name=\"fname_txt\" id=\"fname_txt\"/>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"txt_fields_span\">\n");
      out.write("                                            <span>Last Name</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"txt_fields\" id=\"lnamediv\">\n");
      out.write("                                            <input type=\"\" class=\"pass-input\" onkeyup=\"txtTypedlname();\"  placeholder=\"Last Name...\" name=\"lname_txt\" id=\"lname_txt\"/>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"txt_fields_span\">\n");
      out.write("                                            <span>Date Of Birth</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"txt_fields\" id=\"dobdiv\">\n");
      out.write("                                            <input type=\"date\" class=\"pass-input\" onchange=\"dobChange();\" name=\"dob_txt\" id=\"dob_txt\"  />\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"txt_fields_span\">\n");
      out.write("                                            <span>Profile Pic</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=\"file\" class=\"file_pic\" name=\"pro_pic\" id=\"pro_pic\"/>\n");
      out.write("                                        <button class=\"signin-button\">Sign Up</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"outer\">\n");
      out.write("                <div class=\"inner1\">\n");
      out.write("                    <h4>Information</h4>\n");
      out.write("                    <a>About</a>\n");
      out.write("                    <a>Delivery</a>\n");
      out.write("                    <a>Privacy Policy</a>\n");
      out.write("                    <a>Terms & Condition</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inner2\">\n");
      out.write("                    <h4>Customer Information</h4>\n");
      out.write("                    <a>Contact Us</a>\n");
      out.write("                    <a>Delivery Issus</a>\n");
      out.write("                    <a>Other Inquiries</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inner1\">\n");
      out.write("                    <h4>My Account</h4>\n");
      out.write("                    <a>Oder History</a>\n");
      out.write("                    <a>Wish List</a>\n");
      out.write("                    <a>News Latter</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inner2\">\n");
      out.write("                    <h4>Follow Us</h4>\n");
      out.write("                    <a>Facebook</a>\n");
      out.write("                    <a>Twitter</a>\n");
      out.write("                    <a>YouTube</a>\n");
      out.write("                    <a>Instagram</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <span>Powered By DeamSL  © 2020</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"JS/signup_view.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
