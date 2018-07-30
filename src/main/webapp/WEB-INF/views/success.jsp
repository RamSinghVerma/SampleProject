<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<header><jsp:include page="header.jsp"></jsp:include></header>
<body>
<div style="color:blue">
<a href="${pageContext.request.contextPath}/userlist">View Users</a>

<a href="${pageContext.request.contextPath}/product">Add Products</a>

</div>
</body>
<footer><jsp:include page="footer.jsp"></jsp:include>  </footer>
</html>