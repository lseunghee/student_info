<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.student.StudentDao"%>
<%@page import="com.itwill.student.Student"%>
<%@page import="com.itwill.student.StudentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학생리스트</h1><hr>
	<a href='student_insert_form.do'>학생 가입</a>
	
	<table border=1>
	<tr align="center"><td>학번</td><td>이름</td><td>주소</td><td>국어</td><td>영어</td><td>수학</td></tr>
	
	<c:forEach items="${studentList}" var="studentList">
		<tr align="center">
			<td><a href="student_view.do?no=${studentList.no}">${studentList.no}</a></td>
			<td>${studentList.name}</td>
			<td>${studentList.address}</td>
			<td>${studentList.kor}</td>
			<td>${studentList.eng}</td>
			<td>${studentList.math}</td>
		</tr>
	</c:forEach>
	
	</table>
</body>
</html>