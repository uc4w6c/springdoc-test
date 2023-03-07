package com.example.springdoctest.enumeprecated;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2101
 */
@RestController
@RequestMapping("enum/deprecated")
public class EnumDeprecatedController {
  @GetMapping
  public MyClass testEndpoint() {
    return null;
  }

  @Schema(enumAsRef = true)
  public enum TestEnum {
    VAL1, VAL2
  }

  public record MyClass(
      TestEnum field1,
      @Deprecated TestEnum field2
  ) {
  }
}
