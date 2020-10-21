package com.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/first")
public class MyfirstController {
	
	@GetMapping
	public String returnValue() {
		return "hi, welcome to your first springboot app";
		
	}

}
