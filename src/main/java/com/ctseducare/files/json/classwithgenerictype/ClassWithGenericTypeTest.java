package com.ctseducare.files.json.classwithgenerictype;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ClassWithGenericTypeTest {

  public static void main(String[] args) {

    ClassWithGenericType<Bar> classWithGenericType = new ClassWithGenericType<>();
    classWithGenericType.setValue1InClassWithGenericType(new Bar("value in class with generic type"));

    // O código abaixo gera exceção devido a classe ClassWithGenericType ser do tipo genérico
    //String jsonClassWithGenericType = new Gson().toJson(classWithGenericType);
    //System.out.println(jsonClassWithGenericType);
    //ClassWithGenericType<Bar> classWithGenericTypeDES = new Gson().fromJson(jsonClassWithGenericType, ClassWithGenericType.class);

    Type barType = new TypeToken<ClassWithGenericType<Bar>>(){}.getType();
    String jsonClassWithGenericType = new Gson().toJson(classWithGenericType, barType);
    System.out.println(jsonClassWithGenericType);

    ClassWithGenericType<Bar> classWithGenericTypeDES = (ClassWithGenericType<Bar>)new Gson().fromJson(jsonClassWithGenericType, barType);
    System.out.println(classWithGenericTypeDES.getValue1InClassWithGenericType().getValue1());

  }

}
