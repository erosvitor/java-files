package com.ctseducare.files.json.classwithcollection;

import com.google.gson.Gson;

public class ClassWithCollectionTest {

  public static void main(String[] args) {

    ClassWithCollection cwc = new ClassWithCollection();
    cwc.setValue1("Class with collection");
    cwc.getValue2().add(new SimpleClass(1, "SimpleClass 01",  2));
    cwc.getValue2().add(new SimpleClass(2, "SimpleClass 02",  4));
    cwc.getValue2().add(new SimpleClass(3, "SimpleClass 03",  6));

    String jsonClassWithCollection = new Gson().toJson(cwc);
    System.out.println(jsonClassWithCollection);

    ClassWithCollection classWithCollectionDES = new Gson().fromJson(jsonClassWithCollection, ClassWithCollection.class);
    for (SimpleClass so : classWithCollectionDES.getValue2()) {
      System.out.println(so.getValue1() + ", " + so.getValue2() + ", " + so.getValue3());
    }

  }

}
