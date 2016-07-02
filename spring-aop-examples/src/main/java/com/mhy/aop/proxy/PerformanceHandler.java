/**
 * 
 */
package com.mhy.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author mahaiyuan
 * @date 2016年7月2日 下午5:08:00
 */
public class PerformanceHandler implements InvocationHandler {

	private Object target;	//要代理的类
	
	public PerformanceHandler(Object target){
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		PerformanceMonitor.begin(target.getClass().getName() + "." + method.getName());	//开始性能监控
		Object obj = method.invoke(target, args);	//通过反射执行目标方法
		PerformanceMonitor.end();	//结束性能监控
		return obj;
	}

}
