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
	                    	<a href="<%=application.getContextPath()%>/index.jsp" class="btn btn-primary" role="button">返回首頁</a>
	                    </span>
	                </div>
	            </div>
				<div class="row">
                    <table class="table table-striped align-middle">
                        <thead>
                            <tr>
                                <th scope="col">Driver Class</th>
                                <th scope="col">Url</th>
                                <th scope="col">Username</th>
                                <th scope="col">Password</th>
                            </tr>
                        </thead>
                        <tbody class="table-group-divider">
							<tr>
								<td>${driver}</td>
								<td>${url}</td>
								<td>${username}</td>
								<td>${password}</td>
							</tr>
                        </tbody>
                    </table>
               	</div>
	        </div>
	    </main>
	
		<%@include file="/component/StickyFooter.jsp" %>
	
	</body>

</html>