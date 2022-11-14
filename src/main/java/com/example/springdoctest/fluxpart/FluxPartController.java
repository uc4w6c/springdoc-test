package com.example.springdoctest.fluxpart;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;

/** https://stackoverflow.com/questions/74404175/how-to-add-button-for-file-upload-in-swagger-ui-spring-doc-which-accepts-flux/74432093#74432093 */
@RestController
@RequestMapping("/flux/part")
public class FluxPartController {
  @PostMapping(produces = "application/hal+json", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  @ResponseStatus(code = HttpStatus.CREATED)
  public Mono<ResponseEntity<String>> upload(
      // @RequestPart(name = "file") FilePart data
      // Schemaでいけた
      @Schema(type = "string", format = "binary") @RequestBody Flux<ByteBuffer> data) {
    return null;
  }

  @Operation(summary = "Parse Resume")
  @PostMapping(value = "/parse-resume", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
      MediaType.MULTIPART_FORM_DATA_VALUE })
  @ApiResponses({ @ApiResponse(responseCode = "400", description = "Invalid input") })
  public Mono<String> parse(
      // @RequestPart(name = "resumeFile") @Parameter(schema = @Schema(type = "array", format = "binary"), description = "Resume file to be parsed", content = @Content(mediaType = MediaType.APPLICATION_OCTET_STREAM_VALUE)) FilePart resumeFile) {
      @RequestPart(name = "resumeFile") @Schema(type = "string", format = "binary") FilePart resumeFile) {
    return null;
  }
}
