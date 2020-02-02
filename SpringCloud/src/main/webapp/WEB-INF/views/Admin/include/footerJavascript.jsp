<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		/** Logout Function */
		function Logout(_select){
			$("#"+_select).click(function(){
				console.log("Logout Btn");
				doucment.logout.method="POST";
				document.logout.action="<c:url value='/admin/Users/LogOut'/>";
				document.logout.submit();
			});
		}
	</script>