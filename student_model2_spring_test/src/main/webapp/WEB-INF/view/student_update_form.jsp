<%@page import="com.itwill.student.StudentService"%>
<%@page import="com.itwill.student.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="student_update_action.do" method="post">
	학번<input type="text" name="no" value="${student.no}" readonly="readonly"><br/>
	이름<input type="text" name="name" value="${student.name}"><br/>
	주소<input type="text" name="address" value="${student.address}"><br/>
	국어<input type="text" name="kor" value="${student.kor}"><br/>
	영어<input type="text" name="eng" value="${student.eng}"><br/>
	수학<input type="text" name="math" value="${student.math}"><br/>
	<input type="submit" value="수정">
	<input type="reset" value="취소">
</form>
</body>
</html>