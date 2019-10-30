package com.itwill.student;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
	public final static String NAMESPACE = "com.itwill.student.mapper.StudentMapper.";
	@Autowired
	private SqlSession sqlSession;	
	
	public StudentDaoImpl() throws Exception {
		// TODO Auto-generated constructor stub
	}
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<Student> selectByAll() throws Exception {
		List<Student> studentList = sqlSession.selectList(NAMESPACE + "selectByAll");
		return studentList;
	}

	@Override
	public Student selectByOne(int no) throws Exception {
		Student student = sqlSession.selectOne(NAMESPACE+ "selectByOne", no);
		return student;
	}
	
	@Override
	public int insertStudent(Student student) throws Exception {
		int insertOk = sqlSession.insert(NAMESPACE + "insertStudent", student);
		return insertOk;
	}
	
	@Override
	public int updateStudent(Student student) throws Exception {
		int updateOk = sqlSession.update(NAMESPACE + "updateStudent", student);
		return updateOk;
	}

	
	@Override
	public int deleteStudent(int no) throws Exception {
		int deleteOk = sqlSession.delete(NAMESPACE + "deleteStudent", no);
		return deleteOk;
	}
	
}
