<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	${id }

	<form action="joinForm" method="post">
		이름 : <input type="text" name="name"/> <br/>
		나이 : <input type="text" name="age"/><br/>
		<button>리다이렉트처리하기</button>
	</form>

</body>
</html>