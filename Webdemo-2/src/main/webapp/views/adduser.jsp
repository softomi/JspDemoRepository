
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<h2>Add User</h2>
	<form action="addUser" method="post">
		<label for="username">Username:</label><br> <input type="text"
			id="username" name="username"><br> <label for="password">Password:</label><br>
		<input type="password" id="password" name="password"><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>
