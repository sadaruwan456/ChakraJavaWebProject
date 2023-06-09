package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Navibar02_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/NavibarCss02.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"\">\n");
      out.write("        <section>\n");
      out.write("            <div class=\"section1\">\n");
      out.write("                <img src=\"IMG/chakraTMicon.jpg\" class=\"logo\"/>\n");
      out.write("                <div class=\"navigate\">\n");
      out.write("                    <img src=\"IMG/bars-solid.svg\" class=\"toggle\"/>\n");
      out.write("                    <a class=\"cgr\">Categories</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <a class=\"submanu\">Half Sleeve</a>\n");
      out.write("                    <a class=\"submanu\">Neck Crew</a>\n");
      out.write("                    <a class=\"submanu\">Long Sleeve</a>\n");
      out.write("                    <a class=\"submanu\">Polo Collar</a>\n");
      out.write("                    <a class=\"submanu\">V-neck</a>\n");
      out.write("                    <a class=\"submanu\">Douche bag neck</a>\n");
      out.write("                    <a class=\"submanu\">Henley Collar</a>\n");
      out.write("                    <a class=\"submanu\">Baseball T-shirt</a>\n");
      out.write("                    <a class=\"submanu\">Raglan sleeve</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"section2\">\n");
      out.write("                <input type=\"text\" placeholder=\"Serach...\" class=\"txtscrh\"/><button class=\"btnscrh\">Search</button>\n");
      out.write("                <img src=\"IMG/phone-volume-solid.svg\" class=\"call_icon\"/>\n");
      out.write("                <span class=\"tel_no\">+94 76 942 4681</span>\n");
      out.write("                <img src=\"IMG/shopping-cart-solid.svg\" class=\"cart_img\"/>\n");
      out.write("                <img src=\"IMG/user-circle-regular.svg\" class=\"profile_img\"/>\n");
      out.write("\n");
      out.write("                <nav>\n");
      out.write("                    <a class=\"navi_item\">Home</a>\n");
      out.write("                    <a class=\"navi_item\">Items(s)</a>\n");
      out.write("                    <a class=\"navi_item\">Wish List</a>\n");
      out.write("                    <a class=\"navi_item\">My Account</a>\n");
      out.write("                    <a class=\"navi_item\">About Us</a>\n");
      out.write("                    <a class=\"navi_item\">Contact Us</a>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"slider\">\n");
      out.write("                    <div class=\"slides\">\n");
      out.write("                        <div class=\"slide1\" id=\"sld01\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\" class=\"img1\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"slide1\" id=\"sld02\" >\n");
      out.write("                            <img src=\"Product_Images/whiteT.png\" class=\"img2\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"slide1\" id=\"sld0\">\n");
      out.write("                            <img src=\"Product_Images/RedT.png\" class=\"img3\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"constant\">\n");
      out.write("                            <h1>Chakra T-Shirt</h1>\n");
      out.write("\n");
      out.write("                            <p>This is a special t-shirt print name of Chakra. Stocks are limited..</p>\n");
      out.write("                            <a href=\"#\" class=\"btnshop\" onclick=\"autoAni();\">Shop Now</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!-----------------------------------------Latest Products------------------------------------------------>\n");
      out.write("                <!---------------------------Heder-------------------->\n");
      out.write("                <div class=\"content1\">\n");
      out.write("                    <div class=\"content1_hed\">\n");
      out.write("                        <span>Latest T-Shirts</span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"products\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-----------------------------------Products----------------------------------------------->\n");
      out.write("                        <div class=\"product01\">\n");
      out.write("                            <div class=\"imagebox\">\n");
      out.write("                                <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"specify\">\n");
      out.write("                                <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                                <span class=\"color_hed\">BLACK</span>\n");
      out.write("                                <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                                <label class=\"lb\">Size</label>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>XS</li>\n");
      out.write("                                    <li>S</li>\n");
      out.write("                                    <li>M</li>\n");
      out.write("                                    <li>L</li>\n");
      out.write("                                    <li>XL</li>\n");
      out.write("                                    <li>XXL</li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                                <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                                <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"product01\">\n");
      out.write("                            <div class=\"imagebox\">\n");
      out.write("                                <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"specify\">\n");
      out.write("                                <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                                <span class=\"color_hed\">BLACK</span>\n");
      out.write("                                <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                                <label class=\"lb\">Size</label>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>XS</li>\n");
      out.write("                                    <li>S</li>\n");
      out.write("                                    <li>M</li>\n");
      out.write("                                    <li>L</li>\n");
      out.write("                                    <li>XL</li>\n");
      out.write("                                    <li>XXL</li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                                <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                                <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"product01\">\n");
      out.write("                            <div class=\"imagebox\">\n");
      out.write("                                <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"specify\">\n");
      out.write("                                <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                                <span class=\"color_hed\">BLACK</span>\n");
      out.write("                                <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                                <label class=\"lb\">Size</label>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>XS</li>\n");
      out.write("                                    <li>S</li>\n");
      out.write("                                    <li>M</li>\n");
      out.write("                                    <li>L</li>\n");
      out.write("                                    <li>XL</li>\n");
      out.write("                                    <li>XXL</li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                                <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                                <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("<!--                -----------------------------------------------Discounted Items--------------------------------------------------------\n");
      out.write("                \n");
      out.write("                -------------------Header---------------------------\n");
      out.write("                <div class=\"content2\">\n");
      out.write("                    <div class=\"content2_hed\">\n");
      out.write("                        <span>Discounted Items</span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"products\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ---------------------------------Product02---------------------------------------------\n");
      out.write("                        <div class=\"product01\">\n");
      out.write("                            <div class=\"imagebox\">\n");
      out.write("                                <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"dis_div\">\n");
      out.write("                                <span>25% Discount</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"specify\">\n");
      out.write("                                <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                                <span class=\"color_hed\">BLACK</span>\n");
      out.write("                                <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                                <label class=\"lb\">Size</label>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>XS</li>\n");
      out.write("                                    <li>S</li>\n");
      out.write("                                    <li>M</li>\n");
      out.write("                                    <li>L</li>\n");
      out.write("                                    <li>XL</li>\n");
      out.write("                                    <li>XXL</li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                                <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                                <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"product01\">\n");
      out.write("                            <div class=\"imagebox\">\n");
      out.write("                                <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"dis_div\">\n");
      out.write("                                <span>25% Discount</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"specify\">\n");
      out.write("                                <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                                <span class=\"color_hed\">BLACK</span>\n");
      out.write("                                <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                                <label class=\"lb\">Size</label>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>XS</li>\n");
      out.write("                                    <li>S</li>\n");
      out.write("                                    <li>M</li>\n");
      out.write("                                    <li>L</li>\n");
      out.write("                                    <li>XL</li>\n");
      out.write("                                    <li>XXL</li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                                <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                                <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"product01\">\n");
      out.write("                            <div class=\"imagebox\">\n");
      out.write("                                <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"dis_div\">\n");
      out.write("                                <span>25% Discount</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"specify\">\n");
      out.write("                                <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                                <span class=\"color_hed\">BLACK</span>\n");
      out.write("                                <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                                <label class=\"lb\">Size</label>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>XS</li>\n");
      out.write("                                    <li>S</li>\n");
      out.write("                                    <li>M</li>\n");
      out.write("                                    <li>L</li>\n");
      out.write("                                    <li>XL</li>\n");
      out.write("                                    <li>XXL</li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                                <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                                <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"JS/Navibar02.js\"></script>\n");
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
