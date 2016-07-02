/**
 * 
 */
package com.mhy.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕增强
 * @author mahaiyuan
 * @date 2016年7月2日 下午11:48:35
 */
public class GreetingInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object[] args = invocation.getArguments();	//目标方法入参
		String name = (String) args[0];
		System.out.printf("您好 %s , 欢迎光临\r\n", name);
		Object obj = invocation.proceed();	//执行目标方法
		System.out.println("很高兴为您服务，请随意......");
		return obj;
	}
}
