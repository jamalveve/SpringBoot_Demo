package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContrllerClass {

	@GetMapping("/value")
	public String method() {
		return "Hello world";
	}
}
