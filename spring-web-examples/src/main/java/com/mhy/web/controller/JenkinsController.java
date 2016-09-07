package com.mhy.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mahaiyuan
 * @ClassName: JenkinsController
 * @date 2016-09-07 下午2:36
 */
@Controller
@RequestMapping("/jenkins/{jobName}")
public class JenkinsController {

  private static final Logger LOGGER = LoggerFactory.getLogger(JenkinsController.class);

  /**
   * 获取某个任务的某次构建日志
   * @param jobName 任务名称
   * @param buildNumber 构建号
   * @return
   */
  @RequestMapping("/{buildNumber}")
  public String getConsole(@PathVariable("jobName")String jobName, @PathVariable("buildNumber") int buildNumber) {
    LOGGER.info("jobName={}, buildNumber={}", jobName, buildNumber);
    return "success";
  }
}
