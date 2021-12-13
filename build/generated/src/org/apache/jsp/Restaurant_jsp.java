package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Restaurant_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <title>Restau page</title>\n");
      out.write("    <!-- Fonts -->\n");
      out.write("  <link type=\"text/css\" rel=\"stylesheet\" href=\"ressources/css/Restaurant.css\">\n");
      out.write("   <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500\" rel=\"stylesheet\">\n");
      out.write("    <!-- CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../fontawesome/css/all.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <main class=\"container\">\n");
      out.write("\n");
      out.write("      <!-- Left Column / Headphones Image -->\n");
      out.write("\n");
      out.write("      <div class=\"left-column\">\n");
      out.write("        <img src=\"./restau1.jpg\" width=\"600\" alt=\"\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- Right Column -->\n");
      out.write("      <div class=\"right-column\">\n");
      out.write("\n");
      out.write("        <!-- Product Description -->\n");
      out.write("        \n");
      out.write("        <div class=\"Restaurant-description\">\n");
      out.write("          <span>Restaurant/Casablanca</span>\n");
      out.write("          <h1>La Sqala Restaurant</h1>\n");
      out.write("          <p>Original spot. Creative cuisine. Passionate service. A trip around cultures. All day every day brunch, lunch and dinner\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Product Configuration -->\n");
      out.write("        <div class=\"product-configuration\">\n");
      out.write("\n");
      out.write("          <!-- Product Color -->\n");
      out.write("          <div class=\"Price-range\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div class=\"Price\">\n");
      out.write("              <span>Price Range</span> <br>\n");
      out.write("              <div>\n");
      out.write("                <span>$$ - $$$</span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("              <span>Good for </span><br> \n");
      out.write("              <div> \n");
      out.write("                <span>Kids</span>\n");
      out.write("              </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!-- Ratings and Reviews Details -->\n");
      out.write("          <div class=\"Rating-reviews-container\">\n");
      out.write("\n");
      out.write("            <span>Ratings And Reviews</span>\n");
      out.write("\n");
      out.write("            <div class=\"Rating-buttons\">\n");
      out.write("              <button>All rating <p>128 Reviews</p></button>\n");
      out.write("              <button>Positive Rating <p> 98% </p> </button>\n");
      out.write("              <button>OverAll Rating <p> 4.3/5 </p></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Product Pricing -->\n");
      out.write("\n");
      out.write("        <div class=\"user-buttons\">\n");
      out.write("          <a href=\"#\" class=\"cart-btn\">write Review</a>\n");
      out.write("          <a href=\"#\" class=\"cart-btn\" > Save to favorite </a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <div class=\"reviews-section-container\">\n");
      out.write("\n");
      out.write("    <div class=\"reviews-section\">\n");
      out.write("    \n");
      out.write("      <div class=\"review-one\">\n");
      out.write("          <div class=\"profile-image\">\n");
      out.write("              <img src=\"portrait2.jpg\" alt=\"\">\n");
      out.write("              <p>Nabil ben</p>\n");
      out.write("              <span class=\"review-number\">79reviews</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"main-review\">\n");
      out.write("                <div class=\"date-stars-section\">\n");
      out.write("                  <i class=\"fa fa-star\"></i>\n");
      out.write("                  <i class=\"fa fa-star\"></i>\n");
      out.write("                  <i class=\"fa fa-star\"></i>\n");
      out.write("                   <i class=\"fa fa-star\"></i>\n");
      out.write("                  <i class=\"fa fa-star\"></i>\n");
      out.write("\n");
      out.write("              <p class=\"Review-date\">Reviewed on December 19, 2021 </p>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"review-content\">\n");
      out.write("                  <h3> The service is not very good</h3>\n");
      out.write("                  <p>I went there with my family since we saw a good rating on the app The place not very clean(smelled really bad) I had a veggie burger with tartar sauce but when they brought me the burger was missing,it was just a friend cheese thing...More\n");
      out.write("\n");
      out.write("                  </p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"review-one\">\n");
      out.write("\n");
      out.write("        <div class=\"profile-image\">\n");
      out.write("            <img src=\"portrait2.jpg\" alt=\"\">\n");
      out.write("            <p class=\"profile-name\">Nabil ben</p>\n");
      out.write("            <span class=\"review-number\">79reviews</span>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"main-review\">\n");
      out.write("            <div class=\"date-stars-section\">\n");
      out.write("              <i class=\"fa fa-star\"></i>\n");
      out.write("              <i class=\"fa fa-star\"></i>\n");
      out.write("              <i class=\"fa fa-star\"></i>\n");
      out.write("               <i class=\"fa fa-star\"></i>\n");
      out.write("              <i class=\"fa fa-star\"></i>\n");
      out.write("  \n");
      out.write("\n");
      out.write("            <p class=\"Review-date\">Reviewed on December 19, 2021 </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"review-content\">\n");
      out.write("                <h3 class=\"review-title\"> The service is not very good</h3>\n");
      out.write("                <p >I went there with my family since we saw a good rating on the app The place not very clean(smelled really bad) I had a veggie burger with tartar sauce but when they brought me the burger was missing,it was just a friend cheese thing...More\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"border-separator\">\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  </body>\n");
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
