<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lead Info</title>
</head>
<body>
<h2>Lead Details</h2>

First Name:${lead.firstName} <br>
Last Name:${lead.lastName} <br>
Email:${lead.email} <br>
Mobile: ${lead.email} <br>
source: ${lead.source} <br>



<form action="sendEmail" method="post">
<input type="hidden"name="email" value="${lead.email}"/>
<input type="submit" value="send Email"/>
</form>
 
<form action="convertLead" method="post">
<input type="hidden"name="id" value="${lead.id}"/>
<input type="submit" value="convert"/>
</form>
</body>
</html>