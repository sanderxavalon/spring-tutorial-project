<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="h-100">

	<%@include file="/HTMLHeader.jsp" %>
	
	<body class="d-flex flex-column h-100">

		<%@include file="/StickyHeader.jsp" %>
	
	    <main class="flex-shrink-0">
	        <div class="container">
                <h1><a href="<%=application.getContextPath()%>/index">點我呼叫所有方法</a></h1>
	        </div>
	    </main>
	
		<%@include file="/StickyFooter.jsp" %>
	
	</body>

</html>