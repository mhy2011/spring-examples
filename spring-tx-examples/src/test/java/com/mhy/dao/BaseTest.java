package com.mhy.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author mahaiyuan
 * @ClassName: BaseTest
 * @date 2016-07-20 上午12:05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:/tx-beans.xml"
})
public class BaseTest {
}
