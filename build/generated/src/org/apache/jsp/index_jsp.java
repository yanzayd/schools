package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"style/img/favicon.ico\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\n");
      out.write("\t<title> School by Bedel</title>\n");
      out.write("\n");
      out.write("\t<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS     -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link href=\"style/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- Animation library for notifications   -->\n");
      out.write("    <link href=\"style/css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!--  Light Bootstrap Table core CSS    -->\n");
      out.write("    <link href=\"style/css/light-bootstrap-dashboard.css?v=1.4.0\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("    <link href=\"style/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("    \n");
      out.write("    \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href=\"style/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\n");
      out.write("    <style>\n");
      out.write("        .table > thead > tr > th {\n");
      out.write("            border-bottom-width: 1px;\n");
      out.write("            font-size: 12px;\n");
      out.write("            text-transform: none;\n");
      out.write("            color: #9A9A9A;\n");
      out.write("            font-weight: 400;\n");
      out.write("            padding-bottom: 5px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("    <div class=\"sidebar\" data-color=\"black\" data-image=\"style/img/sidebar-5.jpg\">\n");
      out.write("\n");
      out.write("    <!--   you can change the color of the sidebar using: data-color=\"blue | azure | green | orange | red | purple\" -->\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "side/header.jsp", out, false);
      out.write(" \n");
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
      out.write("                    <a class=\"navbar-brand\" href=\"#\">School</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--call of auditoire url from the header   -->\n");
      out.write("        ");

            if("class_list".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/class_list.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("          ");

            if("add_class".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/add_class.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("        ");

            if("add_student".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/add_student.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("        ");

            if("student_list".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/student_list.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("        ");

            if("add_teacher".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/add_teacher.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("        ");

            if("teacher_list".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/teacher_list.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("         ");

            if("add_holder".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/add_holder.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("        ");

            if("holder_list".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/holder_list.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("         ");

            if("course_list".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/course_list.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("         ");

            if("add_course".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/add_course.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("         ");

            if("add_distribution".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/add_distribution.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("        ");

            if("distribution_list".equals(request.getParameter("request")))
            {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "view/distribution_list.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("         ");

             }
         
         
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "side/footer.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"style/js/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"style/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<!--  Charts Plugin -->\n");
      out.write("\t<script src=\"style/js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"style/js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Google Maps Plugin    -->\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\n");
      out.write("\t<script src=\"style/js/light-bootstrap-dashboard.js?v=1.4.0\"></script>\n");
      out.write("        <!--date-->\n");
      out.write("</html>\n");
      out.write("\n");
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
