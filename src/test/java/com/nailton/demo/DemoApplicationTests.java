package com.nailton.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	// Teste com WebFlux
	@Test
	void emptyList() throws Exception {
		this.webTestClient
				.get()
				.uri("/countries")
				.exchange()
				.expectStatus()
				.isOk();

	}

	// Teste com MockMvc

	/*
	@Autowired
	private MockMvc mockMvc;

	@Test
	void emptyList() throws Exception {

		final var request = mockMvc.perform(get("/countries"));

		request
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect((status().isOk()))
				.andExpect(content().string(containsString("[]")));
	}

	@Test
	void insertInformations() throws Exception {

		final var request = mockMvc.perform(get("/populate"));

		request
				.andExpect(status().isOk())
				.andExpect(content().string("Inserted Countries"));
	}*/

}
