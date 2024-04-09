package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDocsTestController {
	  @GetMapping("/restDocsTest")
	  public String restDocsTestAPI() {
	    return "test!!";
	  }
	  
	  @GetMapping("/restDocsTest2")
	  public String restDocsTestAPI2() {
	    return "test2!!";
	  }
}
