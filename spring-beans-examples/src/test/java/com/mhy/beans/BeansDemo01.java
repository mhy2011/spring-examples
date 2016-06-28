/**
 * 
 */
package com.mhy.beans;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
