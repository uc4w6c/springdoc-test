package com.example.springdoctest;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

public class ClassObjectRequest {
  // @Parameter(name = "id")
  private String id;
  @Parameter(name = "name")
  private String name;

  @Parameter(name = "intParam")
  private Integer age;

  public ClassObjectRequest(String id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "ClassObjectRequest{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
