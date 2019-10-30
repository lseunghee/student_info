package com.itwill.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	public StudentServiceImpl() throws Exception {
		// TODO Auto-generated constructor stub
	}
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	@Override
	public List<Student> selectByAll() throws Exception {
		return studentDao.selectByAll();
	}

	@Override
	public Student selectByOne(int no) throws Exception {
		return studentDao.selectByOne(no);
	}
	
	@Override
	public int insertStudent(Student student) throws Exception {
		return studentDao.insertStudent(student);
	}


	@Override
	public int updateStudent(Student student) throws Exception {
		return studentDao.updateStudent(student);
	}

	
	@Override
	public int deleteStudent(int no) throws Exception {
		return studentDao.deleteStudent(no);
	}
	
}
