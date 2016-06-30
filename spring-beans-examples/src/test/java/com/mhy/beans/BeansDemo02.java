/**
 * 
 */
package com.mhy.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mhy.model.Course;
import com.mhy.model.Goods;
import com.mhy.model.Person;
import com.mhy.model.Student;

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

	@Test
	public void test04() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Student student = ctx.getBean("student", Student.class);
		System.out.println(student.getHobbies());
		ctx.close();
	}
	
	@Test
	public void test05() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Student student = ctx.getBean("student2", Student.class);
		List<Course> courses = student.getCourses();
		if(null != courses && courses.size() > 0){
			for(Course c : courses){
				System.out.println(c);
			}
		}
		ctx.close();
	}
	
	@Test
	public void test06() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Student student = ctx.getBean("student3", Student.class);
		Set<String> likes = student.getLikes();
		if(null != likes){
			Iterator<String> it = likes.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
		ctx.close();
	}
	
	@Test
	public void test07() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Student student = ctx.getBean("student4", Student.class);
		Set<Course> lovedCourses = student.getLovedCourses();
		if(null != lovedCourses){
			Iterator<Course> it = lovedCourses.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
		ctx.close();
	}
	
	@Test
	public void test08() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Student student = ctx.getBean("student5", Student.class);
		Map<String, Double> scores = student.getScores();
		System.out.println(scores);
		ctx.close();
	}
	
	@Test
	public void test09() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Person p = ctx.getBean("p9", Person.class);
		System.out.println(p);
		ctx.close();
	}
	
	@Test
	public void test10() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Person p = ctx.getBean("p10", Person.class);
		System.out.println(p);
		System.out.println(p.getCountry());
		ctx.close();
	}
	
	@Test
	public void test11() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		Person p = ctx.getBean("p11", Person.class);
		System.out.println(p);
		System.out.println(p.getCountry());
		ctx.close();
	}
}
