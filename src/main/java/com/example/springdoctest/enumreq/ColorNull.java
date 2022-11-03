package com.example.springdoctest.enumreq;

public enum ColorNull {
  RED("RED"),
  GREEN("GREEN"),
  YELLOW("YELLOW"),
  NULL(null);

  String name;

  ColorNull(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
