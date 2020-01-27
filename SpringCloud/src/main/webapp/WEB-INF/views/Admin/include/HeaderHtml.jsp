<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
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
                			<c:if test="${not empty sessionScope.user }">
                			<!-- User Info -->
                			<li class="dropdown user user-menu">
                				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
                					<img class="user-image">
                					<span class="hidden-xs">${sessionScope.user.UserEmail}</span>
                				</a>
                				<ul class="dropdown-menu">
                					<li class="user-header">
                						<img class='img-circle'>
                						<p>${sessionScope.user.UserName}</p>
                					</li>
                					<li class="user-body">
                					</li>
                					<li class="user-footer">
                						<div class="pull-left">
                						</div>
                						<!-- ./Profile -->
                						<div class="pull-right">
                							<form name="logout" id="logout" method="" action="">
                								<button type="button" id="LogOutBtn" class="btn btn-default btn-flat">Sign Out</button>
                							</form>
                						</div>
                						<!-- ./Log Out -->
                					</li>
                				</ul>
                			</li>
                			<!-- ./User Info -->
                			</c:if>
                			<c:if test="${ empty sessionScope.user }">
                				<li>
                					<a href="<c:url value='/admin/Users/Login'/>">Login</a>
                				</li>
                				<!-- ./User Not Login -->
                			</c:if>
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
            				<p>User name</p>
                			<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            			</div>
        			</div>
        			<!-- ./user-panel -->
        			<!-- search form -->
        			<form action="#" method="get" class="sidebar-form">
        				<!-- _csrf -->
        				<input type="hidden" name="${_csrf.parameterName }"value="${_csrf.token }">
        				<div class="input-group">
        					<input type="text" name="search" class="form-control" placeholder="Search..."/>
        					<span class="input-group-btn">
        						<button type="button" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i></button>
        					</span>
        				</div>
        			</form>
        			<!-- ./search form -->
        			<!-- Sidebar Item -->
        			<ul class="sidebar-menu">
        				<li class="header">MAIN NAVIGATION</li>
        				<!-- tree-view -->
        				<li class="treeview">
        					<a href="#">
        						<i class="fa fa-users"></i><span>Member</span>
        						<span class="pull-right-container">
        							<i class="fa fa-angle-left pull-right"></i>
        						</span>
        					</a>
        					<!-- treeview-item -->
        					<ul class="treeview-menu">
        						<li><a href="<c:url value='/admin/Members/Registe'/>"><i class="fa fa-circle-o"></i>Member Registe</a>
        						<li><a href="<c:url value='/admin/Users/list'/>"><i class="fa fa-circle-o"></i>Member List</a>
        					</ul>
        					<!-- ./treeview-item -->
        				</li>
        				<!-- ./tree-view -->
        				<!-- tree-view -->
        				<li class="treeview">
        					<a href="#">
        						<i class="fa fa-inbox"></i><span>Site</span>
        						<span class="pull-right-container">
        							<i class="fa fa-angle-left pull-right"></i>
        						</span>
        					</a>
        					<!-- treeview-item -->
        					<ul class="treeview-menu">
        						<li><a href="#SiteRegiste"><i class="fa fa-circle-o"></i>Site Create</a>
        						<li><a href="#SiteList"><i class="fa fa-circle-o"></i>Site List</a>
        					</ul>
        					<!-- ./treeview-item -->
        				</li>
        				<!-- ./tree-view -->
        				<!-- tree-view -->
        				<li class="treeview">
        					<a href="#">
        						<i class="fa fa-folder"></i><span>Plots</span>
        						<span class="pull-right-container">
        							<i class="fa fa-angle-left pull-right"></i>
        						</span>
        					</a>
        					<!-- treeview-item -->
        					<ul class="treeview-menu">
        						<li><a href="#PlotRegiste"><i class="fa fa-circle-o"></i>Plot Create</a>
        						<li><a href="#PlotList"><i class="fa fa-circle-o"></i>Plot List</a>
        					</ul>
        					<!-- ./treeview-item -->
        				</li>
        				<!-- ./tree-view -->
        					<!-- tree-view -->
        				<li class="treeview">
        					<a href="#">
        						<i class="fa fa-hdd-o"></i><span>Devices</span>
        						<span class="pull-right-container">
        							<i class="fa fa-angle-left pull-right"></i>
        						</span>
        					</a>
        					<!-- treeview-item -->
        					<ul class="treeview-menu">
        						<li><a href="#DeviceRegiste"><i class="fa fa-circle-o"></i>Device Create</a>
        						<li><a href="#DeviceList"><i class="fa fa-circle-o"></i>Device List</a>
        					</ul>
        					<!-- ./treeview-item -->
        				</li>
        				<!-- ./tree-view -->
        			</ul>
        			<!-- ./Sidebar Item -->
        		<!-- end nav item -->
    			</section>
    			<!-- /.sidebar -->
			</aside>
			<!-- ./left side bar -->
		<!-- ./left side bar -->