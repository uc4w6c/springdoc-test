package com.example.springdoctest.longnumber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2174
 * ブラウザの問題っぽい
 */
@RestController
@RequestMapping("longnumber")
public class LongNumberController {
  @GetMapping
  public TestResponse index() {
    return new TestResponse(55555456454545455L);
  }

  record TestResponse(long num) {}
}
