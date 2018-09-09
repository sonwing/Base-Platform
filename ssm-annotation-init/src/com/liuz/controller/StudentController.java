package com.liuz.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
@Controller
@RequestMapping("/test")
public class StudentController {
	 private static Logger logger = Logger.getLogger(StudentController.class);
	
	@Autowired
	@Qualifier("studentBiz")
	//@Resource(name="studentBiz")v下面2个任意选一个即可
	private StudentBiz studentBiz;
	


	@RequestMapping("/register.do")
	public String register(String name,int age){		
		Student student = new Student(name,age);
		try {
			studentBiz.addStudent(student);
		} catch (Exception e) {
			logger.error("", e);
			e.printStackTrace();
		}
		return "/welcome.jsp";
	}


}
