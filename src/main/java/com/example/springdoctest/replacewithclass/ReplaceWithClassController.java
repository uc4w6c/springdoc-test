package com.example.springdoctest.replacewithclass;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springdoc.core.SpringDocUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2226
 */
@RestController
@RequestMapping("replaceWithClass")
public class ReplaceWithClassController {
  static {
    SpringDocUtils.getConfig().replaceWithClass(ReplaceWithClass.class, String.class);
  }

  @GetMapping
  public ReplaceWithClassResponse getSchemaResponse() {
    return null;
  }

  @Schema(description = "Demo response object")
  record ReplaceWithClassResponse(
      @Schema(description = "Local schema description (replaceWithClass)")
      ReplaceWithClass replaceWithClass,
      @Schema(description = "Local schema description (\'type\' override)", type = "string")
      TypeOverride typeOverride
  ) {}

  @Schema(description = "Class-level schema: ReplaceWithClass")
  record ReplaceWithClass(String str) {}

  @Schema(description = "Class-level schema: TypeOverride")
  record TypeOverride(String str) {}
}
