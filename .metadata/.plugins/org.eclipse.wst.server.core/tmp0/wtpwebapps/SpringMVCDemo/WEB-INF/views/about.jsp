<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
</head>
<body>
<%
String youtube=(String)request.getAttribute("youtube");
String mail=(String)request.getAttribute("mail");
%>
<h1>About</h1>
<h2>Youtube: <%=youtube %></h1>
<h2>Mail: <%=mail %></h2>
</body>
</html>