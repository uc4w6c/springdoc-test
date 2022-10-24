package com.example.springdoctest.exceptionhandler;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("exception1")
public class ExceptionController1 {
  @GetMapping
  public String index() {
    throw new ExampleException();
  }

  @ExceptionHandler(ExampleException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ApiResponse(responseCode = "400", description = "bad request")
  public String customControllerException() {
    return "exception1";
  }
}
