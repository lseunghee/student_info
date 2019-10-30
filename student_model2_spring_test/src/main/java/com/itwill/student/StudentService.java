package com.itwill.student;

import java.util.List;

public interface StudentService {
	
	/*
	 * CREATE
	 */
	int insertStudent(Student student) throws Exception;
	
	/*
	 * READ ALL
	 */
	List<Student> selectByAll() throws Exception;
		
	/*
	 * READ ONE
	 */
	Student selectByOne(int no) throws Exception;
	
	/*
	 * UPDATE
	 */
	int updateStudent(Student student) throws Exception;
	
	/*
	 * DELETE
	 */
	int deleteStudent(int no) throws Exception;
}
