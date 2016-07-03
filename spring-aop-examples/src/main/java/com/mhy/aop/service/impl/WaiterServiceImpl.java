/**
 * 
 */
package com.mhy.aop.service.impl;

import java.sql.SQLException;

import com.mhy.aop.service.WaiterService;

/**
 * @author mahaiyuan
 * @date 2016年7月2日 下午11:47:28
 */
public class WaiterServiceImpl implements WaiterService {

	@Override
	public void greetTo(String name) {
		System.out.println("greet to " + name);
	}

	@Override
	public void addWaiter(String name) throws SQLException {
		System.out.println("模拟添加服务员.name=" + name);
		throw new SQLException("添加服务员异常");	//模拟异常
	}

}
