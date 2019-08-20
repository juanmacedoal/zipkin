package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * Starts the service.
 * 
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinApplication {
	/**
	 * Run service.
	 *
	 * @param args
	 *            {@link String}[]
	 */
	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}

}
