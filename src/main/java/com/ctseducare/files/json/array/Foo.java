package com.ctseducare.files.json.array;

public class Foo {
	
  private boolean active;
  private int id;
  private String name;

  public Foo() {

  }

  public Foo(boolean active, int id, String name) {
    this.active = active;
    this.id = id;
    this.name = name;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
