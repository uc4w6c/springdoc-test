package com.example.springdoctest.multipart;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("multipart")
public class MultipartController {
  @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  // @Operation(summary = "XX", requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Das zu erstellende Ticket", content = @Content(schema = @Schema(implementation = TicketDTO.class))))
  @Operation(summary = "XX")
  public TicketDTO createTicket(@RequestPart() @Parameter(required = true) TicketDTO ticket,
                         @Parameter(description = "Files to be uploaded", content = @Content(mediaType = MediaType.MULTIPART_FORM_DATA_VALUE)) @RequestPart(value = "files", required = false) MultipartFile[] files) {
    return ticket;
  }

  record TicketDTO(String id) {}
}
