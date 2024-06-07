<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<%-- isErrorPage="true" 설정시 
	jsp페이지 내에 exception이라는 내장 객체가 생긴다
--%>
<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>ERROR PAGE</title>
</head>

<body>
	<h1>뭔가 잘못됬어요 세상에 맙소사!</h1>
	<p>ERROR CODE: <%= response.getStatus() %></p>
	<p>Exception Type: <%= exception.getClass().getSimpleName() %></p>
	<p>Message: <%= exception.getMessage() %></p>
</body>

</html>