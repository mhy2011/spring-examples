package com.mhy.web.controller;

import com.mhy.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author mahaiyuan
 * @ClassName: HandleController
 * @date 2016-09-06 下午11:20
 */
@Controller
public class HandleController {

  private static final Logger LOGGER = LoggerFactory.getLogger(HandleController.class);

  @RequestMapping("/handle1")
  public String handle1(@RequestParam("name")String username) {
    LOGGER.info("username={}", username);
    return "success";
  }

  @RequestMapping("/handle2")
  public String handle2(@CookieValue("JSESSIONID") String sessionId,
                        @RequestHeader("Accept-Language")String acceptLanguage) {
    LOGGER.info("JSESSIONID={}, Accept-Language={}", sessionId, acceptLanguage);
    return "success";
  }

  /**
   * 请求参数按名称匹配的方式绑定到类的属性中
   * @param student
   * @return
   */
  @RequestMapping("/handle3")
  public String handle3(Student student) {
    LOGGER.info("name={}, stuNo={}", student.getName(), student.getStuNo());
    return "success";
  }

  @RequestMapping("/handle4")
  public String handle4(HttpServletRequest request) {
    String name = request.getParameter("name");
    LOGGER.info("name={}", name);
    return "success";
  }

  /**
   * 使用HttpSession作为入参
   * @return
   */
  @RequestMapping("/handle5")
  public String handle5(HttpSession session, @RequestParam("username") String username) {
    LOGGER.info("username={}", username);
    session.setAttribute("username", username); //设置session值
    return "success-session";
  }

  @RequestMapping("/handle6")
  public void handle6(OutputStream os) throws IOException {
    Resource resource = new ClassPathResource("/xiaopohai.jpg");  //读取类路径下图片文件
    FileCopyUtils.copy(resource.getInputStream(), os);  //将图片写出到输出流
  }
}
