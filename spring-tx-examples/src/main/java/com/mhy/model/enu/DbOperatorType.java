package com.mhy.model.enu;

/**
 * @author mahaiyuan
 * @ClassName: DbOperatorType
 * @date 2016-07-19 下午11:33
 */
public enum DbOperatorType {

  INSERT("insert", 1), UPDATE("update", 2), DELETE("delete", 3), SELECT("select", 4);

  private String name;  //操作名称
  private int code; //类型code

  DbOperatorType(String name, int code){
    this.name = name;
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
}
