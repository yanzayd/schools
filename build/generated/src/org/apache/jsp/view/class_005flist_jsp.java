package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class class_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  <div class=\"content\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <h4 class=\"title\">auditoire list List</h4>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content table-responsive table-full-width\">\n");
      out.write("                                <table class=\"table table-hover table-striped\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <th>ID</th>\n");
      out.write("                                        <th>Name</th>\n");
      out.write("                                        <th>Salary</th>\n");
      out.write("                                        <th>Country</th>\n");
      out.write("                                        <th>City</th>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>1</td>\n");
      out.write("                                            <td>Dakota Rice</td>\n");
      out.write("                                            <td>$36,738</td>\n");
      out.write("                                            <td>Niger</td>\n");
      out.write("                                            <td>Oud-Turnhout</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>2</td>\n");
      out.write("                                            <td>Minerva Hooper</td>\n");
      out.write("                                            <td>$23,789</td>\n");
      out.write("                                            <td>Curaçao</td>\n");
      out.write("                                            <td>Sinaai-Waas</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>3</td>\n");
      out.write("                                            <td>Sage Rodriguez</td>\n");
      out.write("                                            <td>$56,142</td>\n");
      out.write("                                            <td>Netherlands</td>\n");
      out.write("                                            <td>Baileux</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>");
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
