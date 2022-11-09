package com.example.springdoctest;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

public record RecordObjectRequest(
    // @Parameter(name = "id")
    String id,
    // @Parameter(name = "name")
    String name,
    int age) {
}
