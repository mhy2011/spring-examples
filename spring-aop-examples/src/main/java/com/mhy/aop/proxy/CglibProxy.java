/**
 * 
 */
package com.mhy.aop.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author mahaiyuan
 * @date 2016年7月2日 下午5:31:26
 */
public class CglibProxy implements MethodInterceptor {
	
	private Enhancer enhancer = new Enhancer();
	
	@SuppressWarnings("rawtypes") 
	public Object getProxy(Class clazz){
		enhancer.setSuperclass(clazz);	//设置需要创建子类的类
		enhancer.setCallback(this);
		return enhancer.create();	//通过字节码技术动态创建子类实例
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		PerformanceMonitor.begin(obj.getClass().getName() + "." + method.getName());	//性能监控开始
		Object result = proxy.invokeSuper(obj, args);	//通过代理类调用父类的方法
		PerformanceMonitor.end();	//性能监控结束
		return result;
	}

}
