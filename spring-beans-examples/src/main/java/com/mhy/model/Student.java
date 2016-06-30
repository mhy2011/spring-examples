/**
 * 
 */
package com.mhy.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author mahaiyuan
 * @date 2016年6月29日 下午11:53:43
 */
public class Student {

	private int id;
	private String name;
	private List<String> hobbies = new ArrayList<String>();
	private List<Course> courses = new ArrayList<Course>();
	private Set<String> likes = new HashSet<String>();
	private Set<Course> lovedCourses = new HashSet<Course>();	//喜欢的课程
	private Map<String, Double> scores = new HashMap<String, Double>();

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

	public Set<String> getLikes() {
		return likes;
	}

	public void setLikes(Set<String> likes) {
		this.likes = likes;
	}

	public Set<Course> getLovedCourses() {
		return lovedCourses;
	}

	public void setLovedCourses(Set<Course> lovedCourses) {
		this.lovedCourses = lovedCourses;
	}

	public Map<String, Double> getScores() {
		return scores;
	}

	public void setScores(Map<String, Double> scores) {
		this.scores = scores;
	}

}
