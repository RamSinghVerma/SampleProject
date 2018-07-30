<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<header><jsp:include page="header.jsp"></jsp:include></header>
<body>
	<center>
		<form:form action="product" method="post" modelAttribute="product">

			<table>
				<thead>
					<tr>
						<th colspan=3>Add Products</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Product Name :</td>
						<td><form:input path="prodName" /></td>
						<td><input type="Submit" value="Save" /></td>
					</tr>
				</tbody>
			</table>
			<br>
			<br>
			<table border=1>
				<thead>
					<tr>
						<th colspan=4>Product List</th>
					</tr>
					<tr>
						<th>Product ID</th>
						<th>Product Name</th>
						<th>Update</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="product" items="${prodList}">
						<tr>
							<td>${product.prodId}</td>
							<td>${product.prodName}</td>
							<td><a href="${pageContext.request.contextPath}/delete/${product.prodId}">Delete this item</a></td>
							<td><a href="${pageContext.request.contextPath}/update/${product.prodId}">Update this item</a></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>

		</form:form>
	</center>
</body>
<footer><jsp:include page="footer.jsp"></jsp:include> </footer>
</html>