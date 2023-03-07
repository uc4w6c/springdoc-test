package com.example.springdoctest.headerparam;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://stackoverflow.com/questions/75573903/migrate-datatype-and-paramtype-got-springdoc
 */
@RestController
@RequestMapping("header/param")
public class HeaderParamController {
  @GetMapping
  public String index(@Parameter(name = "token", required = true) @RequestHeader("token") String header) {
    return header;
  }
}
