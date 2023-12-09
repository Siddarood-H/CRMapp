<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Bill</title>
</head>
<body>
	<h2>Create Bill</h2>
	<form action="saveBill" method="post">
<pre>
		First Name <input type="text" name="firstName" value="${contact.firstName}" } ><br>
		Last Name <input type="text" name="lastName" value="${contact.lastName}"><br>
		Email <input type="email" name="email"value="${contact.email}"><br>
		Mobile <input type="text" name="mobile" value="${contact.mobile}"><br>
		Product <input type="text" name="product">
		Amount <input type="text" name="amount">
		<input type="submit" value="generateBill">

</pre>
	</form>
	
	${msg}
</body>
</html>