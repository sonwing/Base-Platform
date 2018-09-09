package com.liuz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.liuz.biz.StudentBiz;
import com.liuz.model.Student;
/**
 * @author: Liuz
 * @email:sonwing_for@sina.com
 * @date:2018-9-9 上午11:30:57
 * @describe:
 * @version :
 * 
 */
public class StudentController implements Controller{
	
	private StudentBiz studentBiz;
	

	public void setStudentBiz(StudentBiz studentBiz) {
		this.studentBiz = studentBiz;
	}


	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		Student student = new Student(name,Integer.parseInt(age));
		studentBiz.addStudent(student);
		return new ModelAndView("/welcome.jsp");
	}


}
