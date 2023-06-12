package com.example.springdoctest.jacksonaccessors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2254
 */
@RestController
@RequestMapping("jackson/accessors")
public class JacksonAccessorsController {
  @GetMapping()
  public Result hello() {
    var result = new Result();
    result.name = "aa";
    result.setTimestamp(System.currentTimeMillis());
    return result;
  }

  @Accessors(chain = true)
  @Data
  public static class Result {

    @JsonIgnore
    private Long timestamp;
    private String name;

    @JsonIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Long getTimestamp() {
      return timestamp;
    }
  }
}
