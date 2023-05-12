<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jstl Page</title>
</head>
<body>
<c:forEach var="item" items="${nums }">
<h1>${item }</h1>
</c:forEach>
<h2>${currDT }</h2>
</body>
</html>