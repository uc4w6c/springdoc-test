package com.example.springdoctest.multiexamples;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("multi/examples")
public class MultiExampleController {
  @PostMapping("/test")
  @ApiResponses(
      value = {
          @ApiResponse(responseCode = "200",
              content= @Content(
                  mediaType = "application/json",
                  examples = {
                      @ExampleObject(
                          name = "An example request with the minimum required fields to create.",
                          value = "min",
                          summary = "Minimal request"),
                      @ExampleObject(
                          name = "An example request with all fields provided with example values.",
                          value = "full",
                          summary = "Full request") })),
          @ApiResponse(responseCode = "400",
              description = "BAD REQUEST",
              content= @Content(
                  mediaType = "application/json",
                  examples = {
                      @ExampleObject(
                         name="RoleNoMatch",
                          value="{\"code\":400,\"Message\":\"Permission and Role type doesn't match\"}"
                      )
                      ,@ExampleObject(
                          name="MustUUID",
                          value="{\"code\":400,\"Message\":\"Permission must be UUID value\"}"
                      )
                  }
              )),
      })
  @GetMapping
  User test() {
    return null;
  }

  @PostMapping("/test2")
  @RequestBody(
      description = "Details of the Item to be created",
      required = true,
      content = @Content(
          schema = @Schema(implementation = User.class),
          mediaType = MediaType.APPLICATION_JSON_VALUE,
          examples = {
              @ExampleObject(
                  name = "An example request with the minimum required fields to create.",
                  value = "min",
                  summary = "Minimal request"),
              @ExampleObject(
                  name = "An example request with all fields provided with example values.",
                  value = "full",
                  summary = "Full request") }))
  @GetMapping
  void test2(String hello) {
  }
}
