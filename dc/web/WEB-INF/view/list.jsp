<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>아디</th><th>닉넴</th><th>이멜</th><th>주소</th><th>폰번</th>
	</tr>
	<c:if test="${!empty list}">
		<c:forEach items="${list}" var="ob">
			<tr>
				<td>${ob.userId}</td>
				<td>${ob.nickname}</td>
				<td>${ob.userEmail}</td>
				<td>${ob.userAddress}</td>
				<td>${ob.userPhone}</td>
			</tr>
		</c:forEach>
	</c:if>
</table><br><br>
<a href="/dc/index.jsp">처음화면</a>
</body>
</html>