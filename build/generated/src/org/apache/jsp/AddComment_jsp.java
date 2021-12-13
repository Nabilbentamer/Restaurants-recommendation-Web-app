package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddComment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"ressources/css/AddComment.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <form class=\"comment-container\" >\n");
      out.write("        \n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-2\"> <img src=\"https://i.imgur.com/xELPaag.jpg\" width=\"70\" class=\"rounded-circle mt-2\"> </div>\n");
      out.write("                <div class=\"col-10\">\n");
      out.write("                    <div class=\"comment-box ml-2\">\n");
      out.write("                        \n");
      out.write("                        <form action=\"AddComment\" method=\"post\">\n");
      out.write("                            \n");
      out.write("                        <h4>Add a comment</h4>\n");
      out.write("                        <div class=\"rating\"> <input type=\"radio\" name=\"rating\" value=\"5\" id=\"5\"><label for=\"5\">☆</label> <input type=\"radio\" name=\"rating\" value=\"4\" id=\"4\"><label for=\"4\">☆</label> <input type=\"radio\" name=\"rating\" value=\"3\" id=\"3\"><label for=\"3\">☆</label> <input type=\"radio\" name=\"rating\" value=\"2\" id=\"2\"><label for=\"2\">☆</label> <input type=\"radio\" name=\"rating\" value=\"1\" id=\"1\"><label for=\"1\">☆</label> </div>\n");
      out.write("                        <div class=\"comment-area\"> \n");
      out.write("                        <textarea class=\"form-control\" placeholder=\"what do you think?\" rows=\"4\" name=\"textArea\"></textarea> </div>\n");
      out.write("                        <div class=\"comment-btns mt-2\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                        <input type=\"hidden\"  name=\"memberId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${memberId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                                        <input type=\"hidden\" name=\"restauId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${restauId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("                                        \n");
      out.write("                                        <div class=\"pull-left\"> <input type=\"button\" class=\"btn btn-success btn-sm\" value=\"cancel\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"pull-right\"> <input type=\"submit\" class=\"btn btn-success send btn-sm\" value=\"Send\"><i class=\"fa fa-long-arrow-right ml-1\"></i> </div>\n");
      out.write("                                </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
