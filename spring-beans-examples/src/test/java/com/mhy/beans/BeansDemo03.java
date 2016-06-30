/**
 * 
 */
package com.mhy.beans;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mhy.model.Person;
import com.mhy.model.Teacher;

/**
 * @author mahaiyuan
 * @date 2016年6月28日 下午8:04:11
 */
public class BeansDemo03 {

	@Test
	public void test13() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Person p = ctx.getBean("p12", Person.class);
		System.out.println(p);
		System.out.println(p.getCountry());
		System.out.println("=========================");
		Person p2 = ctx.getBean("p13", Person.class);
		System.out.println(p2);
		System.out.println(p2.getCountry());
		ctx.close();
	}
	
	@Test
	public void test16() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		System.out.println(ctx.getBean("p14", Person.class));
		System.out.println(ctx.getBean("p14", Person.class));
		System.out.println("=========================");
		System.out.println(ctx.getBean("p15", Person.class));
		System.out.println(ctx.getBean("p15", Person.class));
		System.out.println("=========================");
		System.out.println(ctx.getBean("p16", Person.class));
		System.out.println(ctx.getBean("p16", Person.class));
		System.out.println("=========================");
		ctx.close();
	}
	
	@Test
	public void test17(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-anno.xml");
		System.out.println(ctx.getBean("teacher", Teacher.class));
		System.out.println(ctx.getBean("teacher", Teacher.class));
		ctx.close();
	}
	
}
