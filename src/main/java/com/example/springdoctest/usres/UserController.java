package com.example.springdoctest.usres;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/** https://stackoverflow.com/questions/74403948/springdoc-openapi-how-to-display-an-list-of-object-class-as-a-response/74410256#74410256 */
@RestController
@RequestMapping(value = "/uiapi/user")
@Tag(name = "users", description = "description Info") // swagger
public class UserController {
  @Operation(summary = "user login")
  @ApiResponses({
      @ApiResponse(responseCode = "200", description = "xxxxx", content = {
          @Content(
              mediaType = "application/json",
              schema = @Schema(ref = "#/components/schemas/MapSchemaXXX")
          )
      }),
      @ApiResponse(responseCode = "400", description = "data error", content = {
          @Content()
      })
  })
  @PostMapping("/login")
  public ResponseEntity<Object> login(HttpServletRequest request) {
    return null;
  }
}
