package com.example.springdoctest.books;

import com.example.springdoctest.usres.RaoGroupDTO;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("books")
@Validated
@Tag(name = "book")
public class BookController {
  @GetMapping
  public @ArraySchema(minItems = 1, arraySchema = @Schema(implementation = RaoGroupDTO.class), uniqueItems = true) List<BookResponse> getAll() {
    return Collections.emptyList();
  }
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
