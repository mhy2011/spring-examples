/**
 * 
 */
package com.mhy.aop.proxy;

/**
 * 性能类
 * @author mahaiyuan
 * @date 2016年7月2日 下午2:07:14
 */
public class MethodPerformance {

	private long begin;	//方法执行前时间
	private long end;	//方法执行完成时间
	private String serviceMethod;	//要监控的方法名
	public MethodPerformance(String serviceMethod) {
		super();
		this.serviceMethod = serviceMethod;
		this.begin = System.currentTimeMillis();
	}
	
	/**
	 * 性能打印方法
	 * @author mahaiyuan
	 * @date 2016年7月2日 下午2:10:40
	 */
	public void printPerformance(){
		this.end = System.currentTimeMillis();
		long usedTime = end - begin;	//方法运行耗时
		System.out.printf("方法:%s执行耗时%s毫秒\r\n", serviceMethod, usedTime);
	}
}
