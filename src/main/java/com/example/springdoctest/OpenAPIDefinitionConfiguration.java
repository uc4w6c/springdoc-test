package com.example.springdoctest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/*
https://stackoverflow.com/questions/73487536/spring-host-thats-generated-by-swagger-is-http-instead-of-https-set-host-ma/74299294#74299294

@Configuration
public class OpenAPIDefinitionConfiguration {
  @Component
  @Profile("prd")
  @OpenAPIDefinition(servers = @Server(url = "example.com"))
  public static class PrdOpenAPIDefinitionConfiguration {
  }

  @Component
  @Profile("local")
  @OpenAPIDefinition(servers = @Server(url = "local.example.com"))
  // @OpenAPIDefinition(servers = @Server(url = "/"))
  public static class LocalOpenAPIDefinitionConfiguration {
  }
}
*/
