/**
 * 
 */
package com.mhy.model;

/**
 * 商品信息模型
 * 
 * @author mahaiyuan
 * @date 2016年6月28日 下午11:23:33
 */
public class Goods {

	private int id;
	private String name; // 商品名称
	private double price; // 价格

	public Goods() {
		super();
	}
	
	public Goods(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Goods(int id, double price, String name) {
		super();
		this.id = id;
//		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
