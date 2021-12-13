package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CompleteProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <title>CasaFoodie</title>\n");
      out.write("\n");
      out.write("    <!------ Custom Style ------> \n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"ressources/css/CompleteProfile.css\">\n");
      out.write("\n");
      out.write("    <!----------- font awsome Icons -------->\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"ressources/css/all.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("<section>\n");
      out.write("    <!--------------------- Navigation ------------------------>\n");
      out.write("        \n");
      out.write("    <nav class=\"nav\">\n");
      out.write("        <div class=\"flex-row\">\n");
      out.write("\n");
      out.write("            <div class=\"nav-brand\">\n");
      out.write("                <a href=\"acceuil.jsp\">Casafoodie</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <ul class=\"nav-items\">\n");
      out.write("\n");
      out.write("                    <li class=\"nav-link\">\n");
      out.write("                        <a href=\"acceuil.jsp\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-link\">\n");
      out.write("                        <a href=\"#\">Reviews</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-link\">\n");
      out.write("                        <a href=\"#\">Contact us</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                <div class=\"social\">\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-----------xx---------- Navigation ------------xx------------>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!------------------------log in Form --------------------------\n");
      out.write("\n");
      out.write("    <section class=\"login\"> \n");
      out.write("        \n");
      out.write("        <form action=\"uploadServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            \n");
      out.write("        <input type=\"file\" name=\"photo\"> <br> \n");
      out.write("        <input type=\"submit\" value=\"upload file\"> \n");
      out.write("        \n");
      out.write("        <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("        <img src=\"data:image/jpg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.base64image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" width=\"240\" height=\"300\"/>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </form> \n");
      out.write("        \n");
      out.write("    </section>\n");
      out.write("---->\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<main class=\"main-content\">\n");
      out.write("\n");
      out.write("<form class=\"signup-container\" action=\"UserProfile\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("    <!------------------------- left Area ---------------------------->\n");
      out.write("    <div class='left-container'>\n");
      out.write("      <h1>\n");
      out.write("        <i class=\"fas fa-utensils\"></i>\n");
      out.write("        CasaFoodie\n");
      out.write("      </h1>\n");
      out.write("      <div class='puppy'>\n");
      out.write("        <img src='https://s3-us-west-2.amazonaws.com/s.cdpn.io/38816/image-from-rawpixel-id-542207-jpeg.png'>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-----------xxx-------------- left Area ------------xxx---------------->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!------------------------------ Right Area ---------------------------------------->\n");
      out.write("    <div class='right-container'>\n");
      out.write("      <header>\n");
      out.write("        <h1>One More Step To Your Profile!</h1>\n");
      out.write("\n");
      out.write("        <div class='set'>\n");
      out.write("\n");
      out.write("          <div class='user-phone'>\n");
      out.write("            <label for='user-phone'>Phone Number</label>\n");
      out.write("            <input name=\"user-phone\"  id='user-phone' placeholder=\"User's Phone\" type='text'>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class='user-photo'>\n");
      out.write("            <button id='user-upload'>\n");
      out.write("              <i class='fas fa-camera-retro'></i>\n");
      out.write("            </button>\n");
      out.write("              <input type=\"file\" name=\"photo\">\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class='set'>\n");
      out.write("\n");
      out.write("          <div class='user-City'>\n");
      out.write("            <label for='user-City'>City</label>\n");
      out.write("            <input id='user-City' placeholder=\"User's City\" type='text' name=\"user-city\">\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("          <div class='user-name'>\n");
      out.write("            <label for='user-name'>State</label>\n");
      out.write("            <input id='user-name' placeholder=\"User's name\" type='text' name=\"user-state\">\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class='set'>\n");
      out.write("          <div class='user-gender'>\n");
      out.write("            <label for='user-gender-female'>Gender</label>\n");
      out.write("\n");
      out.write("            <div class='radio-container'>\n");
      out.write("              <input checked='' id='user-gender-female' name='user-gender' type='radio' value='female'>\n");
      out.write("              <label for='user-gender-female'>Female</label>\n");
      out.write("              <input id='user-gender-male' name='user-gender' type='radio' value='male'>\n");
      out.write("              <label for='user-gender-male'>Male</label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("            <div class='user-birthday'>\n");
      out.write("                <label for='user-birthday'>Birthday</label>\n");
      out.write("                <input id='user-birthday' placeholder='YYYY/MM/DD' type='text' name=\"user-birthday\">\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </header>\n");
      out.write("\n");
      out.write("      <footer>\n");
      out.write("\n");
      out.write("        <div class='set'>\n");
      out.write("          <button type=\"submit\"  id='skip'>Skip</button>\n");
      out.write("          <button type=\"submit\" id='next'>Save and continue</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!------------------------------ Right Area ---------------------------------------->\n");
      out.write("\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("  \n");
      out.write("</main> \n");
      out.write("\n");
      out.write("    <!--------------xx----------log in Form ------------------xx-------->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("\n");
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
