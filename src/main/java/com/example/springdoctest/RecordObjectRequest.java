package com.example.springdoctest;

import io.swagger.v3.oas.annotations.Parameter;

public record RecordObjectRequest(
    // @Parameter(name = "id")
    String id,
    // @Parameter(name = "name")
    String name) {
}
