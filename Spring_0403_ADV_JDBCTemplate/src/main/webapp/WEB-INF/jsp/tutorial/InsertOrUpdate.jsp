<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html class="h-100">

	<%@include file="/component/HTMLHeader.jsp" %>
	
	<body class="d-flex flex-column h-100">

		<%@include file="/component/StickyHeader.jsp" %>
		
		
	
	    <main class="flex-shrink-0">
	        <div class="container">
     			<c:if test="${empty dept}" >
     				<h1>新增部門</h1>	
					<form action="<%=application.getContextPath()%>/dept/insert" method="post">
			            <div class="row">
							<div class="col">
								<label for="" class="form-label">職稱</label>
								<input name="dname" type="text" class="form-control" id="dname">
							</div>
							<div class="col">
								<label for="" class="form-label">部門地點</label>
								<input name="loc" type="text" class="form-control" id="loc">
							</div>
			            </div>
			            <div class="row py-3">
			            	<div class="col-md-1">
				            	<button class="btn btn-primary " type="submit">儲存</button>
				            </div>
			            </div>
          				</form>
				</c:if>				
				<c:if test="${not empty dept}" >
					<h1>改動部門</h1>
					<form action="<%=application.getContextPath()%>/dept/update" method="post">
						<input type="hidden" name="deptno" value="${dept.deptno}" />
			            <div class="row">
							<div class="col">
								<label for="" class="form-label">職稱</label>
								<input name="dname" type="text" class="form-control" id="dname" value="${dept.dname}">
							</div>
							<div class="col">
								<label for="" class="form-label">部門地點</label>
								<input name="loc" type="text" class="form-control" id="loc" value="${dept.loc}">
							</div>
			            </div>
			            <div class="row py-3">
			            	<div class="col-md-1">
				            	<button class="btn btn-primary " type="submit">儲存</button>
				            </div>
			            </div>
        			</form>
				</c:if>
	        </div>
	    </main>
	
		<%@include file="/component/StickyFooter.jsp" %>
	
	</body>

</html>