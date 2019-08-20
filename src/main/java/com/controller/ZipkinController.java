package com.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Zipkins REST controller implementation.
 * 
 */
public interface ZipkinController {

	/**
	 * Test Log.
	 *
	 * @return {@link List} of {@link Zipkin}
	 */
	@GetMapping(value = "/test", produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE})
	ResponseEntity<String> retrieve();

}
