<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Admin Index Page</title>
	<!-- Font Awesome -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
	<!-- Ionicons -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
	<!-- sweetalert2 -->
	<link rel='stylesheet' href='https://cdn.rawgit.com/t4t5/sweetalert/v0.2.0/lib/sweet-alert.css'>
	<!-- sweetalert2 -->
	<link rel="stylesheet" href="https://cdn.rawgit.com/t4t5/sweetalert/v0.2.0/lib/sweet-alert.css">
	<!-- bootstrap stylesheet 3.3.6 -->
	<link rel="stylesheet" href="<c:url value='/resources/Admin/bootstrap/css/bootstrap.min.css'/>">
	<!-- jvectormap -->
	<link rel="stylesheet" href="<c:url value='/resources/Admin/plugins/jvectormap/jquery-jvectormap-1.2.2.css'/>">
	<!-- Date Picker -->
	<link rel="stylesheet" href="<c:url value='/resources/Admin/plugins/datepicker/datepicker3.css'/>">
	<!-- Daterange picker -->
	<link rel="stylesheet" href="<c:url value='/resources/Admin/plugins/daterangepicker/daterangepicker.css'/>">
	<!-- Theme style -->
	<link rel="stylesheet" href="<c:url value='/resources/Admin/dist/css/AdminLTE.min.css'/>">
	<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="<c:url value='/resources/Admin/dist/css/skins/_all-skins.min.css'/>">
    
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<!-- header -->
		<header class="main-header">
    			<!-- Logo -->
    			<a href="/" class="logo">
        			<!-- mini logo for sidebar mini 50x50 pixels -->
        			<span class="logo-mini"><b>C</b>&amp;H</span>
        			<!-- logo for regular state and mobile devices -->
        			<span class="logo-lg"><b>C &amp; H </b></span>
    			</a>
    			<!-- Header Navbar: style can be found in header.less -->
    			<nav class="navbar navbar-static-top">
        			<!-- Sidebar toggle button-->
        			<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            			<span class="sr-only">Toggle navigation</span>
        			</a>
        			<div class="navbar-custom-menu">
            			<ul class="nav navbar-nav">
                			<!-- Tasks: style can be found in dropdown.less -->
                			<!-- header nav 들어가는 부분 -->
                
            			</ul>
        			</div>
    			</nav>
		</header>
		<!-- ./header -->
		<!-- left side bar -->
		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
    			<!-- sidebar: style can be found in sidebar.less -->
    			<section class="sidebar">
        			<!-- Sidebar user panel -->
        			<div class="user-panel">
            			<div class="pull-left image">
                			 <img src="<c:url value='/resources/Share/Img/logo_iot.png'/>" class="img-circle" alt="User Image">
            			</div>
            			<div class="pull-left info">
                			<!-- <a href="#"><i class="fa fa-circle text-success"></i> Online</a> -->
            			</div>
        			</div>
        			<!-- nav item -->
        	
        		<!-- end nav item -->
    			</section>
    			<!-- /.sidebar -->
			</aside>
			<!-- ./left side bar -->
		<!-- ./left side bar -->
		<div class="content-wrapper">
        		<div class="content">
                
            </div>
            <!--/.content-->
        </div>
        <!-- /.content-wrapper-->
		<!-- footer -->
		<footer class="main-footer">
    			<div class="pull-right hidden-xs">
        			06252, 서울특별시 강남구 강남대로 320, 황화빌딩 1505호
        			<div style="margin-right:0%; padding-right:0%; text-align:right;">
            			Tel. <b>02.501.3869</b>
            			<br> Fax. <b>02.556.0480</b>
            			<br> E-mail. <b>info@candh.co.kr</b>
        			</div>
    			</div>
    			<img src="<c:url value='/resources/Share/Img/logo.png'/>" alt="logo">
    			<br>
    			<strong><a href="http://www.candh.co.kr/">C&amp;h</a>.</strong> All rights reserved.
		</footer>
		<!-- ./footer -->
	</div>
    <!--/.wrapper-->
</body>
	<!-- jquery 2.2.3 -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.3/jquery.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
	<!-- Bootstrap 3.3.6 -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<!-- moment -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
	<!-- sweetalert2 -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/8.11.8/sweetalert2.all.min.js"></script>
	<!-- sweetalert2 -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/8.11.8/sweetalert2.all.min.js"></script>
	<!-- jvectormap -->
	<script src="<c:url value='/resources/Admin/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js'/>"></script>
	<script src="<c:url value='/resources/Admin/plugins/jvectormap/jquery-jvectormap-world-mill-en.js'/>"></script>
	<!-- SlimScroll 1.3.0 -->
	<script src="<c:url value='/resources/Admin/plugins/slimScroll/jquery.slimscroll.min.js'/>"></script>
	<!-- Optional: include a polyfill for ES6 Promises for IE11 -->
	<!--<script src="https://cdn.jsdelivr.net/npm/promise-polyfill"></script>-->
	<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<!--<script src="/static/admin/dist/js/pages/dashboard2.js"></script>-->
	<!--<script src="/static/admin/dist/js/pages/dashboard.js"></script>-->
	<!-- AdminLTE for demo purposes -->
	<script src="<c:url value='/resources/Admin/dist/js/demo.js'/>"></script>
	<script src="<c:url value='/resources/Admin/dist/js/app.min.js'/>"></script>
</html>