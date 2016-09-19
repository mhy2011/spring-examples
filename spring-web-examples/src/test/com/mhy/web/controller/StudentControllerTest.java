package com.mhy.web.controller;

import com.mhy.model.Student;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * @author mahaiyuan
 * @ClassName: StudentControllerTest
 * @date 2016-09-14 下午11:25
 */
public class StudentControllerTest {
  @Test
  public void testHandle1(){
    RestTemplate restTemplate = new RestTemplate();
    Student student = new Student();
    student.setId(123);
    restTemplate.postForLocation("http://localhost:8080/student/handl1", student);
  }
}
