/**
 * 
 */
package com.mhy.aop.proxy.service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author mahaiyuan
 * @date 2016年7月2日 下午5:30:29
 */
public class StudentService {

	public void deleteStudent(int studentId) {
		System.out.println("模拟删除学生信息.studentId=" + studentId);
		try {
			TimeUnit.MILLISECONDS.sleep(new Random().nextInt(5) * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
