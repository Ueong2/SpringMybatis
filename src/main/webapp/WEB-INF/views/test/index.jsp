<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h1>스프링에서 response된 view</h1>
	<br>
	jsp 표현식 : <%= request.getAttribute("msg") %>
	<br>
	EL 표현식 : ${msg}
</body>
</html>