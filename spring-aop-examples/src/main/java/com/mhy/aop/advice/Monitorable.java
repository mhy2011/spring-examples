/**
 * 
 */
package com.mhy.aop.advice;

/**
 * @author mahaiyuan
 * @date 2016年7月3日 下午11:29:39
 */
public interface Monitorable {

	/**
	 * 设置是否打开性能监控
	 * @param active
	 * @author mahaiyuan
	 * @date 2016年7月3日 下午11:32:20
	 */
	void setMonitorActive(boolean active);
}
