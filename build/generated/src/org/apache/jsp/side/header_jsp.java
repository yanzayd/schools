package org.apache.jsp.side;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("        <div class=\"sidebar-wrapper\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"http://www.creative-tim.com\" class=\"simple-text\">\n");
      out.write("                   SCHOOL MANGEMENT\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                 <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                              <i class=\"fa fa-book\"></i>\n");
      out.write("                              <span>Auditoire</span>\n");
      out.write("                              </a>\n");
      out.write("                            <ul class=\"sub\">\n");
      out.write("                              <li><a href=\"?request=re\">Add new Auditoire</a></li>\n");
      out.write("                              <li><a href=\"?request=rt\">liste of Auditoires</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                              <i class=\"pe-7s-user\"></i>\n");
      out.write("                              <span>Student</span>\n");
      out.write("                              </a>\n");
      out.write("                            <ul class=\"sub\">\n");
      out.write("                              <li><a href=\"stuser.html\">Registration</a></li>\n");
      out.write("                              <li><a href=\"sttable.html\">liste of student</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"nav\">\n");
      out.write("                 <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                              <i class=\"pe-7s-user\"></i>\n");
      out.write("                              <span>Teacher</span>\n");
      out.write("                              </a>\n");
      out.write("                            <ul class=\"sub\">\n");
      out.write("                              <li><a href=\"teauser.html\">Add new Teacher</a></li>\n");
      out.write("                              <li><a href=\"teatable.html\">liste of Teachers</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"nav\">\n");
      out.write("                 <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                              <i class=\"pe-7s-user\"></i>\n");
      out.write("                              <span>Titulaire</span>\n");
      out.write("                              </a>\n");
      out.write("                            <ul class=\"sub\">\n");
      out.write("                              <li><a href=\"tiuser.html\">Add new Titulaire</a></li>\n");
      out.write("                              <li><a href=\"titable.html\">liste of Titulaires</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>");
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
