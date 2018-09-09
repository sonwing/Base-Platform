package com.liuz.biz.impl;

import com.liuz.biz.StudentBiz;
import com.liuz.dao.StudentDao;
import com.liuz.model.Student;
/**
 * @author: Liuz
 * @email:sonwing_for@sina.com
 * @date:2018-9-9 上午11:30:57
 * @describe:
 * @version :
 * 
 */
public class StudentBizImpl implements StudentBiz {
	private StudentDao studentDao;
	

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	public void addStudent(Student student) {
		studentDao.insertStudent(student);
		
	}
	

}
