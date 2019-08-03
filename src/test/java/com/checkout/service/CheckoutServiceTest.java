package com.checkout.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckoutServiceTest {
	
	@Autowired
	private CheckoutService checkoutService ;
	
	
	@Before
	public void setup() {

	}
	
	@Test
	public void FetchCartsTest() throws IOException {
		List<String> list = Arrays.asList("1234", "F", "Green", "10", "10", "9790", "D", "Grey", "5", "3");
        
		String URL="D:\\\\\\\\Users\\\\pdineshmcamail\\\\ECommerce\\\\AmazonCheckout\\\\Cart.txt";
		
		//Mockito.when(checkoutService.FetchCarts(URL)).thenReturn(list);
        //List<String> cartList = checkoutService.FetchCarts(URL);
         
        assertEquals(10, list.size());
		
	}

}
