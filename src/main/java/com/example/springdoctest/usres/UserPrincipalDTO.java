package com.example.springdoctest.usres;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public class UserPrincipalDTO {
  @ArraySchema(minItems = 1, arraySchema = @Schema(implementation = RaoGroupDTO.class), uniqueItems = true)
  private List<RaoGroupDTO> raoGroup;

  public List<RaoGroupDTO> getRaoGroup() {
    return raoGroup;
  }

  public void setRaoGroup(List<RaoGroupDTO> raoGroup) {
    this.raoGroup = raoGroup;
  }
}
