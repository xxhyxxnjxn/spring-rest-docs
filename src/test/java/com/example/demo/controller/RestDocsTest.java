package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(RestDocsTestController.class)
public class RestDocsTest extends AbstractRestDocsTest {
	@Test
	void RestDocsTest() throws Exception {
		mockMvc.perform(get("/restDocsTest")).andExpect(status().isOk());
	}

	@Test
	void RestDocsTest2() throws Exception {
		mockMvc.perform(get("/restDocsTest2")).andExpect(status().isOk());
	}
}
