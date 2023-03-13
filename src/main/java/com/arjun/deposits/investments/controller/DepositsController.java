package com.arjun.deposits.investments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositsController {
	
	@GetMapping
	public String getSomething() {
		return "return something from deposits controller";
	}

}
