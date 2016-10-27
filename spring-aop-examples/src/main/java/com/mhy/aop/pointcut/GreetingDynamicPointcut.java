package com.mhy.aop.pointcut;

import com.mhy.aop.advisor.Waiter;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 动态切点
 * @author mahaiyuan
 * @ClassName: GreetingDynamicPointcut
 * @date 2016-10-27 下午11:57
 */
public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {

  private static List<String> names = new ArrayList<>(2);
  static {
    names.add("张三");
    names.add("李四");
  }

  //对类进行静态切点检查
  @Override
  public ClassFilter getClassFilter() {
    return new ClassFilter() {
      @Override
      public boolean matches(Class<?> clazz) {
        return Waiter.class.isAssignableFrom(clazz);
      }
    };

  }

  //对方法进行静态切点检查
  @Override
  public boolean matches(Method method, Class<?> targetClass) {
    return "greetTo".equals(method.getName());
  }

  //对方法进行动态切点检查
  @Override
  public boolean matches(Method method, Class<?> targetClass, Object... args) {
    String name = (String) args[0];
    for (String s : names) {
      if (s.equals(name)) {
        return true;
      }
    }
    return false;
  }
}
