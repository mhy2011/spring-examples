package com.mhy.aop.advisor;

/**
 * @author mahaiyuan
 * @ClassName: Waiter
 * @date 2016-10-27 下午1:46
 */
public class Waiter {

  public void greetTo(String name) {
    System.out.printf("Waiter greetTo %s\n", name);
  }

  public void serveTo(String name) {
    System.out.printf("Waiter serveTo %s\n", name);
  }
}
