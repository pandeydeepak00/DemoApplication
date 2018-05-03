package com.example.demo;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {
		
		List<Client> clients  = Arrays.asList(
				new Client(1, "Deepak"),
				new Client(11, "Deepak"),
				new Client(121, "DDeepak"),
				new Client(1, "ADeepak"),
				new Client(1, "00Deepak")
				);
		Collections.sort(clients);
		System.out.println(clients);
		SpringApplication.run(ServiceApplication.class, args);
	}
}
