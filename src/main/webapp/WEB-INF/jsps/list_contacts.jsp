<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Contacts</title>
</head>
<body>
<h2>List all the Contacts</h2>

<table border="1">
<tr>
	
	<th>FirstName</th>
	<th>LastName</th>
	<th>Email</th>
	<th>mobile</th>
	<th>source</th>
	<th>Billing</th>
</tr>
<c:forEach  var="contact" items="${contacts}">
<tr>
	<td> <a href="contactInfo?id=${contact.id}">${contact.firstName}</a></td>
	<td>${contact.lastName}</td>
	<td>${contact.email}</td>
	<td>${contact.mobile}</td>
	<td>${contact.source}</td>
	<td> <a href="generateBill?id=${contact.id}">Billing</a> </td>
</tr>
</c:forEach>
</table>
</body>
</html>