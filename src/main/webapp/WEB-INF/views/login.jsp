<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.errors{
color:red;
}
</style>
</head>
<header><jsp:include page="header.jsp"></jsp:include></header>
<body>
	<h1>Login Page</h1>
<div style="color:blue">${msg}</div>
<div style="color:red">${error}</div>
	<form:form action="login" method="post" modelAttribute="user">
		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="userName" /></td>
				<td><form:errors path="userName" cssClass="errors"/></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:input path="userPass" /></td>
				<td><form:errors path="userPass" cssClass="errors"/></td>
			</tr>
			<tr>
				<td colspan=3><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form:form>
</body>
<footer><jsp:include page="footer.jsp"></jsp:include>  </footer>
</html>