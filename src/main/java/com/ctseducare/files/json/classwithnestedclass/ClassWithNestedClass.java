package com.ctseducare.files.json.classwithnestedclass;

public class ClassWithNestedClass {

  class NestedClass {
    public String value1InNestedClass;

    public NestedClass() {

    }
  }

  private String value1;
  private NestedClass value2;

  public String getValue1() {
    return value1;
  }

  public void setValue1(String value1) {
    this.value1 = value1;
  }

  public NestedClass getValue2() {
    return value2;
  }

  public void setValue2(NestedClass value2) {
    this.value2 = value2;
  }

}
