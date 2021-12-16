package com.ctseducare.files.json.classwithnestedclass;

import com.ctseducare.files.json.classwithnestedclass.ClassWithNestedClass.NestedClass;
import com.google.gson.Gson;

public class ClassWithNestedClassTest {

  public static void main(String[] args) {

    ClassWithNestedClass cwnc = new ClassWithNestedClass();
    cwnc.setValue1("Class with nested class");
    NestedClass nestedClass = cwnc.new NestedClass();
    nestedClass.value1InNestedClass = "value1 in nested class";
    cwnc.setValue2(nestedClass);

    String jsonClassWithNestedClass = new Gson().toJson(cwnc);
    System.out.println(jsonClassWithNestedClass);

    ClassWithNestedClass cwncDES = new Gson().fromJson(jsonClassWithNestedClass, ClassWithNestedClass.class);
    System.out.println(cwncDES.getValue1() + ", " + cwncDES.getValue2().value1InNestedClass);

  }

}
