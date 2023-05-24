package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Chakra User Login Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"align_footer\">\n");
      out.write("            <div id=\"myModal\" class=\"modal\">\n");
      out.write("\n");
      out.write("                <!-- Modal content -->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <span class=\"close\" id=\"close\" onclick=\"popClose01()\">&times;</span>\n");
      out.write("                    <div class=\"pop_hed_login\">\n");
      out.write("                        <span>Incorrect Password or Username...!</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pop_con_login\">\n");
      out.write("                        <img src=\"IMG/icons8-warning-100.png\" class=\"warn_img\"/>\n");
      out.write("                        <button class=\"btn_close\" onclick=\"popClose01()\">close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"myModalDone\" class=\"modal_done\">\n");
      out.write("\n");
      out.write("                <!-- Modal content -->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <span class=\"close\" id=\"close\" onclick=\"popClose02()\">&times;</span>\n");
      out.write("                    <div class=\"pop_hed_login_done\">\n");
      out.write("                        <span>Login Successful</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pop_con_login\">\n");
      out.write("                        <img src=\"IMG/icons8-ok-100.png\" class=\"warn_img\"/>\n");
      out.write("                        <button class=\"btn_close2\" onclick=\"popClose02()\">close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <section>\n");
      out.write("                <div class=\"section1\">\n");
      out.write("                    <img src=\"IMG/chakraTMicon.jpg\" class=\"logoh\"/>\n");
      out.write("\n");
      out.write("                    <div class=\"outer_design\">\n");
      out.write("                        <div class=\"back_img\">\n");
      out.write("                            <img src=\"Product_Images/whiteT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"design_div\">\n");
      out.write("\n");
      out.write("                            <div class=\"design_des_div\">\n");
      out.write("                                <span class=\"design_des\">We selling Only best quality T-Shirts made in Sri Lanka </span>\n");
      out.write("                                <span class=\"design_plz\">Please</span>\n");
      out.write("                                <div class=\"log_dec\">\n");
      out.write("                                    <span class=\"design_log_span\">Login </span>\n");
      out.write("                                    <img src=\"IMG/hand-point-right-solid.svg\" class=\"img_svg\"/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <span class=\"design_last\">and stay with us</span>\n");
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
      out.write("\n");
      out.write("                    <div class=\"login-div\">\n");
      out.write("                        <div class=\"logo\"></div>\n");
      out.write("                        <div class=\"tittle\">Chakra</div>\n");
      out.write("                        <div class=\"sub-tittle\">Store</div>\n");
      out.write("                        <div class=\"fields\">\n");
      out.write("                            <div class=\"username\">\n");
      out.write("                                <svg fill=\"#999\" class=\"svg-icon\" viewBox=\"0 0 20 20\" >\n");
      out.write("                                <path d=\"M17.388,4.751H2.613c-0.213,0-0.389,0.175-0.389,0.389v9.72c0,0.216,0.175,0.389,0.389,0.389h14.775c0.214,0,0.389-0.173,0.389-0.389v-9.72C17.776,4.926,17.602,4.751,17.388,4.751 M16.448,5.53L10,11.984L3.552,5.53H16.448zM3.002,6.081l3.921,3.925l-3.921,3.925V6.081z M3.56,14.471l3.914-3.916l2.253,2.253c0.153,0.153,0.395,0.153,0.548,0l2.253-2.253l3.913,3.916H3.56z M16.999,13.931l-3.921-3.925l3.921-3.925V13.931z\"></path>\n");
      out.write("                                </svg> <input type=\"text\" id=\"cus_username\" class=\"user-input\" placeholder=\"Email...\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"password\">\n");
      out.write("                                <svg fill=\"#999\" class=\"svg-icon\" viewBox=\"0 0 20 20\">\n");
      out.write("                                <path d=\"M17.308,7.564h-1.993c0-2.929-2.385-5.314-5.314-5.314S4.686,4.635,4.686,7.564H2.693c-0.244,0-0.443,0.2-0.443,0.443v9.3c0,0.243,0.199,0.442,0.443,0.442h14.615c0.243,0,0.442-0.199,0.442-0.442v-9.3C17.75,7.764,17.551,7.564,17.308,7.564 M10,3.136c2.442,0,4.43,1.986,4.43,4.428H5.571C5.571,5.122,7.558,3.136,10,3.136 M16.865,16.864H3.136V8.45h13.729V16.864z M10,10.664c-0.854,0-1.55,0.696-1.55,1.551c0,0.699,0.467,1.292,1.107,1.485v0.95c0,0.243,0.2,0.442,0.443,0.442s0.443-0.199,0.443-0.442V13.7c0.64-0.193,1.106-0.786,1.106-1.485C11.55,11.36,10.854,10.664,10,10.664 M10,12.878c-0.366,0-0.664-0.298-0.664-0.663c0-0.366,0.298-0.665,0.664-0.665c0.365,0,0.664,0.299,0.664,0.665C10.664,12.58,10.365,12.878,10,12.878\"></path>\n");
      out.write("                                </svg> <input type=\"password\" id=\"cus_password\" class=\"pass-input\" placeholder=\"password...\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <button class=\"signin-button\" onclick=\"loginCustomer();\">Login</button>\n");
      out.write("\n");
      out.write("                            <div class=\"link\">\n");
      out.write("                                <a href=\"#\" >Forgot Password</a> or <a href=\"SignUp_page.jsp\">Sign Up</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
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
      out.write("        <script type=\"text/javascript\" src=\"JS/Login_customer.js\"></script>\n");
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
