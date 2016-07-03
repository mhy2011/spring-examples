/**
 * 
 */
package com.mhy.aop.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

import com.mhy.aop.proxy.PerformanceMonitor;

/**
 * @author mahaiyuan
 * @date 2016年7月3日 下午11:30:42
 */
public class ControllablePerformanceMonitor extends DelegatingIntroductionInterceptor implements Monitorable {

	private static final long serialVersionUID = 1L;
	private ThreadLocal<Boolean> threadLocal = new ThreadLocal<Boolean>();
	
	@Override
	public void setMonitorActive(boolean active) {
		threadLocal.set(active);
	}

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		if(null != threadLocal.get() && threadLocal.get()){	//开启了性能监控
			PerformanceMonitor.begin(mi.getClass().getName() + "." + mi.getMethod().getName());
			Object obj = super.invoke(mi);
			PerformanceMonitor.end();
			return obj;
		}else{
			return super.invoke(mi);
		}
	}

}
