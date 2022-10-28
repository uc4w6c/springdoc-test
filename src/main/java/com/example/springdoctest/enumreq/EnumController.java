package com.example.springdoctest.enumreq;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("enum")
public class EnumController {
  @GetMapping
  // public String index(@Nullable @Schema(nullable = true, example = "RED") Color color) {
  public String index(EnumRequest request) {
    System.out.println(request.color()); // null
    return "Hello";
  }

  @PostMapping
  public String post(@Parameter(description = "Request object", required = true)
                       @RequestBody EnumClassRequest request) {
    System.out.println(request.getColor());
    return "Hello";
  }
}
