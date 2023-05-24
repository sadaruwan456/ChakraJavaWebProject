package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hibernate.Customer;

public final class MyAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/MyAcountCSS.css\"/>\n");
      out.write("\n");
      out.write("        <title>Chakra My Account Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"align_footer\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section>\n");
      out.write("                <div class=\"section1\">\n");
      out.write("                    <img src=\"IMG/chakraTMicon.jpg\" class=\"logo\"/>\n");
      out.write("                    <div class=\"filter_section\">\n");
      out.write("\n");
      out.write("                        <div class=\"sub_filter01\">\n");
      out.write("                            <span class=\"fname_span\">Dilanka</span>\n");
      out.write("                            <span class=\"lname_span\">Sadaruwan</span>\n");
      out.write("\n");
      out.write("                            <div class=\"pro_img_div\">\n");
      out.write("                                <img src=\"Profile_Images/04.jpg\" class=\"pro_img\"/>                         \n");
      out.write("                                <a>Edit Profile</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sub_filter01\">\n");
      out.write("                            <span class=\"oder_hed\">Orders</span>\n");
      out.write("                            <a class=\"oder_items\">To be Delivered</a>\n");
      out.write("                            <a class=\"oder_items\">Delivering</a>\n");
      out.write("                            <a class=\"oder_items\">Delivery Completed</a>\n");
      out.write("                            <a class=\"oder_items\">Refund & Disputes</a>\n");
      out.write("                            <a class=\"oder_items\">Change Delivery Address</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"section2\">\n");
      out.write("                    \n");
      out.write("                    <nav>\n");
      out.write("                        <a href=\"Home.jsp\" class=\"navi_item\">Home</a>\n");
      out.write("                        <a class=\"navi_item\">Items(s)</a>\n");
      out.write("                        <a class=\"navi_item\">Wish List</a>\n");
      out.write("                        <a href=\"#\" class=\"navi_item active\">My Account</a>\n");
      out.write("                        <a class=\"navi_item\">About Us</a>\n");
      out.write("                        <a class=\"navi_item\">Contact Us</a>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                    <!--------------------------products------------------------------------------->\n");
      out.write("                    <div class=\"summary_main\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"summary_sub01\">\n");
      out.write("                            <span>Orders Summaries</span>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"summary_sub02\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"summary_con\">\n");
      out.write("                                <span>0</span>\n");
      out.write("                                <span>All Orders</span>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"summary_con\">\n");
      out.write("                                <span>0</span>\n");
      out.write("                                <span>Awaiting Payments</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"summary_con\">\n");
      out.write("                                <span>0</span>\n");
      out.write("                                <span>Awaiting Delivery</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"summary_con\">\n");
      out.write("                                <span>0</span>\n");
      out.write("                                <span>Awaiting Feedback</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"summary_con_last\">\n");
      out.write("                                <span>0</span>\n");
      out.write("                                <span>Disputes</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </section> \n");
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
      out.write("     \n");
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
