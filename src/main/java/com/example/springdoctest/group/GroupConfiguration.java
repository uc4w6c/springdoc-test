package com.example.springdoctest.group;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** グループを試す */
// @Configuration
public class GroupConfiguration {
  // @Bean
  public GroupedOpenApi petOpenApi() {
    String paths[] = {"/books/**"};
    return GroupedOpenApi.builder()
        .group("books")
        .pathsToMatch(paths)
        .build();
  }

  // @Bean
  public GroupedOpenApi exampleOpenApi() {
    return GroupedOpenApi.builder()
        .group("example")
        .packagesToScan("com.example")
        .pathsToMatch("/example/**")
        .build();
  }
}
