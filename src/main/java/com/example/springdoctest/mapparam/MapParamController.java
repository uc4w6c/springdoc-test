package com.example.springdoctest.mapparam;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/** https://github.com/springdoc/springdoc-openapi/issues/1947 */
@RestController
  @RequestMapping("mapparam")
public class MapParamController {
  @GetMapping("/id")
  @Parameter(name = "id1", schema = @Schema(type="string"), required = true)
  @Parameter(name = "id2", schema = @Schema(type="string"), required = true)
  public String searchById(@RequestParam(required = false) Map<String, String> idMap) {
    System.out.println(idMap);
    return "Hello";
  }
}
