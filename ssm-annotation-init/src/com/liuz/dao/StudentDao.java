package com.liuz.dao;

import org.apache.ibatis.annotations.Insert;

import com.liuz.model.Student;
/**
 * @author: Liuz
 * @email:sonwing_for@sina.com
 * @date:2018-9-9 上午11:30:57
 * @describe:
 * @version :
 * 
 */
public interface StudentDao {
	
	//@Insert("	insert into student (name,age) values(#{name},#{age})")//这种写法是mybatis的注解式，官方不推荐使用
	void insertStudent(Student student) throws Exception;

}
