<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA=Compatible" content="IE=edge">
	<title>Admin User Login Page</title>
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<link rel="shortcut icon" type="image/x-icon" href="<c:url value='/resources/img/logo.png'/>">
	<!-- BootStrap 3.3.6 -->
	<link rel="stylesheet" href="<c:url value='/resources/Admin/bootstrap/css/bootstrap.min.css'/>">
	<!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme Style -->
    <link rel="stylesheet" href="<c:url value='/resources/Admin/dist/css/AdminLTE.min.css'/>">
    <!-- iCheck -->
    <link rel="stylesheet" href="<c:url value='/resources/Admin/plugins/iCheck/square/blue.css'/>">
    <!-- sweetalert2 -->    
    <link rel='stylesheet' href='https://cdn.rawgit.com/t4t5/sweetalert/v0.2.0/lib/sweet-alert.css'>
    
    
</head>
<body class="hold-transition login-page">
	<div class="login-box">
		<div class='login-logo'>
			<a href="<c:url value='/admin'/>"><b>Admin</b>C&amp;H</a>
		</div>
		<!-- ./login-logo -->
		<div class='login-box-body'>
			<p class="login-box-msg">Sign In to Start your Session</p>
			
			<form id="LogIn" name="LogIn">
				<!-- csrf Tocken -->
				<input type="hidden" name="_csrf"value="">
				<div class="form-group has-feedback">
					<input type="email" class="form-control" placeholder="Input Email ...">
					<i class="glyphicon glyphicon-envelope form-control-feedback"></i>
				</div>
				<!-- ./form-group Email -->
				<div class="form-group has-feedback">
					<input type="password" class="form-control" placeholder="Input Your password ...">
					<i class="glyphicon glyphicon-lock form-control-feedback"></i>
				</div>
				<!-- ./form-group Password -->
				<div class="row">
					<div class="col-xs-8">
						<div class="checkRow icheck">
							<label>
								<input type="checkbox" id="rememberPass">  Remember Me
							</label>
						</div>
						<!-- ./checkRow icheck -->
					</div>
					<!-- ./col-xs-8 -->
					
					<div class="col-xs-4">
						<button type="button" class="btn btn-primary btn-block btn-flat" id="LoginDo">Sign In</button>
					</div>
					<!-- ./col-xs-4 -->
				</div>
				<!-- ./row -->
			</form>
			<!-- ./form -->
			<a href="#">I Forget My password</a><br>
		</div>
		<!-- ./login-box-body -->
	</div>
	<!-- ./login-box -->
	<!-- jquery javascript -->
	<script src="<c:url value='/resources/Admin/plugins/jQeury/jquery-2.2.3.min.js'/>"></script>
	<!-- bootstrap javascript -->
	<script src="<c:url value='/resources/Admin/bootstrap/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='/resources/Admin/plugins/iCheck/icheck.min.js'/>"></script>
	<!-- sweetalert2 -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/8.11.8/sweetalert2.all.min.js"></script>
	<!-- Login Submit -->
	<script>
		/** Email Check Function */
		function EmailCheck(){
		
		}
		/** Password Check Function */
		function PasswordCheck(){
			
		}
		$(function(){
			
		});
	</script>
</body>
</html>