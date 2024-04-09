package com.example.demo.controller;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.restdocs.request.RequestDocumentation;

@WebMvcTest(RestDocsTestController.class)
public class RestDocsTest extends AbstractRestDocsTest {
	@Test
	void RestDocsTest() throws Exception {
		mockMvc.perform(get("/restDocsTest")).andExpect(status().isOk());
	}

	@Test
	void RestDocsTestById() throws Exception {
		mockMvc.perform(RestDocumentationRequestBuilders.get("/restDocsTest/{id}","test"))
		.andDo(print())
		.andExpect(status().isOk())
		.andDo(document("restDocsTest-get",
				RequestDocumentation.pathParameters(
						RequestDocumentation.parameterWithName("id").description("test id")
				)
			));
	}

	@Test
	void RestDocsTest2() throws Exception {
		mockMvc.perform(get("/restDocsTest2")).andExpect(status().isOk());
	}
}
