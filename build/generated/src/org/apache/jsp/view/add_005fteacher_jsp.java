package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fteacher_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"content\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <h4 class=\"title\">Add Teacher</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <form>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label> name</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\"  placeholder=\"Coursee Code\" value=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                          <div class=\"col-sm-12\">\n");
      out.write("                                               <div class=\"form-group\">\n");
      out.write("                                                <label> Qualification</label>\n");
      out.write("                                            <select class=\"form-control\">\n");
      out.write("                                              <option value=\"0\">Undergraduate</option>\n");
      out.write("                                              <option value=\"1\">Graduate </option>\n");
      out.write("                                              <option value=\"3\">Postgraduate </option>\n");
      out.write("                                            </select>\n");
      out.write("                                          </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label> Address</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\"  placeholder=\"Address\" value=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <label>Sex</label>\n");
      out.write("                                    <ul>\n");
      out.write("                                        \n");
      out.write("                                          <input type=\"radio\" id=\"f-option\" name=\"selector\">\n");
      out.write("                                          <label for=\"f-option\">Male</label>\n");
      out.write("\n");
      out.write("                                          <div class=\"check\"></div>\n");
      out.write("                                        \n");
      out.write("                                          <input type=\"radio\" id=\"s-option\" name=\"selector\">\n");
      out.write("                                          <label for=\"s-option\">Female</label>\n");
      out.write("\n");
      out.write("                                          <div class=\"check\"><div class=\"inside\"></div></div>\n");
      out.write("                                    </ul>\n");
      out.write("                                    \n");
      out.write("                                     <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label> Date Of Birth</label>\n");
      out.write("                                                <input type=\"date \" class=\"form-control\"  placeholder=\"Date Of Birth\" value=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"input-append date form_datetime\" data-date=\"2013-02-21T15:25:00Z\">\n");
      out.write("    <input size=\"16\" type=\"text\" value=\"\" readonly>\n");
      out.write("    <span class=\"add-on\"><i class=\"icon-remove\"></i></span>\n");
      out.write("    <span class=\"add-on\"><i class=\"icon-calendar\"></i></span>\n");
      out.write("</div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label> Email</label>\n");
      out.write("                                                <input type=\"email\" class=\"form-control\"  placeholder=\"email\" value=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label> Phone number</label>\n");
      out.write("                                                <input type=\"email\" class=\"form-control\"  placeholder=\"(243)-999-888-777\" value=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button class=\"btn btn-danger\" type=\"cancel\" >Cancel</button>\n");
      out.write("    \n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"submit\">Submit</button>\n");
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
      out.write("                                    <img class=\"avatar border-gray\" src=\"style/img/sidebar-4.jpg\" alt=\"...\"/>\n");
      out.write("\n");
      out.write("                                      <h4 class=\"title\">Teacher<br />\n");
      out.write("                                         <small>...</small>\n");
      out.write("                                      </h4>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"description text-center\"> La formation de l'excelence <br>\n");
      out.write("                                                    \n");
      out.write("                                </p>\n");
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(\".form_datetime\").datetimepicker({\n");
      out.write("        format: \"dd MM yyyy - hh:ii\",\n");
      out.write("        autoclose: true,\n");
      out.write("        todayBtn: true,\n");
      out.write("        startDate: \"2013-02-14 10:00\",\n");
      out.write("        minuteStep: 10\n");
      out.write("    });\n");
      out.write("</script>            ");
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
