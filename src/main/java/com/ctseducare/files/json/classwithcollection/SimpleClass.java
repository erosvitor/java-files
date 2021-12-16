package com.ctseducare.files.json.classwithcollection;

import java.io.Serializable;

public class SimpleClass implements Serializable {

  private static final long serialVersionUID = -4379551668801523841L;

  private int value1;
  private String value2;
  private transient int value3; // 'transient' faz com que o atributo não seja serializado

  public SimpleClass() {

  }

  public SimpleClass(int value1, String value2, int value3) {
    this.value1 = value1;
    this.value2 = value2;
    this.value3 = value3;
  }

  public int getValue1() {
    return value1;
  }

  public void setValue1(int value1) {
    this.value1 = value1;
  }

  public String getValue2() {
    return value2;
  }

  public void setValue2(String value2) {
    this.value2 = value2;
  }

  public int getValue3() {
    return value3;
  }

  public void setValue3(int value3) {
    this.value3 = value3;
  }

}
