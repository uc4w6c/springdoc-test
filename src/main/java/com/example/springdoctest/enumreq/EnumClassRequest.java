package com.example.springdoctest.enumreq;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;

public class EnumClassRequest {
  @Nullable
  @Schema(nullable = true, example = "RED", allowableValues = { "null" })
  private Color color;

  public EnumClassRequest(@JsonProperty("color") Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }
}
