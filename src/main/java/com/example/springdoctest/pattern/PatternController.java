package com.example.springdoctest.pattern;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.Explode;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.enums.ParameterStyle;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Optional;

/**
 * https://stackoverflow.com/questions/75552097/swagger3-pattern-operation-with-springboot3
 * おそらくswagger-ui側の問題
 */
@RestController
@RequestMapping("pattern")
public class PatternController {
  @Operation(
      tags = "Shop APIs",
      summary ="Find Shop detail",
      responses = {
          @ApiResponse(responseCode = "200", description = "successful operation",
              content = @Content(schema = @Schema(implementation = String.class)))
      },
      parameters = {
          @Parameter(in =  ParameterIn.QUERY, name = "id",required = true, style = ParameterStyle.DEFAULT,explode= Explode.FALSE,schema = @Schema(pattern = "^[a-zA-Z0-9]{5,15}$")),

      }
  )
  @GetMapping()
  public Flux<String> getDetail(final @RequestParam Optional<String> id){
    return null;
  }
}
