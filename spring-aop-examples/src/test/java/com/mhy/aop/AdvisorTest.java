package com.mhy.aop;

import com.mhy.aop.advisor.Seller;
import com.mhy.aop.advisor.Waiter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mahaiyuan
 * @ClassName: AdvisorTest
 * @date 2016-10-27 下午10:42
 */

public class AdvisorTest {

  @Test
  public void testStaticMethodMatcherPointcutAdvisor() {
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:advisor-beans.xml");
    Seller seller = context.getBean("seller", Seller.class);
    Waiter waiter = context.getBean("waiter", Waiter.class);
    System.out.printf("seller:%s\n", seller);
    System.out.printf("waiter:%s\n", waiter);
    waiter.greetTo("张三");
    System.out.println("====================");
    waiter.serveTo("李四");
    System.out.println("====================");
    seller.greetTo("王五");
  }
}
