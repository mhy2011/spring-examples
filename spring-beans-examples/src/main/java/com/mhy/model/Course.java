/**
 * 
 */
package com.mhy.model;

/**
 * @author mahaiyuan
 * @date 2016年6月30日 上午12:00:24
 */
public class Course {

	private int id;
	private String name;	//课程名称
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
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	
}
