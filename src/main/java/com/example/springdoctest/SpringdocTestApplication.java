package com.example.springdoctest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		servers = {}
/*				@Server(
						url = "https://{profile}.example.com/",
						variables = {
								@ServerVariable(
										name = "profile",
										allowableValues = { "prd", "local" },
										defaultValue = "prd"
								)
						}
				)

 */
)
public class SpringdocTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdocTestApplication.class, args);
	}

}
