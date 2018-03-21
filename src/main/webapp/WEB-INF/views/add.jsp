<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<div>
			<form action="${pageContext.request.contextPath }home/save" method="POST" modelAttribute="post" >
				<h3>Creat Post</h3>
				<div class="form-group">
					<label for="name">Title</label> 
					<input type="text"
						class="form-control" name="title">
				</div>
				<div class="form-group">
					<label for="message">Message</label>
					<textarea rows="5" cols="10" class="form-control" name="body"></textarea>

				</div>
				<div class="form-group">
				<label for ="name">Author</label>
				<input type="text" class="form-control" name="author" >
				</div>
				<div class="form-group">
				<label for ="name">Date</label>
				<input type="text" class="form-control" name="date">
				
				</div>
				<div class="form-group">
				<label for="name">Author_id</label>
				<input type="text" class="form-control" name="author_id">
				</div>
				<div class="form-group">
					<input type="submit" value="Save">
				</div>


			</form>
		</div>

</body>
</html>