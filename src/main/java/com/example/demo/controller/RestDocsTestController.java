package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDocsTestController {
	  @GetMapping("/restDocsTest")
	  public String restDocsTestAPI() {
	    return "test!!";
	  }

	  @GetMapping("/restDocsTest/{id}")
	  public String restDocsTestAPIById(@PathVariable("id") String id) {
	    return id;
	  }

	  @GetMapping("/restDocsTest2")
	  public String restDocsTestAPI2() {
	    return "test2!!";
	  }
}
