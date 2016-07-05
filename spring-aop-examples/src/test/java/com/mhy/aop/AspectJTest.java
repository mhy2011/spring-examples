/**
 * 
 */
package com.mhy.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mhy.aop.aspectj.PreGreetingAspect;
import com.mhy.aop.aspectj.service.WaiterService;
import com.mhy.aop.aspectj.service.impl.WaiterServiceImpl;

/**
 * 增强类测试
 * @author mahaiyuan
 * @date 2016年7月2日 下午11:52:36
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:aspectj-beans.xml")
public class AspectJTest {

	@Autowired
	private WaiterService waiterService;
	
	@Test
	public void test02(){
		waiterService.greetTo("王五");
		System.out.println("============================");
		waiterService.serveTo("赵六");
	}
	
	@Test
	public void test01(){
		WaiterService target = new WaiterServiceImpl();
		AspectJProxyFactory factory = new AspectJProxyFactory();
		factory.setTarget(target);	//设置目标对象[需要先设置目标对象，然后再添加切面类，不然会报空指针异常]
		factory.addAspect(PreGreetingAspect.class);	//添加切面类
		
		WaiterService service = factory.getProxy();	//生成代理对象
		service.greetTo("张三");
		System.out.println("============================");
		service.serveTo("李四");
	}
	
}
