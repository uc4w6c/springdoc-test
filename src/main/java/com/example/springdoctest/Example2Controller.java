package com.example.springdoctest;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example2")
public class Example2Controller {
  @ExceptionHandler(Exception.class)
  @Hidden
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ApiResponse(responseCode = "500", description = "ExceptionHandler in example2")
  public ErrorResponse customControllerException() {
    return new ErrorResponse("1", "example2");
  }

  public record ErrorResponse(String errorId, String message) {}

  @GetMapping("/500")
  @Operation(
      tags = "example2",
      summary = "Example2 method",
      description = "This method is an example2"
  )
  public void test() {
    throw new RuntimeException();
  }
}
