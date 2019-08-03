package com.checkout.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.checkout.bean.Order;
import com.checkout.controller.CheckoutController;
@Component
public class CheckoutService {
	
	public static final Logger logger = LoggerFactory.getLogger(CheckoutController.class);
	
	public List<String> FetchCarts(String URL) throws IOException{
		logger.info("Entering into FetchCarts service method()");
		Stream<String> fileContets = Files.lines(Paths.get(URL));
		logger.info("Exiting from FetchCarts service method()");
		return fileContets.map(x-> x.split(" ")[1]).collect(Collectors.toList());
		
	}
	
	
	public int saveOrder(Order order) {
		logger.info("Entering into saveOrder service method()"+order.getCartId());
		
		
		logger.info("Order Created Successfully");
		return 9090;
	}
}
