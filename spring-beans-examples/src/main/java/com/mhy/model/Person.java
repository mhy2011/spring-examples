/**
 * 
 */
package com.mhy.model;

import java.util.Date;

/**
 * 
 * @author mahaiyuan
 * @date 2016年6月28日 下午7:59:21
 */
public class Person {

	private int id;
	private String name; // 姓名
	private String gender; // 性别
	private Date birthday; // 出生日期
	private Country country;	//所属国家

	public Person() {
		super();
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + "]";
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
