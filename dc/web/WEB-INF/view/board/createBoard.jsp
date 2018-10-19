<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
[게시판 개설하기 화면]<br><br>

<form  method="post"  action="/dc/createBoardProc.do">
<table>
	<tr>
		<td>닉네임</td>
		<td><input type="text"  name="nickname"></td>
		<td>닉네임은 로그인 후 세션을 통해 받음.그러므로 이 테이블row는 없어야함</td>
	</tr>
	<tr>
		<td>유저id</td>
		<td><input type="text"  name="userId"></td>
		<td>id도 로그인 후 세션을 통해 받음.그러므로 이 테이블row는 없어야함</td>
	</tr>
	<tr>
		<td>게시판 이름</td>
		<td><input type="text"  name="boardName"></td>
	</tr>	
	<tr>	
		<td>태그1</td>
		<td><input type="text"  name="boardTag1"></td>
	</tr>
	<tr>	
		<td>태그2</td>
		<td><input type="text"  name="boardTag2"></td>
	</tr>
	<tr>
		<td>태그3</td>
		<td><input type="text"  name="boardTag3"></td>
	</tr>	
	<tr>	
		<td>태그4</td>
		<td><input type="text"  name="boardTag4"></td>
	</tr>
	<tr>	
		<td>태그5</td>
		<td><input type="text"  name="boardTag5"></td>
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