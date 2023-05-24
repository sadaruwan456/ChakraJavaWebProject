package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class itemview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/itemview_css.css\"/>\n");
      out.write("        <title>Chakra View Item</title>\n");
      out.write("    </head>\n");
      out.write("    <body  onload=\"loadProfile()\">\n");
      out.write("        <div class=\"align_footer\">\n");
      out.write("            <section>\n");
      out.write("                <div class=\"section1\">\n");
      out.write("                    <img src=\"IMG/chakraTMicon.jpg\" class=\"logo\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"section2\">\n");
      out.write("                    <div class=\"srch_hed_div\">\n");
      out.write("                        <div class=\"srch_ft_div\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Serach...\" class=\"txtscrh\"/><button class=\"btnscrh\">Search</button>\n");
      out.write("                            <img src=\"IMG/phone-volume-solid.svg\" class=\"call_icon\"/>\n");
      out.write("                            <span class=\"tel_no\">+94 76 942 4681</span>\n");
      out.write("                            <img src=\"IMG/shopping-cart-solid.svg\" class=\"cart_img\"/>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"pro_pic_div\" id=\"load_pro\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <nav>\n");
      out.write("                        <a href=\"Home.jsp\" class=\"navi_item\">Home</a>\n");
      out.write("                        <a class=\"navi_item active\">Items(s)</a>\n");
      out.write("                        <a class=\"navi_item\">Wish List</a>\n");
      out.write("                        <a href=\"Login.jsp\" class=\"navi_item\">My Account</a>\n");
      out.write("                        <a class=\"navi_item\">About Us</a>\n");
      out.write("                        <a class=\"navi_item\">Contact Us</a>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <div class=\"item_view\">\n");
      out.write("\n");
      out.write("                <div class=\"outer_item\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"item_subimg\">\n");
      out.write("                        <div class=\"view_item_img\">\n");
      out.write("                            <img  src=\"Product_Images/RedT.png\" class=\"product_view_img\"/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"item_name_div\">\n");
      out.write("                            <span class=\"item_head_name\">Chakra Red T-Shirt</span>\n");
      out.write("                            <span class=\"item_view_descropt\">casual solid plain check pattern and tropic  t-shirt</span>\n");
      out.write("                            <span class=\"item_price_head\">Rs. 1450.00/=</span>\n");
      out.write("                            <span class=\"item_color_hed\">color</span>\n");
      out.write("                            <span class=\"item_color_div\" style=\"background-color: red;\"></span>\n");
      out.write("                            <span class=\"size_hed\">Sizes</span>\n");
      out.write("\n");
      out.write("                            <select class=\"size_div\">\n");
      out.write("                                <option>Select Size</option>\n");
      out.write("                                <option>XS</option>\n");
      out.write("                                <option>S</option>\n");
      out.write("                                <option>M</option>\n");
      out.write("                                <option>L</option>\n");
      out.write("                                <option>XL</option>\n");
      out.write("                                <option>XXL</option>\n");
      out.write("                            </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <span class=\"avi_span\">Quantity</span>\n");
      out.write("                            <div class=\"qty_div\">\n");
      out.write("\n");
      out.write("                                <img src=\"IMG/plus-circle-solid.svg\" class=\"qty_btn\"/>\n");
      out.write("                                <div class=\"qty_num\">\n");
      out.write("\n");
      out.write("                                    <span>0</span>\n");
      out.write("                                </div>\n");
      out.write("                                <img src=\"IMG/minus-circle-solid.svg\" class=\"qty_btn\"/>\n");
      out.write("\n");
      out.write("                                <span class=\"qty_span\">Available : 10</span>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"btn_div\">\n");
      out.write("                        <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                        <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                        <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"similar_items_hed\">\n");
      out.write("                <span>Similar Items</span>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"Product_content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"products\">\n");
      out.write("\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product01\">\n");
      out.write("                        <div class=\"imagebox\">\n");
      out.write("                            <img src=\"Product_Images/blackT.png\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"specify\">\n");
      out.write("                            <span class=\"item_name_h\">Chakra T-Shirt</span>\n");
      out.write("                            <span class=\"color_hed\">BLACK</span>\n");
      out.write("                            <div class=\"price_div\">Rs. 1450.00</div>\n");
      out.write("\n");
      out.write("                            <label class=\"lb\">Size</label>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>XS</li>\n");
      out.write("                                <li>S</li>\n");
      out.write("                                <li>M</li>\n");
      out.write("                                <li>L</li>\n");
      out.write("                                <li>XL</li>\n");
      out.write("                                <li>XXL</li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <a class=\"btn_cart\">Add to Cart</a><br/>\n");
      out.write("                            <a class=\"btn_buy\">Buy it Now</a><br/>\n");
      out.write("                            <a class=\"btn_wish\">Add to Wishlist</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("        <!------------------footer--------------------->\n");
      out.write("\n");
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
      out.write("        <script type=\"text/javascript\" src=\"JS/load_login.js\"></script>\n");
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
