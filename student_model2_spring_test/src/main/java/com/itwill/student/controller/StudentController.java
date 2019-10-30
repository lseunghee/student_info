package com.itwill.student.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itwill.student.Student;
import com.itwill.student.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/student_list.do")
	public String student_list(Model model, HttpServletRequest request) {
		String forwardPath="";
		try {
			List<Student> studentList = studentService.selectByAll();
			model.addAttribute("studentList", studentList);
			forwardPath = "forward:/WEB-INF/view/student_list.jsp";
		} catch (Exception e) {
			forwardPath = "forward:/WEB-INF/view/student_error.jsp";
			e.printStackTrace();
		}
		return forwardPath;
	}
	
	@RequestMapping("/student_view.do")
	public String student_view(@RequestParam(value="no", required=false, defaultValue="-999") String no, Map map){
		String forwardPath="";
		try {
			Student student = studentService.selectByOne(Integer.parseInt(no));
			if(student == null) {
				forwardPath = "redirect:student_list.do";
			} else {
				map.put("student", student);
				forwardPath = "forward:/WEB-INF/view/student_view.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath="forward:/WEB-INF/view/student_error.jsp";
		}
		return forwardPath;
	}
	
	@RequestMapping("/student_insert_form.do")
	public String student_insert_form() {
		String forwardPath = "";
		forwardPath = "forward:/WEB-INF/view/student_insert_form.jsp";
		return forwardPath;
	}
	
	@RequestMapping(value = "/student_insert_action.do", method = RequestMethod.POST)
	public String student_insert_action(@ModelAttribute Student student) {
		String forwardPath = "";
		try {
			int insertOk = studentService.insertStudent(student);
			if(insertOk == 1) {
				//forwardPath = "forward:/WEB-INF/view/student_list.jsp"; 에러(?)
				forwardPath = "redirect:student_list.do";
			} else {
				forwardPath = "forward:/WEB-INF/view/student_error.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "forward:/WEB-INF/view/student_error.jsp";
		}
		return forwardPath;
	}
	
	@RequestMapping(value = "/student_update_form.do", method = RequestMethod.GET)
	public String student_update_form_get() {
		String forwardPath = "";
		forwardPath = "redirect:student_list.do";
		return forwardPath;
	}
	
	@RequestMapping(value = "/student_update_form.do", method = RequestMethod.POST)
	public String student_update_form(@RequestParam("no") String no, ModelMap modelMap) {
		String forwardPath = "";
		try {
			Student student = studentService.selectByOne(Integer.parseInt(no));
			modelMap.addAttribute("student", student);
			forwardPath = "forward:/WEB-INF/view/student_update_form.jsp";
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "forward:/WEB-INF/view/student_error.jsp";
		}
		return forwardPath;
	}
	
	@RequestMapping(value = "/student_update_action.do", method = RequestMethod.POST)
	public String student_update_action(@ModelAttribute Student student) {
		String forwardPath = "";
		try {
			int updateOk = studentService.updateStudent(student);
			System.out.println(updateOk);
			if(updateOk == 1) {
				forwardPath = "forward:/WEB-INF/view/student_view.jsp";
			} else {
				forwardPath = "forward:/WEB-INF/view/student_error.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "forward:/WEB-INF/view/student_error.jsp";
		}
		return forwardPath;
	}
	@RequestMapping(value = "/student_delete_action.do", method = RequestMethod.POST)
	public String student_delete_action(@RequestParam("no") String no) {
		String forwardPath = "";
		try {
			int deleteOk = studentService.deleteStudent(Integer.parseInt(no));
			if(deleteOk == 1) {
				forwardPath = "redirect:student_list.do";
			} else {
				forwardPath = "forward:/WEB-INF/view/student_error.jsp";
			}
		}catch (Exception e) {
			e.printStackTrace();
			forwardPath = "forward:/WEB-INF/view/student_error.jsp";
		}
		return forwardPath;
	}
	
	/*
	public String student_error() {
		
	}
	*/
}
