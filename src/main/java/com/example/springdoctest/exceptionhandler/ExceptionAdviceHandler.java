package com.example.springdoctest.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/*
@ControllerAdvice(basePackages = "com.example.springdoctest.exceptionhandler")
@RestController
@RequestMapping("handler")
public class ExceptionAdviceHandler {

  @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
  @org.springframework.web.bind.annotation.ExceptionHandler({ HttpRequestMethodNotSupportedException.class })
  @ResponseBody
  public Map<String, Object> handleError() {
    Map<String, Object> errorMap = new HashMap<String, Object>();
    errorMap.put("message", "許可されていないメソッド");
    errorMap.put("status", HttpStatus.METHOD_NOT_ALLOWED);
    return errorMap;
  }

  @GetMapping
  public String index() {
    return "hello";
  }
}
 */
