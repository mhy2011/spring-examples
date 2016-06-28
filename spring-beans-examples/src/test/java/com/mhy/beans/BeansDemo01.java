/**
 * 
 */
package com.mhy.beans;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mhy.model.Goods;
import com.mhy.model.Person;

/**
 * @author mahaiyuan
 * @date 2016年6月28日 下午8:04:11
 */
public class BeansDemo01 {

	@Test
	public void test01(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Person person = ctx.getBean("person", Person.class);
		System.out.println(person);
		ctx.close();
	}
	
	@Test
	public void test02(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		System.out.println(ctx.getBean("com.mhy.model.Person", Person.class));
		System.out.println(ctx.getBean("com.mhy.model.Person#1", Person.class));
		System.out.println(ctx.getBean("com.mhy.model.Person#2", Person.class));
		ctx.close();
	}
	
	/**
	 * 依赖注入之setter注入
	 * 
	 * @author mahaiyuan
	 * @date 2016年6月28日 下午11:27:16
	 */
	@Test
	public void test03(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Goods goods = ctx.getBean("goods", Goods.class);
		System.out.println(goods);
		ctx.close();
	}
}
