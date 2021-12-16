package com.ctseducare.files.json.simpleclass;

import com.google.gson.Gson;

public class SimpleClassTest {

  public static void main(String[] args) {

    SimpleClass simpleClass = new SimpleClass(1, "SimpleClass", 2);

    String jsonSimpleClass = new Gson().toJson(simpleClass);
    System.out.println(jsonSimpleClass);

    SimpleClass simpleClassDES = new Gson().fromJson(jsonSimpleClass, SimpleClass.class);
    System.out.println(simpleClassDES.getValue1() + ", " + simpleClassDES.getValue2());

  }

}
