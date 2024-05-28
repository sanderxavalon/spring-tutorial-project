<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="h-100">

	<%@include file="/component/HTMLHeader.jsp" %>

	<body class="d-flex flex-column h-100">
	<%@include file="component/StickyHeader.jsp" %>
	<style>
	 .row {
	 	margin-top: 30px
	 }
	</style>
    <main class="flex-shrink-0">
        <div class="container">
        	<div class="row">
				<div class="col">
					<div class="row">
						<h3>ReadOnly設定詳細</h3>
						<div class="list-group">
							<a class="list-group-item list-group-item-action list-group-item-info" href="${pageContext.request.contextPath}/dept/getAll">@Transaction有ReadOnly的情況</a>
							<a class="list-group-item list-group-item-action" href="${pageContext.request.contextPath}/dept/getAllWithoutReadOnly">@Transaction沒有ReadOnly的情況</a>
						</div>
					</div>
					<div class="row">
						<h3>Rollback for與No Rollback for設定詳細</h3>
						<div class="list-group">
							  <a class="list-group-item list-group-item-action list-group-item-info" href="${pageContext.request.contextPath}/dept/saveWithRuntimeException">@Transaction一般拋出RuntimeException會Rollback</a>
							  <a class="list-group-item list-group-item-action" href="${pageContext.request.contextPath}/dept/saveNoRollBack">@Transaction設定拋出RuntimeException也不會Rollback</a>
							  <a class="list-group-item list-group-item-action list-group-item-info" href="${pageContext.request.contextPath}/dept/exceptionNoRollBack">預設情況下，不是RuntimeException(強制try-catch)不會Rollback</a>
							  <a class="list-group-item list-group-item-action" href="${pageContext.request.contextPath}/dept/saveRollBackFor">@Transaction設定拋出不是RuntimeException也會Rollback</a>
						</div>
					</div>
				</div>
				<div class="col" >
					<div class="row">
						<h3>Timeout設定詳細</h3>
						<div class="list-group">
							  <a class="list-group-item list-group-item-action list-group-item-success" href="${pageContext.request.contextPath}/dept/saveTimeOut">@Transaction設定1秒的Timeout時間限制</a>
						</div>
					</div>
					<div class="row">
						<h3>傳播行為</h3>
						<div class="list-group">
  							  <a class="list-group-item list-group-item-action list-group-item-success" href="${pageContext.request.contextPath}/dept/propagation/required">Propagation.REQUIRED</a>
  							  <a class="list-group-item list-group-item-action " href="${pageContext.request.contextPath}/dept/propagation/requirednew">Propagation.REQUIRES_NEW</a>
							  <a class="list-group-item list-group-item-action list-group-item-success" href="${pageContext.request.contextPath}/dept/propagation/never">Propagation.NEVER</a>
							  <a class="list-group-item list-group-item-action " href="${pageContext.request.contextPath}/dept/propagation/mandatory">Propagation.MANDATORY</a>
							  <a class="list-group-item list-group-item-action list-group-item-success" href="${pageContext.request.contextPath}/dept/propagation/support">Propagation.SUPPORT</a>
							  <a class="list-group-item list-group-item-action " href="${pageContext.request.contextPath}/dept/propagation/notsupport">Propagation.NOTSUPPORTED</a>
						</div>
					</div>
				</div>
        	</div>
        </div>
    </main>
	</body>
	
		<%@include file="/component/StickyFooter.jsp" %>
	
	</body>

</html>