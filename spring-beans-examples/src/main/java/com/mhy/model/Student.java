/**
 * 
 */
package com.mhy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mahaiyuan
 * @date 2016年6月29日 下午11:53:43
 */
public class Student {

	private int id;
	private String name;
	private List<String> hobbies = new ArrayList<String>();
	private List<Course> courses = new ArrayList<Course>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hobbies=" + hobbies + "]";
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
