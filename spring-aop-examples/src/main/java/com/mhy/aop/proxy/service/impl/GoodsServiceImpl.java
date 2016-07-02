/**
 * 
 */
package com.mhy.aop.proxy.service.impl;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.mhy.aop.proxy.service.GoodsService;

/**
 * @author mahaiyuan
 * @date 2016年7月2日 下午5:03:54
 */
public class GoodsServiceImpl implements GoodsService {

	@Override
	public void deleteGoods(int goodsId) {
		System.out.println("模拟删除商品.goodsId=" + goodsId);
		try {
			TimeUnit.MILLISECONDS.sleep(new Random().nextInt(5) * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
