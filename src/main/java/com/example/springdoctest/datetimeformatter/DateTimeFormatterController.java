package com.example.springdoctest.datetimeformatter;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.PatternProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2154
 */
@RestController
@RequestMapping("datetimeformatter")
public class DateTimeFormatterController {
  @GetMapping
  public DateTimeFormatterResponse index(
      @RequestParam("time")
      @DateTimeFormat(pattern = "HH:mm")
      @Schema(implementation = String.class, example = "12:00")
      LocalTime time) {
    System.out.println(time);
    return null;
  }

  @PostMapping
  public String create(@RequestBody DateTimeFormatterRequest request) {
    System.out.println(request);
    return null;
  }

  record DateTimeFormatterRequest(
      String id,
      @DateTimeFormat(pattern = "HH:mm")
      @JsonFormat(pattern = "HH:mm")
      LocalTime time) {}
}
