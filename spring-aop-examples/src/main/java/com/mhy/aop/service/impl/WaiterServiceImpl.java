/**
 * 
 */
package com.mhy.aop.service.impl;

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

}
