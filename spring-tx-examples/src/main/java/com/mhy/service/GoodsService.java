package com.mhy.service;

import com.alibaba.fastjson.JSONObject;
import com.mhy.dao.GoodsMapper;
import com.mhy.dao.SysLogMapper;
import com.mhy.model.Goods;
import com.mhy.model.SysLog;
import com.mhy.model.enu.DbOperatorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author mahaiyuan
 * @ClassName: GoodsService
 * @date 2016-07-20 下午8:03
 */
@Repository("goodsService")
public class GoodsService {
  @Autowired
  private GoodsMapper goodsMapper;
  @Autowired
  private SysLogMapper sysLogMapper;

  /**
   * 保存商品信息
   * @param goods
   * @return
   */
  public int saveGoods(Goods goods){
    int num = goodsMapper.insert(goods);  //保存商品信息

    SysLog sysLog = new SysLog();
    sysLog.setOperateType(DbOperatorType.INSERT.getName());
    sysLog.setMethod("GoodsService.saveGoods");
    sysLog.setContent(JSONObject.toJSONString(goods));
    sysLog.setAddTime(new Date());
    sysLogMapper.insert(sysLog);  //保存操作日志

    return num;
  }

}
