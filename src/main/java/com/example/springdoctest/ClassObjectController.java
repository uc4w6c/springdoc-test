package com.example.springdoctest;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("class")
@RestController
public class ClassObjectController {
  @GetMapping
  public String index(@ParameterObject ClassObjectRequest classObjectRequest) {
    return classObjectRequest.toString();
  }
}
