package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import com.foodie.servlets.recherche;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <title>CasaFoodie</title>\n");
      out.write("\n");
      out.write("    <!------ Custom Style ------> \n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"ressources/css/AddUser.css\">\n");
      out.write("\n");
      out.write("    <!----------- font awsome Icons -------->\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"ressources/css/all.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                    <a href=\"AddUser.jsp\"><i class=\"fab fa-facebook-f\"></i></a>\n");
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
      out.write("    \n");
      out.write("    <!-----------------------Admin Page Wrapper -------------------->\n");
      out.write("\n");
      out.write("    <div class=\"admin-wrapper\">\n");
      out.write("\n");
      out.write("        <div class=\"left-sidebar\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Manage users</a></li>\n");
      out.write("                <li><a href=\"#\">Manage restaurants</a></li>\n");
      out.write("                <li><a href=\"#\">Manage Reviews</a></li>\n");
      out.write("                <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/CommentSection\">Manage Comments</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"admin-content\">\n");
      out.write("            <div class=\"button-groupe\">\n");
      out.write("                <button class=\"btn\"><a href=\"AddUser.jsp\">Add User</a></button>\n");
      out.write("                <form action=\"DisplayUsers\" method=\"post\">\n");
      out.write("                <input type=\"submit\" class=\"btn\" value=\"Manage Users\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h2 class=\"page-title\">Manage Users</h2>\n");
      out.write("                <input type=\"hidden\" name=\"UserId\" value=\"ME\"> \n");
      out.write("                <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th colspan=\"2\">Action</th>\n");
      out.write("                    </thead>\n");
      out.write("                    \n");
      out.write("                    <tbody>\n");
      out.write("                        \n");
      out.write("                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("member");
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Members}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                        \n");
            out.write("                        <tr>\n");
            out.write("            \n");
            out.write("                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.uname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                            <td><a href=\"");
            out.print( request.getContextPath());
            out.write("/EditUser?UserId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("&action=edit\" class=\"edit\">Edit</a><td> \n");
            out.write("                            <td><a href=\"");
            out.print( request.getContextPath());
            out.write("/EditUser?UserId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("&action=delete\" class=\"delete\">Delete</a></td>                            \n");
            out.write("                        </tr>\n");
            out.write("\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("                        \n");
      out.write("                    </tbody>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-----------xxxxx------------Admin Page Wrapper -------------xxxxxx------->\n");
      out.write("    \n");
      out.write("    \n");
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
