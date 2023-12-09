<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Leads</title>
</head>
<body>
<a href="viewcreateLeadPage" >Create New Lead</a>
<h2>List all the Leads</h2>
<table border="1">
<tr>
	
	<th>FirstName</th>
	<th>LastName</th>
	<th>Email</th>
	<th>mobile</th>
	<th>source</th>
</tr>
<c:forEach  var="lead" items="${leads}">
<tr>
	<td> <a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
	<td>${lead.lastName}</td>
	<td>${lead.email}</td>
	<td>${lead.mobile}</td>
	<td>${lead.source}</td>
</tr>
</c:forEach>
</table>
</body>
</html>