<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<title>Admin Member List Page</title>
	<link rel="shortcut icon" type="image/x-icon" href="<c:url value='/resources/Share/Img/logo.png'/>" >
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
			<!-- content-header -->
			<div class="content-header">
				<h1>Member<small> List</small></h1>
				
				<ol class="breadcrumb">
					<li><i class="fa fa-fw fa-users" style="margin-right:5px;"></i>Member</li>
					<li class="active">list</li>
				</ol>
			</div>
			<!-- ./content-header -->
        		<div class="content">
        			<div class="row">
        				<div class="col-md-12 col-xs-12">
        					<div class="box">
        						<div class="box-header">
        							<h3 class="box-title">
        								<i class="fa fa-fw fa-users" style="margin-right:10px;"></i>
        								Member List
        							</h3>
        							<div class="box-tools">
        							</div>
        							<!-- ./box-tools -->
        						</div>
        						<!-- ./box-header -->
        						<div class="box-body">
        							<table class="table table-bordered">
        								<thead>
        									<tr style="text-align:center;">
        										<td style="width:10px;">
        											<input type="checkbox" name="AllClick" id="AllClickBtn">
        										</td>
        										<td>
        											User Email
        										</td>
        										<td>
        											User Name
        										</td>
        										<td>
        											User Level
        										</td>
        										<td>
        											Registe Date
        										</td>
        										<td>
        											Update Date
        										</td>
        									</tr>
        								</thead>
        								<!-- ./thead -->
        								<tbody id="MemberList-Body">
        									<c:forEach items="${ UserList }" var="UserVO">
        										<tr style="text-align:center;">
        											<td><input type="checkbox" name="checkRow" value="${ UserVO.getId() }"></td>
        											<td><a href="<c:url value='/admin/Members/detail?id='/>${ UserVO.getId() }">${ UserVO.getUserEmail() }</a></td>
        											<td>${ UserVO.getUserName() }</td>
        											<td ><span class="">${ UserVO.getUserLevel() }</span></td>
        											<td>${ UserVO.getCreatedAt() }</td>
        											<td>${ UserVO.getUpdatedAt() }</td>
        										</tr>
        									</c:forEach>
        									<!-- ./list data -->
        								</tbody>
        								<!-- ./tbody -->
        							</table>
        							<!-- ./table -->
        						</div>
        						<!-- ./box-body -->
        						<div class="box-footer">
        							<div class="pull-left">
        								<button id="UserDeleteBtn" class="btn btn-danger">
        									<i class="fa fa-fw fa-trash-o" style="margin-right:10px;"></i>
        									Delete
        								</button>
        							</div>
        							<div class="pull-right">
        								<button id="UserEditBtn" class="btn btn-warning">
        									<i class="fa fa-fw fa-edit" style="margin-right:10px;"></i>
        									Edit
        								</button>
        								<button id="UserInsertBtn" class="btn btn-primary">
        									<i class="fa fa-fw fa-pencil" style="margin-right:10px;"></i>
        									Registe
        								</button>
        							</div>
        							<div class="text-center">
        								<ul class="pagination pagination-sm no-margin">
        									<li><a href="<<"> << </a></li>
        									<li><a href="<<"> >> </a></li>
        								</ul>
        								<!-- ./paging -->
        							</div>
        							<!-- ./paging-div -->
        						</div>
        						<!-- ./box-footer -->
        					</div>
        					<!-- ./box -->
        				</div>
        				<!-- ./col-md-12 -->
        			</div>
        			<!-- ./row -->
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
	
	/** Function All Click User */
	function AllClickUser(){
		$("#AllClickBtn").click(function(){
			if($("#AllClickBtn").is(":checked")){
				$("input[name=checkRow]").prop("checked", true);
			}else{
				$("input[name=checkRow]").prop("checked", false);
			}
		});
	}
	
	/** Function Insert User */
	function InsertDo(){
		$("#UserInsertBtn").click(function(){
			document.location.href="<c:url value='/admin/Members/Registe'/>";	
		});
	}
	
	/** Function Edit User */
	function EditDo(){
		$("#UserEditBtn").click(function(){
			/** Base Return Url */
			let _BaseUrl = "<c:url value='/admin/Members/edit'/>?id=";
			/** Get Edit Member */
			let _EditMemberList = [];
			$.each($('input[name=checkRow]:checked'), function(){
				console.log("Check Value : ", $(this).val());
				_EditMemberList.push($(this).val());
			});		
			console.log("Check Value List : ", _EditMemberList);
			if(_EditMemberList.length === 0){
				console.log("Edit Member Not Select");
				return Swal.fire({
					type:'warning',
					title:'Select Edit Member First'
				});
			}
			if(_EditMemberList.length > 1){
				return Swal.fire({
					type:'warning',
					title:'Select Member only One'
				});
			}
			/** Move Edit page */
			document.location.href= _BaseUrl+_EditMemberList[0];
		});
	}
	
	/** Function Delete User done Reloading Member List */
	function ReloadingTable(data){
		$("#MemberList-Body").empty();
		let txt = "";
		$.each(data.reload, function(idx, obj){
			txt += "<tr><td><input type='checkbox' name='checkRow' value="+obj.id+"></td>";
			txt += "<td><a href=<c:url value='/admin/Members/detail?id='/>"+obj.id+">"+obj.userEmail+"</td>";
			txt += "<td>"+obj.userName+"</td>";
			txt += "<td>"+obj.userLevel+"</td>";
			txt += "<td>"+new Date(obj.createdAt).getFullYear() + '-' + (new Date(obj.createdAt).getMonth()+1) + '-' + new Date(obj.createdAt).getDate()+":"+new Date(obj.createdAt).getHours()+":"+new Date(obj.createdAt).getMinutes()+"</td>";
			txt += "<td>"+obj.updatedAt+"</td></tr>";
		});
		$("#AllClickBtn").prop("checked", false);
		$("#MemberList-Body").append(txt);
	};
		
	/** Function Delete User */
	function DelteDo(){
		$("#UserDeleteBtn").click(function(){
			/** Confirm Delete User Value */
			let _DeleteUser = [];
			/** Confirm Delete User Name */
			let _DeleteUserName = [];
			/** Check Value Each */
			$.each($('input[name=checkRow]:checked'),function(){
				/** Get Delete User Check Value */
				_DeleteUser.push($(this).val());
				/** Get Delete User Name */
				_DeleteUserName.push($(this).parent('td').next().html());
			});
			/** Not Check Value */
	 		if(_DeleteUser.length == 0){
				return Swal.fire({
					type:'warning',
					title:'Check Delete User First'
				});
			}else{ 
				/** Delete User */
				Swal.fire({
					title:'Are you sure Delete User ?',
					type:'question',
					html:'<p style="font-size:20px;">'+_DeleteUserName+'</p>',
					showCancelButton:true
				}).then(result=>{
					if(result.value){
						let _DeleteAJax = JSON.stringify({
							page:0,
							deleteId:_DeleteUser
						});
						console.log("Check Confirm Done(Delete)");
						$.ajax({
							url:'<c:url value="/admin/Members/delete"/>',
							type:'post',
							dataType:'json',
							contentType:'application/json',
							beforeSend:function(xhr){
								xhr.setRequestHeader("${_csrf.headerName}", "${_csrf.token}")
							},
							data:_DeleteAJax,
							success:function(data){
								if(data.msgFlag){									
									Swal.fire({
										type:'success',
										title:"Delete Member Success"
									});
									/** Reloading Table */
									
									return ReloadingTable(data);
								}else{
									console.log("Failed");
									return Swal.fire({
										type:'warning',
										title: data.msg
									});
								}
							},
							error:function(request, status, error){
								return console.log("DELETE MEMBER ERROR");
							}
						});
						return true;
					}
					console.log("Check Confirm Done(Not Delete)");
					return false;
				});
			 } 
		});
	}
	
	/** Function All Member List Init */
	function _Init(){
		/** Check All User */
		AllClickUser();
		/** Redirect Create User */
		InsertDo();
		/** Redirect Edit User */
		EditDo();
		/** Ajax Delete User */
		DelteDo();
	}
	
	$(function(){
		_Init();
	});
	
	</script>
</html>