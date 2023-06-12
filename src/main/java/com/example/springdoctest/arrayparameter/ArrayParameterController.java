package com.example.springdoctest.arrayparameter;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2252
 */
@RestController
@RequestMapping("array/parameter")
public class ArrayParameterController {
  @GetMapping("normal")
  public String index(@RequestParam("columns") List<String> columns) {
    System.out.println(columns);
    return "hello";
  }

  @GetMapping("object")
  public String object(@ParameterObject @ModelAttribute ObjectRequest request) {
    System.out.println(request);
    return "hello";
  }

  public record ObjectRequest(
      List<String> columns,
      PagerOrder orders
  ) {}

  public record PagerOrder(
      @Parameter(schema = @Schema(type = "string"))
      String column,

      @Parameter(schema = @Schema(type = "boolean", defaultValue = "true"))
      boolean asc
  ) {}
}
