package com.example.springdoctest.nopathvariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nopathvariable")
public class NoPathVariableController {
  @GetMapping("{id}")
  public String index(@PathVariable String id) {
    return id;
  }
}
