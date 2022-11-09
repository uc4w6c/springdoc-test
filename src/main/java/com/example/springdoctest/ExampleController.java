package com.example.springdoctest;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class ExampleController {
  @ExceptionHandler(Exception.class)
  @Hidden
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ApiResponse(responseCode = "500", description = "ExceptionHandler in example")
  public String customControllerException() {
    return "example";
  }

  @GetMapping("/500")
  @Operation(
      tags = {"example"},
      summary = "Example method",
      description = "This method is an example"
  )
  public void test() {
    throw new RuntimeException();
  }
}
