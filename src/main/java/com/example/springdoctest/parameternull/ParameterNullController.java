package com.example.springdoctest.parameternull;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paramnull")
public class ParameterNullController {
  @GetMapping
  public String index(@ParameterObject ParamNullRequest paramNullRequest, @RequestParam("aa") Long group) {
    return paramNullRequest.toString();
  }

  public class ParamNullRequest {
    private String name;
    private ParamNullGroup group;

    public ParamNullRequest(String name, ParamNullGroup group) {
      this.name = name;
      this.group = group;
    }

    public String getName() {
      return name;
    }

    public ParamNullGroup getGroup() {
      return group;
    }
  }

  public enum ParamNullGroup {
    ONE,
    TWO
  }
}
