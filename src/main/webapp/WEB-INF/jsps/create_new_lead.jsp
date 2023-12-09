<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Lead</title>
</head>
<body>
	<h2>Create new lead</h2>
	<form action="save" method="post">
<pre>
		First Name <input type="text" name="firstName" required><br>
		Last Name <input type="text" name="lastName" required><br>
		Email <input type="email" name="email" required><br>
		Mobile <input type="text" name="mobile" required><br>
		source:  <select name="source">
			<option value="radio">radio</option>
			<option value="news paper">news paper</option>
			<option value="trade show">trade show</option>
			<option value="website">website</option>
		</select>
		<input type="submit" value=save>

</pre>
	</form>
</body>
</html>