/**
 * 
 */
package com.mhy.aop.proxy.service;

import org.junit.Test;

import com.mhy.aop.proxy.CglibProxy;

/**
 * @author mahaiyuan
 * @date 2016年7月2日 下午5:14:22
 */
public class StudentServiceTest {

	@Test
	public void testDeleteStudent() {
		int studentId = 10;
		StudentService service = (StudentService) new CglibProxy().getProxy(StudentService.class);
		service.deleteStudent(studentId);
	}
}
