package com.checkout.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {
	
	public static final Logger logger = LoggerFactory.getLogger(CheckoutController.class);
	
	@GetMapping(value = "/getUser/{cId}")
	public ResponseEntity<String> getCheckout(@PathVariable("cId") int cId) {
		logger.info("Fetching with id {}"+cId);
		return new ResponseEntity<String>("You are Good to Go!", HttpStatus.OK);
	}

}
