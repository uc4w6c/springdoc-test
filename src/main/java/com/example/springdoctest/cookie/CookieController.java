package com.example.springdoctest.cookie;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("cookie")
public class CookieController {
  @GetMapping
  @ApiResponse(responseCode = "200", description = "example response")
  public String index(
      @CookieValue(name = "test", required = false) Optional<String> test,
      @RequestParam(name = "aa") String aa) {
    System.out.println(test);
    return "Hello";
  }
}
