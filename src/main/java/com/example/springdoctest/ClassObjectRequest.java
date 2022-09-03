package com.example.springdoctest;

import io.swagger.v3.oas.annotations.Parameter;

public class ClassObjectRequest {
  // @Parameter(name = "id")
  private String id;
  // @Parameter(name = "name")
  private String name;

  public ClassObjectRequest(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "ClassObjectRequest{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
