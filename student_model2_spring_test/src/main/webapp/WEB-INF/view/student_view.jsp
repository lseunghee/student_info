<%@page import="com.itwill.student.StudentService"%>
<%@page import="com.itwill.student.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<body>

<h1> ${student.name} 님 상세보기</h1><hr>
<a href='student_list.do'>학생 목록</a><br>

<form method='post' action='student_delete_action.do'>
	<input type='hidden' name='no' value='${student.no}'>
	<input type='submit' value='${student.name}님 삭제'>
</form>
<form method='post' action='student_update_form.do'>
	<input type='hidden' name='no' value='${student.no}'>
	<input type='submit' value='${student.name}님 수정'>
</form>

<p>
학번:${student.no}<br/>
이름:${student.name}<br/>
주소:${student.address}<br/>
국어:${student.kor}<br/>
영어:${student.eng}<br/>
수학:${student.math}<br/>
</p>

</body>
</head>
</html>