package com.mhy.service;

import com.mhy.dao.BaseTest;
import com.mhy.model.Goods;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author mahaiyuan
 * @ClassName: GoodsServiceTest
 * @date 2016-07-20 下午8:10
 */
public class GoodsServiceTest extends BaseTest {

  @Autowired
  private GoodsService goodsService;

  @Test
  public void testSaveGoods(){
    Goods goods = new Goods();
    goods.setPrice(123D);
    goods.setName("测试商品05");
    goods.setStartTime(new Date());
    int num = goodsService.saveGoods(goods);
    Assert.assertEquals(1, num);
  }

  @Test
  public void testGetGoods(){
    Integer id = 3;
    Goods goods = goodsService.getGoods(id);
    Assert.assertNotNull(goods);
    assertEquals(id, goods.getId());
  }
}