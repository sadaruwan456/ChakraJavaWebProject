package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Sign_005fup_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/Login_css.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-div\">\n");
      out.write("            <div class=\"logo\"></div>\n");
      out.write("            <div class=\"tittle\">Chakra</div>\n");
      out.write("            <div class=\"sub-tittle\">Store</div>\n");
      out.write("            <div class=\"fields\">\n");
      out.write("                <div class=\"txt_fields\">\n");
      out.write("                     <input type=\"text\" class=\"user-input\" placeholder=\"First Name...\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"txt_fields\">\n");
      out.write("                    <input type=\"text\" class=\"pass-input\" placeholder=\"Last Name...\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"txt_fields\">\n");
      out.write("                    <input type=\"date\" class=\"pass-input\" placeholder=\"DOB\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"txt_fields\">\n");
      out.write("                    <input type=\"text\" class=\"pass-input\" placeholder=\"Email..\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"txt_fields\">\n");
      out.write("                    <input type=\"password\" class=\"pass-input\" placeholder=\"Password...\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"txt_fields\">\n");
      out.write("                    <input type=\"password\" class=\"pass-input\" placeholder=\"Confirm Password...\"/>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"signin-button\">Login</button>\n");
      out.write("                \n");
      out.write("                <div class=\"link\">\n");
      out.write("                    <a href=\"#\">Forgot Password</a> or <a href=\"#\">Sign Up</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
