package com.ctseducare.files.json.classwithcollection;

import java.util.ArrayList;
import java.util.List;

public class ClassWithCollection {

  private String value1;
  private List<SimpleClass> value2 = new ArrayList<>();

  public String getValue1() {
    return value1;
  }

  public void setValue1(String value1) {
    this.value1 = value1;
  }

  public List<SimpleClass> getValue2() {
    return value2;
  }

  public void setValue2(List<SimpleClass> value2) {
    this.value2 = value2;
  }

}
