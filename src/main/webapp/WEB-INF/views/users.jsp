<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page isELIgnored="false" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<header><jsp:include page="header.jsp"></jsp:include></header>
<body>
<h3>${message}</h3>
<table border=1>
				<thead>
					<tr>
						<th colspan=4>User Details</th>
					</tr>
					<tr>
						<th>User ID</th>
						<th>User Name</th>
						<th>Update</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${userList}">
						<tr>
							<td>${user.userId}</td>
							<td>${user.userName}</td>
							<td><a href="${pageContext.request.contextPath}/deleteUser/${user.userId}">Delete this item</a></td>
							<td><a href="${pageContext.request.contextPath}/updateUser/${user.userId}">Update this item</a></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>
</body>
<footer><jsp:include page="footer.jsp"></jsp:include>  </footer>
</html>