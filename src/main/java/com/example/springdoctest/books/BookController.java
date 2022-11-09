package com.example.springdoctest.books;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("books")
@Validated
@Tag(name = "book")
public class BookController {
  @GetMapping("{id}")
  public String index(@PathVariable("id") @Valid @Positive String id) {
    System.out.println(id);
    return "hello";
  }

  @PostMapping
  public String create(@RequestBody BookRequest bookRequest) {
    System.out.println(bookRequest);
    return "OK";
  }
}
