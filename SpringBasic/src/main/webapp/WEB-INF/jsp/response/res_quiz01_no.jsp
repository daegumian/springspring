<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<script>
	alert("아이디와 비밀번호를 다시 확인하세요!");
	</script>
	
	
	<form action="res_login" method="post">
		ID: <input type="text" name="id" size="10"><br>
		PW: <input type="password" name="pw" size="10"><br>
		<input type="submit" value="로그인">
	</form>

</body>
</html>