<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>首頁 部門查詢</title>
</head>
<body>
	<table>
		<tr>
			<th>部門編號</th>
			<th>部門名稱</th>
			<th>部門地區</th>
		</tr>
		<c:forEach items="${dept}" var="dept">
			<tr>
				<td>${dept.deptno}</td>
				<td>${dept.dname}</td>
				<td>${dept.loc}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>