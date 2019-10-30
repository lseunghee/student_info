<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>학생 추가 페이지</h1><hr>
<form action="student_insert_action.do" method="post">
	학번<input type="text" name="no"><br/>
	이름<input type="text" name="name"><br/>
	주소<input type="text" name="address"><br/>
	국어<input type="text" name="kor"><br/>
	영어<input type="text" name="eng"><br/>
	수학<input type="text" name="math"><br/>
	<input type="submit" value="추가">
	<input type="reset" value="취소">
</form>
</body>
</html>