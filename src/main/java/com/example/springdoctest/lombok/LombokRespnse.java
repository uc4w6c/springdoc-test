package com.example.springdoctest.lombok;

import java.util.List;
import java.util.Map;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class LombokRespnse {
	@Schema(type = "string" , example = "Validation Failed")
	private String message;

	/*@ArraySchema(schema = @Schema(implementation = Map.class), arraySchema = @Schema(
			example = "{\"lastName\": [ \"Second Name Should Not Be Null or Empty\" ], \"firstName\": [ \"First Name Should Not Be Null or Empty\"]}"))
	 */
	@ArraySchema(arraySchema = @Schema(
			example = "{\"lastName\": [ \"Second Name Should Not Be Null or Empty\" ], \"firstName\": [ \"First Name Should Not Be Null or Empty\"]}"))
	private Map<String, List<String>> failed_validation_attributes;
}
