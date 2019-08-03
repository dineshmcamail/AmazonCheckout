package com.checkout.controller;

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.checkout.service.CheckoutService;

public class CheckoutControllerTest {
	
	@Autowired
	private CheckoutService checkoutService;
	
	@Test
	public void getCartsTest() throws IOException {
		//List<String> productList = checkoutServiceTest.FetchCartsTest();
		//assert.equals(10, 10);
	}

}
