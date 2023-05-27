package com.example.springdoctest.sameendopoint;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2238
 */
@RestController
@RequestMapping("same/endpoint/hello")
public class HelloController {
  @GetMapping
  public Response index(Request request) {
    return null;
  }

  record Request(@Schema(requiredMode = Schema.RequiredMode.REQUIRED) Optional<String> id) {}

  record Response(@Schema(requiredMode = Schema.RequiredMode.AUTO) Optional<String> id) {}
}
