/**
 * 
 */
package com.mhy.aop.proxy;

/**
 * 性能监控器类
 * @author mahaiyuan
 * @date 2016年7月2日 下午2:13:39
 */
public class PerformanceMonitor {

	private static ThreadLocal<MethodPerformance> threadLocal = new ThreadLocal<MethodPerformance>();
	
	/**
	 * 开始监控
	 * @param method	要监控的方法名
	 * @author mahaiyuan
	 * @date 2016年7月2日 下午2:17:49
	 */
	public static void begin(String method){
		System.out.println("开始方法监控......");
		threadLocal.set(new MethodPerformance(method));
	}
	
	public static void end(){
		MethodPerformance mp = threadLocal.get();
		System.out.println("结束方法监控......");
		mp.printPerformance();	//打印方法执行耗时
	}
}
