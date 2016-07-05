/**
 * 
 */
package com.mhy.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * AspectJ切面类
 * @author mahaiyuan
 * @date 2016年7月5日 上午12:05:27
 */
@Aspect	//通过注解将该类标识为一个切面
public class PreGreetingAspect {

	@Before("execution(* greetTo(..))")	//定义切点和增强类型
	public void beforeGreeting(){	//增强的横切逻辑
		System.out.println("How are you");
	}
}
