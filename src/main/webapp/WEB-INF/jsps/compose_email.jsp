<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="triggerEmail" method="post">
<pre>
To <input type="text" name="email" value="${email}">
subject <input type="text" name="subject">
<textarea  name="content" rows="10" cols="50">
</textarea>
<input type="submit" value="send">


</pre>


</form>
${msg}

</body>
</html>