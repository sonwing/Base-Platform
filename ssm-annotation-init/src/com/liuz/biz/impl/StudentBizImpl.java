package com.liuz.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
@Service("studentBiz")
public class StudentBizImpl implements StudentBiz {
	
	/*@Autowired
	@Qualifier("studentDao")*/
	@Resource(name="studentDao")//2种任选一种即可
	private StudentDao studentDao;
	

	

	@Transactional
	public void addStudent(Student student) throws Exception {
		studentDao.insertStudent(student);
		
	}
	

}
