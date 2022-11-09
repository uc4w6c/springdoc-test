package com.example.springdoctest;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionAdviceHandler {
  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ExceptionHandler({ RuntimeException.class })
  @ApiResponse(responseCode = "404", description = "example response", content = @Content)
  @ResponseBody
  public String handleError() {
    return "NotFound";
  }
}
