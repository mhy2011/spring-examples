/**
 * 
 */
package com.mhy.aop.proxy.service;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.mhy.aop.proxy.PerformanceHandler;
import com.mhy.aop.proxy.service.impl.GoodsServiceImpl;

/**
 * @author mahaiyuan
 * @date 2016年7月2日 下午5:14:22
 */
public class GoodsServiceTest {

	@Test
	public void testDeleteGoods() {
		int goodsId = 10;
		GoodsService target = new GoodsServiceImpl();
		PerformanceHandler handler = new PerformanceHandler(target);
		GoodsService proxyService = (GoodsService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), handler);
		proxyService.deleteGoods(goodsId);
	}
}
