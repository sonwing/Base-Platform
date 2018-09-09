package com.liuz.biz;

import com.liuz.model.Student;
/**
 * @author: Liuz
 * @email:sonwing_for@sina.com
 * @date:2018-9-9 上午11:30:57
 * @describe:
 * @version :
 * 
 */
public interface StudentBiz {
	/**
	 * 注册
	 * @param student 学生对象
	 * @throws Exception
	 */
	void addStudent(Student student) throws Exception;

}
