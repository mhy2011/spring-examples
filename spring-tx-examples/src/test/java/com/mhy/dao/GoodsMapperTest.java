package com.mhy.dao;

import com.mhy.model.Goods;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


/**
 * @author mahaiyuan
 * @ClassName: GoodsMapperTest
 * @date 2016-07-20 上午12:04
 */
public class GoodsMapperTest extends BaseTest {

  @Autowired
  private GoodsMapper goodsMapper;

  @Test
  public void testInsert() throws Exception {
    Goods goods = new Goods();
    goods.setName("测试商品001");
    goods.setPrice(123D);
    goods.setStartTime(new Date());

    int num = goodsMapper.insert(goods);
    Assert.assertEquals(1, num);
  }
}