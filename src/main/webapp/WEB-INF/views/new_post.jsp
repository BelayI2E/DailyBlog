<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/adress.css"
	rel="stylesheet">
</head>
</head>
<body>
	<div id="addis">
		<a href="#addisHiwot"><h1>Daily Blog</h1></a>
	</div>
	<div id="logo">
		<img src="${pageContext.request.contextPath}/resources/img/heaven.jpg"
			alt="Image Of Heaven">
	</div>
	<form action="${pageContext.request.contextPath }/save" method="POST"
		modelAttribute="post">
		<div class="form-group">
			<label for="title">Title</label> <input class="form-control"
				type="text" name="title">
		</div>
		<div class="form-group">
			<label for="body">Body</label>
			<textarea name="body" class="form-control" rows="15" cols="120" id="post"
				type="text" ></textarea>

		</div>
		<div class="form-group">
			<label for="date">Date</label> <input type="text"
				class="form-control" name="date">
		</div>
		<div class="form-group">
		<label for="id" >Author</label>
			<select class="form-control">
				<c:forEach var="user" items="${users}">
					<option value="${user.getId()}"></option>
				</c:forEach>


			</select>

		</div>
		<div class="form-group">
			<button class="btn btn-lg btn-primary">Post</button>
		</div>



	</form>

</body>
</html>