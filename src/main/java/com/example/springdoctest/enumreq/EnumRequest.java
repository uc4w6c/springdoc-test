package com.example.springdoctest.enumreq;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;

public record EnumRequest(
  @Nullable
  @Schema(nullable = true, example = "RED") Color color
) {}
