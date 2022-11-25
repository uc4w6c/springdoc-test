package com.example.springdoctest.addschema;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/add/schema")
public class AddSchemaController {
  @ApiResponses({
      @ApiResponse(responseCode = "200", description = "xxxxx", content = {
          @Content(
              mediaType = "application/json",
              schema = @Schema(ref = "#/components/schemas/Response")
          )
      })
  })
  @GetMapping
  public ResponseEntity<Object> index() {
    return null;
  }
}
