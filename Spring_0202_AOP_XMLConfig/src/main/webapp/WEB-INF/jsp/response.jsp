<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>



<!DOCTYPE html>
<html class="h-100">

  <%@include file="/HTMLHeader.jsp" %>
  
  <body class="d-flex flex-column h-100">
	
	<%@include file="/StickyHeader.jsp" %>
    
    <main class="flex-shrink-0">
        <div class="container">
            <div class="row">
			  	<h1><%= pageContext.getRequest().getAttribute("message").toString() %></h1>
			  	<a href="${pageContext.request.contextPath}/index.jsp">回到首頁</a>
            </div>
        </div>
    </main>
	
	<%@include file="/StickyFooter.jsp" %>
	

  </body>
</html>
