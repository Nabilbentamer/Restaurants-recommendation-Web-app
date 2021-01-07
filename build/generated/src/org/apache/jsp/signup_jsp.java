package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"ressources/css/signup.css\">\n");
      out.write("    <!----------- font awsome Icons -------->\n");
      out.write("    <link rel=\"stylesheet\" href=\"ressources/css/all.css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("    <!------------------------log in Form -------------------------->\n");
      out.write("\n");
      out.write("    <section class=\"login\"> \n");
      out.write("        <div class=\"login-wrap\">\n");
      out.write("            <h2>Log in to CasaFoodie</h2>\n");
      out.write("            <div class=\"border\"></div>\n");
      out.write("            <h4>Already on casaFoodie? <a href=\"login.jsp\">log in</a></h4>\n");
      out.write("            \n");
      out.write("            <form action=\"login\" class=\"login-container\" method=\"post\" >\n");
      out.write("                \n");
      out.write("                <input type=\"text\" placeholder=\"full Name\" name=\"uname\">\n");
      out.write("                <input type=\"text\" placeholder=\"Email\" name=\"email\">\n");
      out.write("                <input type=\"text\" placeholder=\"Password\" name=\"password\">\n");
      out.write("                <input type=\"text\" placeholder=\"Confirm Password\">\n");
      out.write("                <input type=\"submit\" value=\"S'inscrire\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"image-back\">\n");
      out.write("            <img src=\"ressources/images/food1.jpg\" alt=\"\"  >\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("    <!--------------xx----------log in Form ------------------xx-------->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>");
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
