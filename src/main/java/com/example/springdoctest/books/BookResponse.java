package com.example.springdoctest.books;

import io.swagger.v3.oas.annotations.media.Schema;

public class BookResponse {
  @Schema(name = "name", description = "xxxx")
  private String id;

  public BookResponse(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
}
