<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">
</head>
<body>
	<ul>
		<li><a href="#">Home</a></li>
		<li><a href="#">News</a></li>
		<li><a href="#">Contacts</a></li>
		<li><a href="#">Testimony</a></li>
		<li><a href="#">About</a></li>
	</ul>
	<h1>Fantasma</h1>
	<div class="col-md-4" id="myside">
		<div class="aside">
			<div class="posts">
				<h2>Popular Posts</h2>
				<p>
					<a href="#">First Post</a>
				</p>
				<p>
					<a href="#">Second Post</a>
				</p>
				<p>
					<a href="#">Third Post</a>
				</p>
				<p>
					<a href="#">Fourth Post</a>
				</p>
				<p>
					<a href="#">Fifth Post</a>
				</p>
			</div>
		</div>
	</div>
	<div class="col-md-8" id="myblog">
		<div>
			<form action="post.jsp" method="post" class="form">
				<h3>Creat Post</h3>
				<div class="form-group">
					<label for="name">Title</label> <input type="text"
						class="form-control" name="title">
				</div>
				<div class="form-group">
					<label for="message">Message</label>
					<textarea rows="10" cols="20" class="form-control" name="message"></textarea>

				</div>
				<div class="form-group">
					<button type="button" class="btn btn-lg btn-primary">Post</button>
				</div>


			</form>




		</div>


	</div>
</body>
</html>
