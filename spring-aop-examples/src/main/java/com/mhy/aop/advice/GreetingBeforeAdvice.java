/**
 * 
 */
package com.mhy.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 前置增强
 * @author mahaiyuan
 * @date 2016年7月2日 下午11:48:35
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		String name = (String) args[0];
		System.out.printf("您好 %s , 欢迎光临\r\n", name);
	}

}
