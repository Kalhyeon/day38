<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up</title>
</head>
<body>
	<h2>회원 가입</h2>
	<form action="/day38/member/create" method="post">
		아이디 : <input type="text" name="username" value="spring"><br>
		이메일 : <input type="text" name="email" value="spring@spring.com"><br>
		비밀번호 : <input type="password" name="password" value="1234"><br>
		이름 : <input type="text" name="name" value="홍길동"><br>
		생일 : <input type="date" name="birthday"><br>
		전화번호 : <input type="text" name="tel" value="010-1234-5678"><br>
		<button>가입하기</button>
	</form>
</body>
</html>