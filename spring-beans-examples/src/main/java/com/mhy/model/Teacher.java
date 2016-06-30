/**
 * 
 */
package com.mhy.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author mahaiyuan
 * @date 2016年6月30日 下午6:33:10
 */
@Component
@Scope("prototype")
public class Teacher {

	private int id;
	private String name;

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

}
