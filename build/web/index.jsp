<%-- 
    Document   : index
    Created on : Aug 28, 2019, 10:51:52 AM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="style/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title> School by Bedel</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
    
    
    <link href="style/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="style/css/animate.min.css" rel="stylesheet"/>

    <!--  Light Bootstrap Table core CSS    -->
    <link href="style/css/light-bootstrap-dashboard.css?v=1.4.0" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="style/css/demo.css" rel="stylesheet" />
    
    
 


    <!--     Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <link href="style/css/pe-icon-7-stroke.css" rel="stylesheet" />
    <style>
        .table > thead > tr > th {
            border-bottom-width: 1px;
            font-size: 12px;
            text-transform: none;
            color: #9A9A9A;
            font-weight: 400;
            padding-bottom: 5px;
        }
    </style>
</head>
<body>

<div class="wrapper">
    <div class="sidebar" data-color="black" data-image="style/img/sidebar-5.jpg">

    <!--   you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple" -->

    <jsp:include page="side/header.jsp"/> 
    <div class="main-panel">
		<nav class="navbar navbar-default navbar-fixed">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">School</a>
                </div>
            </div>
        </nav>
        <!--call of auditoire url from the header   -->
        <%
            if("class_list".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/class_list.jsp"/>
        
         <%
             }
         
         %>
          <%
            if("add_class".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/add_class.jsp"/>
        
         <%
             }
         
         %>
        <%
            if("add_student".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/add_student.jsp"/>
        
         <%
             }
         
         %>
        <%
            if("student_list".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/student_list.jsp"/>
        
         <%
             }
         
         %>
        <%
            if("add_teacher".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/add_teacher.jsp"/>
        
         <%
             }
         
         %>
        <%
            if("teacher_list".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/teacher_list.jsp"/>
        
         <%
             }
         
         %>
         <%
            if("add_holder".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/add_holder.jsp"/>
        
         <%
             }
         
         %>
        <%
            if("holder_list".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/holder_list.jsp"/>
        
         <%
             }
         
         %>
         <%
            if("course_list".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/course_list.jsp"/>
        
         <%
             }
         
         %>
         <%
            if("add_course".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/add_course.jsp"/>
        
         <%
             }
         
         %>
         <%
            if("add_distribution".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/add_distribution.jsp"/>
        
         <%
             }
         
         %>
        <%
            if("distribution_list".equals(request.getParameter("request")))
            {
        %>
        <jsp:include page="view/distribution_list.jsp"/>
        
         <%
             }
         
         %>
        
        
        
        
        
        <jsp:include page="side/footer.jsp"/>
    </div>
</div>


</body>

    <!--   Core JS Files   -->
    <script src="style/js/jquery.3.2.1.min.js" type="text/javascript"></script>
	<script src="style/js/bootstrap.min.js" type="text/javascript"></script>

	<!--  Charts Plugin -->
	<script src="style/js/chartist.min.js"></script>

    <!--  Notifications Plugin    -->
    <script src="style/js/bootstrap-notify.js"></script>

    <!--  Google Maps Plugin    -->
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>

    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->
	<script src="style/js/light-bootstrap-dashboard.js?v=1.4.0"></script>
        <!--date-->
</html>

