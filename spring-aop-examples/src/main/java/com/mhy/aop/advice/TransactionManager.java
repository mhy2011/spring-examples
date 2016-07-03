/**
 * 
 */
package com.mhy.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author mahaiyuan
 * @date 2016年7月3日 下午11:04:50
 */
public class TransactionManager implements ThrowsAdvice {
	public void afterThrowing(Method m, Object[] args, Object target, Exception ex) {
		System.out.println("--------------");
		System.out.println("method:" + m.getName());
		System.out.println("抛出异常：" + ex.getMessage());
		System.out.println("事务成功回滚......");
	}
}
