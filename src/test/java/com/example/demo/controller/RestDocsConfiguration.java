package com.example.demo.controller;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;
import org.springframework.restdocs.operation.preprocess.Preprocessors;

import com.fasterxml.jackson.core.PrettyPrinter;

@TestConfiguration
public class RestDocsConfiguration {
	  @Bean
	  public RestDocumentationResultHandler write() {
	    return MockMvcRestDocumentation.document(
	        "{class-name}/{method-name}", // identifier
	        Preprocessors.preprocessRequest(Preprocessors.modifyUris().host("13.125.53.132").port(8082),Preprocessors.prettyPrint()),
	        Preprocessors.preprocessResponse(Preprocessors.prettyPrint())
	    );
	  }
	  
}
