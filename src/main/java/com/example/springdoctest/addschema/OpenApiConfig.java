package com.example.springdoctest.addschema;

import com.example.springdoctest.usres.RaoGroupDTO;
import com.example.springdoctest.usres.UserPrincipalDTO;
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

/** https://stackoverflow.com/questions/74560649/how-to-program-to-create-a-map-schema-using-springdoc */
@Configuration
public class OpenApiConfig {
  @Bean
  public OpenAPI customOpenAPI() {
    MapSchema mySchema = new MapSchema();
    mySchema.setAdditionalProperties(new StringSchema());

    return new OpenAPI().components(new Components()
        .addSchemas("Response", mySchema)
    );
  }
}
