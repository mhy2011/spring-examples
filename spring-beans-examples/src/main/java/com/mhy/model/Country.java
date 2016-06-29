/**
 * 
 */
package com.mhy.model;

/**
 * @author mahaiyuan
 * @date 2016年6月29日 下午11:34:32
 */
public class Country {

	private int id;
	private String name;

	public Country() {
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

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}

}
