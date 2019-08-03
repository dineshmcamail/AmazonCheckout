package com.checkout.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
@Component
public class CheckoutService {
	
	public List<String> FetchCarts(String URL) throws IOException{
		Stream<String> fileContets = Files.lines(Paths.get(URL));
		return fileContets.map(x-> x.split(" ")[1]).collect(Collectors.toList());
	}
}
