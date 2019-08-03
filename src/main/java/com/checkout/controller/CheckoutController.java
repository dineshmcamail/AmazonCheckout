package com.checkout.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.checkout.bean.Order;
import com.checkout.service.CheckoutService;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {
	
	public static final Logger logger = LoggerFactory.getLogger(CheckoutController.class);
	
	@Autowired
	private CheckoutService checkoutService;
	
	
	@GetMapping(value = "/getCarts/{userId}")
	ResponseEntity<String> getCarts(@PathVariable("userId") int userId) throws IOException {
		logger.info("Entering into getCart contoller method()"+userId); 
		String URL="D:\\\\Users\\pdineshmcamail\\ECommerce\\AmazonCheckout\\Cart.txt";
		List<String> reqInfo = checkoutService.FetchCarts(URL);
		logger.info("Exiting from getCart contoller method()"+reqInfo);
		return new ResponseEntity<String>(reqInfo.toString(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/orderService")
	ResponseEntity<Integer> postOrder(@RequestBody Order order) {
		logger.info("Entering into postOrder contoller method()"); 
		
		int orderId = checkoutService.saveOrder(order);
		logger.info("Exiting from postOrder contoller method()"+orderId);
		return new ResponseEntity<Integer>(orderId, HttpStatus.OK);
	}

}
