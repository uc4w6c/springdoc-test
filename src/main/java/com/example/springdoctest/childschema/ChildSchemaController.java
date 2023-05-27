package com.example.springdoctest.childschema;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2238
 */
@RestController
@RequestMapping("child/schema")
public class ChildSchemaController {
  @GetMapping
  public ParentDto index() {
    return null;
  }

  record ParentDto(
      @Schema(title = "parent1 title")
      ChildDto childDto1,
      @Schema(title = "parent2 title")
      ChildDto childDto2
  ) {}

  // @Schema(title = "child title", description = "child description")
  record ChildDto(String name) {}
}
