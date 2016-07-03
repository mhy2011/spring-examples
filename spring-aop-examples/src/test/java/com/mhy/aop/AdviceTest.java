/**
 * 
 */
package com.mhy.aop;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mhy.aop.advice.GreetingAfterAdvice;
import com.mhy.aop.advice.GreetingBeforeAdvice;
import com.mhy.aop.advice.GreetingInterceptor;
import com.mhy.aop.service.WaiterService;
import com.mhy.aop.service.impl.WaiterServiceImpl;

/**
 * 增强类测试
 * @author mahaiyuan
 * @date 2016年7月2日 下午11:52:36
 */
public class AdviceTest {

	//前置增强测试
	@Test
	public void testMethodBeforeAdvice(){
		ProxyFactory pf = new ProxyFactory();	//代理工厂
		pf.setTarget(new WaiterServiceImpl());	//设置代理目标
		pf.addAdvice(new GreetingBeforeAdvice());	//添加增强
		WaiterService service = (WaiterService) pf.getProxy();	//生成代理实例
		service.greetTo("张三");
	}
	
	//前置增强测试
	@Test
	public void testMethodBeforeAdvice2(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("advice-beans.xml");
		WaiterService service = ctx.getBean("waiterService", WaiterService.class);
		service.greetTo("李四");
		ctx.close();
	}
	
	//后置增强测试
	@Test
	public void testAfterReturningAdvice(){
		ProxyFactory pf = new ProxyFactory();	//代理工厂
		pf.setTarget(new WaiterServiceImpl());	//设置代理目标
		pf.addAdvice(new GreetingAfterAdvice());	//添加增强
		WaiterService service = (WaiterService) pf.getProxy();	//生成代理实例
		service.greetTo("张三");
	}
	
	//后置增强测试
	@Test
	public void testAfterReturningAdvice2(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("advice-beans.xml");
		WaiterService service = ctx.getBean("waiterService2", WaiterService.class);
		service.greetTo("李四");
		ctx.close();
	}
	
	//环绕增强测试
	@Test
	public void testMethodInterceptor(){
		ProxyFactory pf = new ProxyFactory();	//代理工厂
		pf.setTarget(new WaiterServiceImpl());	//设置代理目标
		pf.addAdvice(new GreetingInterceptor());	//添加增强
		WaiterService service = (WaiterService) pf.getProxy();	//生成代理实例
		service.greetTo("张三");
	}
	
	//环绕增强测试
	@Test
	public void testMethodInterceptor2(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("advice-beans.xml");
		WaiterService service = ctx.getBean("waiterService3", WaiterService.class);
		service.greetTo("李四");
		ctx.close();
	}
	
	//异常抛出增强测试
	@Test
	public void testThrowsAdvice(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("advice-beans.xml");
		WaiterService service = ctx.getBean("waiterService4", WaiterService.class);
		try {
			service.addWaiter("张三");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ctx.close();
	}
}
