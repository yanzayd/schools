package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class teauser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Teacher</a>\n");
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
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <h4 class=\"title\">Teacher</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <form>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-5\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>School (disabled)</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" disabled placeholder=\"School\" value=\"CSchool Management\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Username</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Username\" value=\"michael23\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>First Name</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Company\" value=\"Mike\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Last Name</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Last Name\" value=\"Andrew\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Address</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Home Address\" value=\"Bld Mihail Kogalniceanu, nr. 8 Bl 1, Sc 1, Ap 09\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>City</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"City\" value=\"Mike\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Country</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Country\" value=\"Andrew\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Postal Code</label>\n");
      out.write("                                                <input type=\"number\" class=\"form-control\" placeholder=\"ZIP Code\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>About Me</label>\n");
      out.write("                                                <textarea rows=\"5\" class=\"form-control\" placeholder=\"Here can be your description\" value=\"Mike\">Lamborghini Mercy, Your chick she so thirsty, I'm in that two seat Lambo.</textarea>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-info btn-fill pull-right\">Register</button>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"card card-user\">\n");
      out.write("                            <div class=\"image\">\n");
      out.write("                                <img src=\"https://ununsplash.imgix.net/photo-1431578500526-4d9613015464?fit=crop&fm=jpg&h=300&q=75&w=400\" alt=\"...\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <div class=\"author\">\n");
      out.write("                                     <a href=\"#\">\n");
      out.write("                                    <img class=\"avatar border-gray\" src=\"assets/img/faces/face-3.jpg\" alt=\"...\"/>\n");
      out.write("\n");
      out.write("                                      <h4 class=\"title\">Teacher<br />\n");
      out.write("                                         <small>...</small>\n");
      out.write("                                      </h4>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <hr>\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <button href=\"#\" class=\"btn btn-simple\"><i class=\"fa fa-facebook-square\"></i></button>\n");
      out.write("                                <button href=\"#\" class=\"btn btn-simple\"><i class=\"fa fa-twitter\"></i></button>\n");
      out.write("                                <button href=\"#\" class=\"btn btn-simple\"><i class=\"fa fa-google-plus-square\"></i></button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../side/footer.jsp", out, false);
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
      out.write("</html>\n");
      out.write("s");
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