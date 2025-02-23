<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Register Employee</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<h2>Register Employee</h2>
	<form action="addEmployee" method="post">
		<label for="id">ID:</label> <input type="number" id="id" name="id"
			required><br> <label for="name">Name:</label> <input
			type="text" id="name" name="name" required><br> <label
			for="age">Age:</label> <input type="number" id="age" name="age"
			required><br> <label for="email">Email:</label> <input
			type="email" id="email" name="email" required><br> <label
			for="salary">Salary:</label> <input type="number" id="salary"
			name="salary" required><br>
		<button type="submit">Submit</button>
	</form>
	<a href="welcome.jsp">Back</a>
</body>
</html>