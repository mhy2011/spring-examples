package com.mhy.web.controller;

import com.mhy.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author mahaiyuan
 * @ClassName: StudentController
 * @date 2016-09-14 下午10:54
 */
@Controller
@RequestMapping("/student")
public class StudentController {

  private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

  //将请求报文转换为字符串绑定到content入参中
  @RequestMapping(value = "/handle1", method = RequestMethod.POST)
  public String handle1(@RequestBody String content) {
    LOGGER.info("content={}", content);
    return "success";
  }


  @RequestMapping(value = "/handle2", method = RequestMethod.GET)
  @ResponseBody
  public Student handle2() {
    Student student = new Student();
    student.setId(123);
    student.setName("张三");
    student.setStuNo("20160010001");
    return student;
  }
}
