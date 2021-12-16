package com.ctseducare.files.json.array;

import com.google.gson.Gson;

public class JsonArrayTest {

  public static void main(String[] args) {
    Foo[] foos = new Foo[3];

    foos[0] = new Foo(true, 1, "aaa");
    foos[1] = new Foo(true, 2, "bbb");
    foos[2] = new Foo(true, 3, "ccc");

    Gson gson = new Gson();
    String slavesStr = gson.toJson(foos);
    System.out.println(slavesStr);

    String test = "[{\"active\":true,\"id\":1,\"name\":\"AAA\"},{\"active\":true,\"id\":2,\"name\":\"BBB\"}]";
    Foo[] arrayFoos = gson.fromJson(test, Foo[].class);

    for (Foo f : arrayFoos) {
      System.out.println(f.getName());
    }
  }

}
