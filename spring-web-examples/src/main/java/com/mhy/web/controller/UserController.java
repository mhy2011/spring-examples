package com.mhy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author mahaiyuan
 * @ClassName: UserController
 * @date 2016-09-01 下午10:56
 */
@Controller
@RequestMapping("/user")
public class UserController {

  /**
   * 注册操作
   * @return
   */
  @RequestMapping("/register")
  public String register(){
    return "user/register";
  }

  @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
  public String doRegister(){
    return "user/success";
  }
}
