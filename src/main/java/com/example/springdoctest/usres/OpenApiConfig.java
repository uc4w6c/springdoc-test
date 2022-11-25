package com.example.springdoctest.usres;

import io.swagger.v3.core.converter.AnnotatedType;
import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.core.converter.ResolvedSchema;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.MapSchema;
import io.swagger.v3.oas.models.media.NumberSchema;
import io.swagger.v3.oas.models.media.StringSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration
public class OpenApiConfig {
  // @Bean
  public OpenAPI initOpenAPI() {
    OpenAPI openApi = new OpenAPI();
    openApi.info(
        new Info()
            .title("title....")
            .description("description .........")
            .version("v0.1")
    );

    MapSchema mapSchema = new MapSchema();
    ResolvedSchema resolvedSchema = ModelConverters.getInstance()
        .resolveAsResolvedSchema(new AnnotatedType(UserPrincipalDTO.class));

    // add
    ResolvedSchema raoGroupDtoSchema = ModelConverters.getInstance()
        .resolveAsResolvedSchema(new AnnotatedType(RaoGroupDTO.class));
    resolvedSchema.schema
        .addProperty("raoGroup", new ArraySchema().items(raoGroupDtoSchema.schema));

    mapSchema.addProperty("result", new NumberSchema());
    mapSchema.addProperty("resultMessage", new StringSchema());
    mapSchema.addProperty("data", resolvedSchema.schema);

    openApi.components(new Components().addSchemas("MapSchemaXXX", mapSchema));

    return openApi;
  }
}
