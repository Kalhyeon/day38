<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PRINT</title>
</head>
<body>
	<!--
		JSP 는 실제로는 자바인데 HTML 과 유사한 느낌으로 바꿔놓은 것이다.
		${member.username} 는 실제로
		PrintWriter out = response.getWriter();
		out.println(member.getUsername());
		
		그래서 username 의 Getter 가 없을 경우,
		Getter Not Found 라는 오류가 발생한다.
	-->
	아이디 : ${member.username}
	생일 : ${member.birthday}
</body>
</html>