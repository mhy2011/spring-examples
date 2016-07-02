/**
 * 
 */
package com.mhy.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 后置增强
 * @author mahaiyuan
 * @date 2016年7月2日 下午11:48:35
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("很高兴为您服务，请随意......");
	}
}
