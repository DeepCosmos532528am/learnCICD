package com.learncicd.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {

@GetMapping("/greet")
String greetUser(@RequestParam String name) {
	return "Hello bro "+ name +" ! How are you??? What is up there??" ;
}

}
