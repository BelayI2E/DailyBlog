<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<div class="login-form jumbotron">
		<form action="#login" method="post" >
		<div class="form-group">
		<label for="username">UserName</label>
		<input class="form-control" type="text" name="username">
		</div>
		<div class="form-group">
		<label for="password">Password</label>
		<input type="password" class="form-control">
		</div>
		<div class="form-group">
		<button class="btn btn-lg btn-primary">Login</button>
		</div>
		</form>
	</div>
</body>
<script type="text/javascript">
	$(document).ready(function() {

		$("body").css("background-color", "red");
		$("body")[0];
	});
	
	$("form").attr("action").css("background","yellow");
</script>
</html>