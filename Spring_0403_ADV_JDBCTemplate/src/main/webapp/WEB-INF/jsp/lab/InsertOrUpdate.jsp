<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html class="h-100">

	<%@include file="/component/HTMLHeader.jsp" %>
	
	<body class="d-flex flex-column h-100">

		<%@include file="/component/StickyHeader.jsp" %>
		
		
	
	    <main class="flex-shrink-0">
	        <div class="container">
     			<c:if test="${empty emp}" >
     				<h1>新增員工</h1>	
					<form action="<%=application.getContextPath()%>/emp/insert" method="post">
			            <div class="row">
							<div class="col">
								<label for="" class="form-label">員工姓名</label>
								<input name="ename" type="text" class="form-control" id="ename">
							</div>
							<div class="col">
								<label for="" class="form-label">職稱</label>
								<input name="job" type="text" class="form-control" id="job">
							</div>
							<div class="col">
								<label for="" class="form-label">薪水</label>
								<input name="sal" type="text" class="form-control" id="sal">
							</div>
			            </div>
			            <div class="row py-3">
			            	<div class="col-md-1">
				            	<button class="btn btn-primary " type="submit">儲存</button>
				            </div>
			            </div>
          				</form>
				</c:if>				
				<c:if test="${not empty emp}" >
					<h1>改動員工</h1>
					<form action="<%=application.getContextPath()%>/emp/update" method="post">
						<input type="hidden" name="empno" value="${emp.empno}" />
			            <div class="row">
							<div class="col">
								<label for="" class="form-label">員工姓名</label>
								<input name="ename" type="text" class="form-control" id="ename" value="${emp.ename}">
							</div>
							<div class="col">
								<label for="" class="form-label">職稱</label>
								<input name="job" type="text" class="form-control" id="job" value="${emp.job}">
							</div>
							<div class="col">
								<label for="" class="form-label">薪水</label>
								<input name="sal" type="text" class="form-control" id="sal" value="${emp.sal}">
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