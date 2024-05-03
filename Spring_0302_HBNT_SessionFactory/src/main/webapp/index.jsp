<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="h-100">

	<%@include file="/component/HTMLHeader.jsp" %>

		
	
	<body class="d-flex flex-column h-100">
	<%@include file="component/StickyHeader.jsp" %>
		<main>
			<section class="py-5 text-center container">
				<div class="row py-lg-5">
					<div class="col-lg-6 col-md-8 mx-auto">
						<h1 class="fw-light">Spring_0302_HBNT_SessionFactory</h1>
						<p class="lead text-body-secondary">沒有什麼好說ㄉㄌ，挑一個ㄅ。</p>
						<p>
				          <a href="<%=application.getContextPath()%>/dept/getAll" class="btn btn-primary my-2">進入Tutorial</a>
				          <a href="<%=application.getContextPath()%>/emp/getAll" class="btn btn-danger my-2">進入地獄</a>
				        </p>
					</div>
				</div>
			</section>
		</main>
	</body>
	
		<%@include file="/component/StickyFooter.jsp" %>
	
	</body>

</html>