package com.mhy.web.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mahaiyuan
 * @ClassName: IndexController
 * @date 2016-09-03 下午9:31
 */
@Controller
public class IndexController {

  @RequestMapping(value = {"", "/", "index"})
  public String index(){
    return "index";
  }
}
