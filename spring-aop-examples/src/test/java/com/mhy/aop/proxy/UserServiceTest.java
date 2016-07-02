/**
 * 
 */
package com.mhy.aop.proxy;

import org.junit.Test;

/**
 * @author mahaiyuan
 * @date 2016年7月2日 下午2:37:20
 */
public class UserServiceTest {

	@Test
	public void testAddAndDelete(){
		UserService service = new UserService();
		service.addUser();
		service.deleteUser();
	}
}
