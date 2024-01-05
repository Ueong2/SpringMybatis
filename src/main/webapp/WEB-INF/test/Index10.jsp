<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<jsp:include page="../include/top.jsp"></jsp:include>
	<h1>스프링에서 response된 view</h1>
	<br>
	jsp 표현식 : <%= request.getAttribute("msg") %>
	<br>
	EL 표현식 : ${msg}
	<br>
	<a href="/erp/test/paramtest">스프링 MVC에서 파라미터 추출하기 테스트</a>
</body>
</html>