package com.example.springdoctest.exceptionhandler;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("exception2")
public class ExceptionController2 {
  @GetMapping
  public Map<String, String> index() {
    throw new ExampleException();
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ApiResponse(responseCode = "500", description = "bad request")
  public String customControllerException() {
    return "exception2";
  }
}
