<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
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
    			<a href="<c:url value='/admin'/>" class="logo">
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
                			<!-- User Info -->
                			<li class="dropdown user user-menu">
                				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
                					<img class="user-image">
                					<span class="hidden-xs">User Name</span>
                				</a>
                				<ul class="dropdown-menu">
                					<li class="user-header">
                						<img class='img-circle'>
                						<p>User Name</p>
                					</li>
                					<li class="user-body">
                					</li>
                					<li class="user-footer">
                					</li>
                				</ul>
                			</li>
                			<!-- ./User Info -->
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
		<div class="content-wrapper">
        		<div class="content">
                <div class='register-box'>
                		<div class="register-logo">
                			<a href="#"><b>Member </b>Registe</a>
                		</div>
                		<!-- ./register-logo -->
                		<div class="register-box-body">
                			<p class="login-box-msg">Registe New Member</p>
                			<form name="create" id="create" action="" method="">
                				<input type="hidden" id="_csrf" name="_csrf" value="">
                				<!-- ./csrf -->
                				<div class="form-group has-feedback">
                					<div class="input-group">
                						<input type="email" id="UserEmail" name="UserEmail" class="form-control" placeholder=" User Email" autocomplete="off">
                						<span class="input-group-btn">
                							<input id="EmailCheckFlag" type="hidden" value="">
                							<button type='button' id="EmailCheckBtn" name="EmailCheckBtn" class='btn btn-info btn-flat'>Email Check</button>
                						</span>
                						<!-- ./email-check button -->
                					</div>
                				</div>
                				<!-- ./form-group -->
                				<div class="form-group has-feedback">
                					<input type="password" id="UserPassword" name="UserPassword" class="form-control" placeholder="Password">
                					<span class="glyphicon glyphicon-lock form-control-feedback"></span>
                				</div>
                				<!-- ./form-group -->
                				<div class="form-group has-feedback">
                					<input type="password" id="UserConfirmPassword" name="UserConfirmPassword" class="form-control" placeholder="Confirm Password">
                					<span class="glyphicon glyphicon-lock form-control-feedback"></span>
                				</div>
                				<!-- ./form-group -->
                				<div class="form-group has-feedback">
                					<input type="text" id="UserName" name="UserName" class="form-control" placeholder="User Name" autocomplete="off">
                					<span class="glyphicon glyphicon-user form-control-feedback"></span>
                				</div>
                				<!-- ./form-group -->
                			</form>
                			<!-- ./Member Info -->
                		</div>
                		<!-- ./register-box-body -->
                		<div class="box-footer">
                			<button type="button" class="btn btn-danger">Cancel</button>
                			<button type="button" id="RegisteBtn" class="btn btn-primary pull-right">Registe</button>
                		</div>
                		<!-- ./register-box-footer -->
                </div>
                <!-- ./register-box -->
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
		<%-- <%@ include file="./include/footer.jsp" %> --%>
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
	<script>
	/** Email regExp */
	var regEmailExp = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
	/** Email checking */
    function validateEmail(email) {
        var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
        return re.test(email);
    }
	/** Function Email Nesting Check */
	function NestingEmailCheck(){
		console.log("Email Check Btn");
		$("#EmailCheckBtn").click(function(){
			console.log("Email Check Btn");
			let CheckEmail = $("#UserEmail").val();
			console.log("Input Value : ", CheckEmail)
			$.ajax({
				url:"<c:url value='/admin/Members/checkEmail'/>",
				type:'POST',
				dataType:'json',
				contentType:'application/json',
				data:JSON.stringify({
					Email:CheckEmail
				}),
				success:function(data){
					console.log("data : ", data);
					if(data.flag == false){
						return Swal.fire({
							type:'warning',
							title:data.message
						});
					}else{
						console.log("Success");
						$("#EmailCheckFlag").val(data.flag);
						return Swal.fire({
							type:'success',
							title:data.message
						});
					}
				},
				error:function(request, status, error){
					console.log("EMAIL NESTING CHECK ERROR");
					return false;
				}
			});
		});
	}
	/** Function Email Null Check */
	function EmailCheck(){
		let Email = $("#UserEmail").val();
		let EmailFlag = $("#EmailCheckFlag").val();
		console.log("Email : ", Email);
		if(Email.indexOf(' ') !== -1){
			Swal.fire({
				type:'warning',
				title:'Not Input Space in Email'
			});
			return null;
		}
		if(!regEmailExp.test(Email)){
			Swal.fire({
				type:'warning',
				title:"Not Email Format"
			});
			return null;
		}
		if(!Email){
			Swal.fire({
				type:'warning',
				title:"Not Empty"
			});
			return null;
		}
		if(EmailFlag == false || !EmailFlag ){
			Swal.fire({
				type:'warning',
				title:'Email Check First'
			});
			return null;
		}
		/** Return Success */
		return true;
	};
	
	/** Function Password Check */
	function PasswordCheck(){
		let pass = $("#UserPassword").val();
		let ConfirmPass = $("#UserConfirmPassword").val();
		console.log("Password : "+pass + ", Confirm : "+ConfirmPass);
		if(!pass){
			Swal.fire({
				type:'warning',
				title:'Input Password'
			});
			return null;	
		}
		
		if(!ConfirmPass){
			Swal.fire({
				type:'warning',
				title:'Input Confirm Password'
			});
			return null;
		}
		
		if(pass.indexOf(" ") !== -1){
			Swal.fire({
				type:'warning',
				title:'Not Input Space in Password'
			});
			return null;
		}
		
		if(ConfirmPass.indexOf(" ") !== -1){
			Swal.fire({
				type:'warning',
				title:"Not INput Space in Confirm Password"
			});
			return null;
		}
		
		if(pass !== ConfirmPass){
			Swal.fire({
				type:'warning',
				title:'Not Match password and confirm password'
			});
			return null;
		}
		return false;
	};
	
	/** Function Name Check */
	function NameCheck(){
		let Name = $("#UserName").val();	
		console.log("Name : ", Name);
		if(!Name){
			Swal.fire({
				type:'warning',
				title:'Input Name'
			});
			return null;
		}
		if(Name.indexOf(" ") !== -1){
			Swal.fire({
				type:'warning',
				title:"Not Input Space in User Name"
			});
			return null;
		}
		return true;
	};
	
	/** Create */
	function RegisteDo(){
		$("#RegisteBtn").click(function(){
			let Email = $("#UserEmail").val();
			let EmailFlag = false;
			let PassFlag = false;
			let NameFlag = false;
			if(EmailCheck()){
				console.log("Email Check Success");
				EmailFlag = true;
			}else{
				flag = false;
			}
			
			if(PasswordCheck()){
				console.log("Password Check Success");
				PassFlag = true;
			}else{
				flag = false;
			}
			
			if(NameCheck()){
				console.log("Name Check Success");
				NameFlag = true;
			}else{
				flag = false;
			}
			
			if(EmailFlag == true && PassFlag == true && NameFlag == true){
				/** Submit Do */
				console.log("Create Do");
				document.create.method="post";
				document.create.action = "<c:url value='/admin/Members/Registe'/>";
				document.create.submit();
			}
			
			
		});
	};
	/** Script */
	$(function(){
		NestingEmailCheck();
		RegisteDo();
	});
	</script>
</html>