package com.example.springdoctest.enummanual;

import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enum/manual")
public class EnumManualController {
	@GetMapping
	public String index(@RequestParam(name = "recordType") @Schema(allowableValues = {"BILL", "LAW" }) RecordType recordType) {
		System.out.println(recordType);
		return null;
	}
}
