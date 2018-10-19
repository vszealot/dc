<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
[추가하기 화면]<br><br>

<form  method="post"  action="/dc/insertProc.do">
<table>
	<tr>
		<td>아이디</td>
		<td><input type="text"  name="userId"></td>
	</tr>	
	<tr>	
		<td>비밀번호</td>
		<td><input type="text"  name="userPassword"></td>
	</tr>
	<tr>	
		<td>닉네임</td>
		<td><input type="text"  name="nickname"></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input type="text"  name="userEmail"></td>
	</tr>	
	<tr>	
		<td>주소</td>
		<td><input type="text"  name="userAddress"></td>
	</tr>
	<tr>	
		<td>핸드폰</td>
		<td><input type="text"  name="userPhone"></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit"  value="추가하기">  
		</td>
	</tr>
</table>
</form><br>
<a href="/dc/index.jsp">처음화면</a>
</body>
</html>