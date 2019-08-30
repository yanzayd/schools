package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sttable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../side/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("\t\t<nav class=\"navbar navbar-default navbar-fixed\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navigation-example-2\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Table List</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"hidden-lg hidden-md\">Dashboard</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <i class=\"fa fa-globe\"></i>\n");
      out.write("                                    <b class=\"caret hidden-sm hidden-xs\"></b>\n");
      out.write("                                    <span class=\"notification hidden-sm hidden-xs\">5</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"hidden-lg hidden-md\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t5 Notifications\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b class=\"caret\"></b>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("                              </a>\n");
      out.write("                              <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"#\">Notification 1</a></li>\n");
      out.write("                                <li><a href=\"#\">Notification 2</a></li>\n");
      out.write("                                <li><a href=\"#\">Notification 3</a></li>\n");
      out.write("                                <li><a href=\"#\">Notification 4</a></li>\n");
      out.write("                                <li><a href=\"#\">Another notification</a></li>\n");
      out.write("                              </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"\">\n");
      out.write("                                <i class=\"fa fa-search\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"hidden-lg hidden-md\">Search</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"\">\n");
      out.write("                               <p>Account</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\tDropdown\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b class=\"caret\"></b>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("                              </a>\n");
      out.write("                              <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"#\">Action</a></li>\n");
      out.write("                                <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                <li><a href=\"#\">Something</a></li>\n");
      out.write("                                <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                <li><a href=\"#\">Something</a></li>\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("                                <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                              </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <p>Log out</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\t\t\t\t\t\t<li class=\"separator hidden-lg hidden-md\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <h4 class=\"title\">Student's List</h4>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content table-responsive table-full-width\">\n");
      out.write("                                <table class=\"table table-hover table-striped\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <th>ID</th>\n");
      out.write("                                    \t<th>Name</th>\n");
      out.write("                                    \t<th>Salary</th>\n");
      out.write("                                    \t<th>Country</th>\n");
      out.write("                                    \t<th>City</th>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                        \t<td>1</td>\n");
      out.write("                                        \t<td>Dakota Rice</td>\n");
      out.write("                                        \t<td>$36,738</td>\n");
      out.write("                                        \t<td>Niger</td>\n");
      out.write("                                        \t<td>Oud-Turnhout</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                        \t<td>2</td>\n");
      out.write("                                        \t<td>Minerva Hooper</td>\n");
      out.write("                                        \t<td>$23,789</td>\n");
      out.write("                                        \t<td>Curaçao</td>\n");
      out.write("                                        \t<td>Sinaai-Waas</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                        \t<td>3</td>\n");
      out.write("                                        \t<td>Sage Rodriguez</td>\n");
      out.write("                                        \t<td>$56,142</td>\n");
      out.write("                                        \t<td>Netherlands</td>\n");
      out.write("                                        \t<td>Baileux</td>\n");
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
      out.write("        </div>\n");
      out.write("\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../side/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"../style/js/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"../style/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<!--  Charts Plugin -->\n");
      out.write("\t<script src=\"../style/js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"../style/js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Google Maps Plugin    -->\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\n");
      out.write("\t<script src=\"../style/js/light-bootstrap-dashboard.js?v=1.4.0\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\n");
      out.write("\t<script src=\"../style/js/demo.js\"></script>\n");
      out.write("\n");
      out.write("\n");
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
