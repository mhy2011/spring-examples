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
public class BeansDemo02 {

	@Test
	public void test01() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Goods goods = ctx.getBean("g5", Goods.class);
		System.out.println(goods);
		ctx.close();
	}

	@Test
	public void test02() {
		ClassPathXmlApplicationContext parent = new ClassPathXmlApplicationContext("parent-bean.xml");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "child-bean.xml" }, parent);
		Person p = ctx.getBean("p", Person.class);
		System.out.println(p.getCountry());
		System.out.println("=========================");
		Person p2 = ctx.getBean("p2", Person.class);
		System.out.println(p2.getCountry());
		ctx.close();
	}
	
	@Test
	public void test03() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Person person = ctx.getBean("person2", Person.class);
		System.out.println(person.getCountry());
		ctx.close();
	}

}
