package com.mhy.dao;

import com.mhy.model.Goods;
import com.mhy.model.SysLog;
import com.mhy.model.enu.DbOperatorType;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


/**
 * @author mahaiyuan
 * @ClassName: SysLogMapperTest
 * @date 2016-07-20 上午12:04
 */
public class SysLogMapperTest extends BaseTest {

  @Autowired
  private SysLogMapper sysLogMapper;

  @Test
  public void testInsert() throws Exception {
    SysLog sysLog = new SysLog();
    sysLog.setAddTime(new Date());
    sysLog.setContent("测试添加日志");
    sysLog.setMethod("SysLogMapper.insert");
    sysLog.setOperateType(DbOperatorType.INSERT.getName());
    int num = sysLogMapper.insert(sysLog);
    Assert.assertEquals(1, num);
  }
}