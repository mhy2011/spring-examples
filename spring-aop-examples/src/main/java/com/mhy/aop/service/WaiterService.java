/**
 * 
 */
package com.mhy.aop.service;

import java.sql.SQLException;

/**
 * @author mahaiyuan
 * @date 2016年7月2日 下午11:46:39
 */
public interface WaiterService {
	void greetTo(String name);
	
	void addWaiter(String name) throws SQLException;
}
