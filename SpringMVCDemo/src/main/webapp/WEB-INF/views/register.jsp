<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New user Register here</title>
</head>
<body>
<form action="register" method="POST">
<label>
Enter Username: 
<input type="text" name="name" placeholder="Username">
</label><br>
<label>
Enter Password: 
<input type="password" name="password" placeholder="Password">
</label><br>
<button type="submit">
Register
</button>
</form>
</body>
</html>