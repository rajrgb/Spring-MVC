<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<%
String name=(String)request.getAttribute("name");
%>
<h1>This is my home page!</h1>
<h3>Called by home controller</h3>
<h3 style="color: blue;">-By <%=name %></h3>
</body>
</html>