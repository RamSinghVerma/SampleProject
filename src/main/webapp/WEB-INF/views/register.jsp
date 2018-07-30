<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style type="text/css">
.error{
color:red;
}
</style>
</head>
<header><jsp:include page="header.jsp"></jsp:include></header>
<body>
	<center>
		<form:form action="register" method="post" modelAttribute="user">
			<table >
				<thead>
					<tr>
						<th colspan=3>Registration</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Name :</td>
						<td><form:input path="userName" /></td>
						<td><form:errors path="userName" cssClass="error" /></td>
					</tr>
					<tr>
						<td>Password :</td>
						<td><form:input path="userPass" /></td>
						<td><form:errors path="userPass" cssClass="error" /></td>
					</tr>
					<tr>
						<td>Phone No :</td>
						<td><form:input path="userPhoneNo" /></td>
					</tr>
					<tr>
						<td>Email-id :</td>
						<td><form:input path="userEmailId" /></td>
						<td><form:errors path="userEmailId" cssClass="error" /></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><form:input path="userAddress" /></td>
					</tr>
					<tr>
						<td ><input type="submit" value="Submit" /></td>
						<td ><input type="Reset" value="Reset" /></td>
					</tr>
				</tbody>

			</table>
		</form:form>

	</center>

</body>
<footer><jsp:include page="footer.jsp"></jsp:include> </footer>
</html>