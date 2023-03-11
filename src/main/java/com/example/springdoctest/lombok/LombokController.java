package com.example.springdoctest.lombok;

import java.util.Collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lombok")
public class LombokController {
	@GetMapping
	public LombokRespnse index() {
		return new LombokRespnse("", Collections.emptyMap());
	}
}
