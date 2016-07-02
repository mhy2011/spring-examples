/**
 * 
 */
package com.mhy.aop.proxy;

import java.util.Random;

/**
 * @author mahaiyuan
 * @date 2016年7月2日 下午2:29:01
 */
public class UserService {

	@SuppressWarnings("static-access")
	public void addUser(){
		PerformanceMonitor.begin("com.mhy.aop.proxy.UserService.addUser()");
		System.out.println("模拟添加用户......");
		try {
			Thread.currentThread().sleep(new Random().nextInt(10) * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PerformanceMonitor.end();
	}
	
	@SuppressWarnings("static-access")
	public void deleteUser(){
		PerformanceMonitor.begin("com.mhy.aop.proxy.UserService.deleteUser()");
		System.out.println("模拟删除用户......");
		try {
			Thread.currentThread().sleep(new Random().nextInt(10) * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PerformanceMonitor.end();
	}
}
