package com.learncicd.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {

@GetMapping("/greet")
String greetUser() {
	return "Hello bro";
}

}
