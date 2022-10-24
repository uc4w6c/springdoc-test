package com.example.springdoctest.exceptionhandler;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/*
@RestController
@RequestMapping("exception3")
public class ExceptionController3 {
  @GetMapping
  public String index() {
    throw new ExampleException();
  }

  @ExceptionHandler(ExampleException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ApiResponse(responseCode = "400", description = "bad request3")
  public String customControllerException() {
    return "exception3";
  }
}
 */
