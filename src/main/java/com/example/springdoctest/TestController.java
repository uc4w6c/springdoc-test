package com.example.springdoctest;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
  @GetMapping
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "example response")/*,
    @ApiResponse(responseCode = "404", description = "example response", content = @Content)*/
  })
  public String index() {
    return "Hello";
  }
}
