package com.example.springdoctest;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("record")
@RestController
public class RecordObjectController {
  @GetMapping
  public String index(@ParameterObject RecordObjectRequest recordObjectRequest) {
    return recordObjectRequest.toString();
  }
}
