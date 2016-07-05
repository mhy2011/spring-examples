/**
 * 
 */
package com.mhy.aop.aspectj.service.impl;

import com.mhy.aop.aspectj.service.WaiterService;

/**
 * @author mahaiyuan
 * @date 2016年7月5日 上午12:06:48
 */
public class WaiterServiceImpl implements WaiterService {

	@Override
	public void greetTo(String name) {
		System.out.println("WaiterServiceImpl.greetTo name=" + name);
	}

	@Override
	public void serveTo(String name) {
		System.out.println("WaiterServiceImpl.serveTo name=" + name);
	}

}
