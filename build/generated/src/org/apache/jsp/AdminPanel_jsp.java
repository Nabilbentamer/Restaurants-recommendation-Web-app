package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Dashboard</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"adminPanel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css\">\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js\" charset=\"utf-8\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <input type=\"checkbox\" id=\"check\">\n");
      out.write("    <!--header area start-->\n");
      out.write("    <header>\n");
      out.write("      <label for=\"check\">\n");
      out.write("        <i class=\"fas fa-bars\" id=\"sidebar_btn\"></i>\n");
      out.write("      </label>\n");
      out.write("      <div class=\"left_area\">\n");
      out.write("        <h3>Casa <span>Foodie</span></h3>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"right_area\">\n");
      out.write("        <a href=\"#\" class=\"logout_btn\">Logout</a>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <!--header area end-->\n");
      out.write("    <!--mobile navigation bar start-->\n");
      out.write("    <div class=\"mobile_nav\">\n");
      out.write("      <div class=\"nav_bar\">\n");
      out.write("        <img src=\"1.png\" class=\"mobile_profile_image\" alt=\"\">\n");
      out.write("        <i class=\"fa fa-bars nav_btn\"></i>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"mobile_nav_items\">\n");
      out.write("        <a href=\"#\"><i class=\"fas fa-desktop\"></i><span>Dashboard</span></a>\n");
      out.write("        <a href=\"#\"><i class=\"fas fa-cogs\"></i><span>Components</span></a>\n");
      out.write("        <a href=\"#\"><i class=\"fas fa-table\"></i><span>Tables</span></a>\n");
      out.write("        <a href=\"#\"><i class=\"fas fa-th\"></i><span>Forms</span></a>\n");
      out.write("        <a href=\"#\"><i class=\"fas fa-info-circle\"></i><span>About</span></a>\n");
      out.write("        <a href=\"#\"><i class=\"fas fa-sliders-h\"></i><span>Settings</span></a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!--mobile navigation bar end-->\n");
      out.write("    <!--sidebar start-->\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("\n");
      out.write("      <div class=\"profile_info\">\n");
      out.write("        <img src=\"4.jpg\" class=\"profile_image\" alt=\"\">\n");
      out.write("        <h4>Admin</h4>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <a href=\"index.html\"><i class=\"fas fa-desktop\"></i><span>Dashboard</span></a>\n");
      out.write("      <a href=\"index.html\"><i class=\"far fa-user-circle\"></i><span>Users</span></a>\n");
      out.write("      <a href=\"./ManageComments.html\"><i class=\"fas fa-comment-dots\"></i><span>Comments</span></a>\n");
      out.write("      <a href=\"ManageRestaurant.html\"><i class=\"fas fa-utensils\"></i><span> Restaurants </span></a> \n");
      out.write("      <a href=\"#\"><i class=\"fas fa-info-circle\"></i><span>About</span></a>\n");
      out.write("      <a href=\"#\"><i class=\"fas fa-sliders-h\"></i><span>Settings</span></a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--sidebar end-->\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("\n");
      out.write("      <div class=\"users-button\">\n");
      out.write("      <button class=\"AddUser\"><a href=\"AddUser.html\">Add User</a></button>\n");
      out.write("      <button class=\"DisplayUsers\"><a href=\"AddUser.html\">Display Users</a></button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("      $('.nav_btn').click(function(){\n");
      out.write("        $('.mobile_nav_items').toggleClass('active');\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("  </body>\n");
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
