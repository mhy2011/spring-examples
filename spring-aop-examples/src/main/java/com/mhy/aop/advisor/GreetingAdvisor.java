package com.mhy.aop.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * 静态普通方法名匹配切面
 * @author mahaiyuan
 * @ClassName: GreetingAdvisor
 * @date 2016-10-27 下午1:42
 */
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {
  @Override
  public boolean matches(Method method, Class<?> targetClass) {

    return "greetTo".equals(method.getName());
  }

  @Override
  public ClassFilter getClassFilter() {
    return new ClassFilter() {
      @Override
      public boolean matches(Class<?> clazz) {
        return Waiter.class.isAssignableFrom(clazz);  //匹配Waiter及其子类
      }
    };
  }
}
