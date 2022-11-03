package com.example.springdoctest.books;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("books")
@Validated
public class BookController {
  @GetMapping("{id}")
  public String index(@PathVariable("id") @Valid @Positive String id) {
    System.out.println(id);
    return "hello";
  }
}
