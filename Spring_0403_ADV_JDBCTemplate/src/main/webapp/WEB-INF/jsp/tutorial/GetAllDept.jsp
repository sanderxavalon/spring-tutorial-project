<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html class="h-100">

	<%@include file="/component/HTMLHeader.jsp" %>
	
	<body class="d-flex flex-column h-100">

		<%@include file="/component/StickyHeader.jsp" %>
	
	    <main class="flex-shrink-0">
	        <div class="container">
	            <div class="row">
	                <div class="col-md-4">
	                    <h1>Tutorial</h1>
	                </div>
   	                <div class="col-md-4 offset-md-4">
   	                	<span class="align-middle">
	                    	<a href="<%=application.getContextPath()%>/dept/insertPage" class="btn btn-primary" role="button">新增部門</a>
	                    </span>
	                </div>
	            </div>
				<div class="row">
                    <table class="table table-striped align-middle">
                        <thead>
                            <tr>
                                <th scope="col">部門編號</th>
                                <th scope="col">職稱</th>
                                <th scope="col">部門地點</th>
                            </tr>
                        </thead>
                        <tbody class="table-group-divider">
                       		<c:forEach items="${dept}" var="dept">
								<tr>
									<td>${dept.deptno}</td>
									<td>${dept.dname}</td>
									<td>${dept.loc}</td>
									<td>
										<form action="<%=application.getContextPath()%>/dept/getOneForUpdatePage/${dept.deptno}" method="get">
											<button class="btn btn-warning" type="submit">更改部門</button>
										</form>
									</td>
									<td>
										<form action="<%=application.getContextPath()%>/dept/delete/${dept.deptno}" method="post">
											<button class="btn btn-danger" type="submit">刪除部門</button>
										</form>
									</td>
								</tr>
							</c:forEach>
                        </tbody>
                    </table>
               	</div>
	        </div>
	    </main>
	
		<%@include file="/component/StickyFooter.jsp" %>
	
	</body>

</html>