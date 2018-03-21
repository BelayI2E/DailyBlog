<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/adress.css"
	rel="stylesheet">
</head>
<body>
	<div id="addis">
		<a href="#addisHiwot"><h1>Daily Blog </h1></a>
	</div>
	<div id="logo">
		<img src="${pageContext.request.contextPath}/resources/img/heaven.jpg"
			alt="Image Of Heaven" > 
	</div>
	<ul class="list-group">
		<li class="list-group-item"><a href="#home">Home</a></li>
		<li class="list-group-item"><a href="${pageContext.request.contextPath}/login">Login</a></li>
		<li class="list-group-item"><a href="${pageContext.request.contextPath}/register">Register</a></li>
		<li class="list-group-item"><a href="#">Posts</a></li>
		<li class="list-group-item"><a href="${pageContext.request.contextPath}/create-post">Create Post</a></li>
		<li class="list-group-item"><a href="#">Logout</a></li>
	</ul>
	<div class="jumbotron">
		
	</div>
	
	<!-- 
	<a href="#"><i class="fa fa-arrow-left"></i></a>
	<a href="#"><i class="fa fa-refresh"></i></a>
	<a href="#"><i class="fa fa-arrow-right"></i></a>
	 -->
	 <h1>All Recent Posts from db</h1>
	 <c:forEach items="${posts}" var ="post">
		<li>${post.id}</li>
		<li>${post.title}</li>
		<li>${post.body}</li>
		<li>${post.author}</li>	
		</c:forEach>
</body>
</html>