package com.example.springdoctest.usres;

import io.swagger.v3.oas.annotations.media.Schema;

public class RaoGroupDTO {
  @Schema(name = "name", description = "xxxx", example = "S/MIME RA Operator")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
