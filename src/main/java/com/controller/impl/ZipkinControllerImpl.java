package com.controller.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.controller.ZipkinController;

/**
 * Zipkins REST controller interface.
 * 
 */
@Controller
public class ZipkinControllerImpl implements ZipkinController {

	/**
	 * Test Zipkin server.
	 *
	 * @return {@link List} of {@link Zipkin}
	 */
	@Override
	public ResponseEntity<String> retrieve() {

		String zipkinResponse;
		zipkinResponse = "Log - Zipkin Server";
		return new ResponseEntity<>(zipkinResponse, HttpStatus.OK);

	}

}
