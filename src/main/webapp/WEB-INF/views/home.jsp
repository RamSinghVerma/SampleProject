
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<%@ page isELIgnored="false"%>
<meta charset="UTF-8">
<header id="header">
	<jsp:include page="header.jsp"></jsp:include>
</header>
<head>

</head>
<body>
	<center>
		<h1>${message}</h1>
		<div class="red-text"></div>
		<br>
		<div class="green-text"></div>
		<br> <a href="${pageContext.request.contextPath}/login">Login</a>
		<br> <a href="${pageContext.request.contextPath}/register">Register</a>
	</center>

</body>
<footer id="footer"><jsp:include page="footer.jsp"></jsp:include>
</footer>
</html>
