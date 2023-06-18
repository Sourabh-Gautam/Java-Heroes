package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaMappingOneToManyApplication implements CommandLineRunner {
	
	@Autowired
	private ShopService shopService;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaMappingOneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		shopService.deleteShop(1);
		
		shopService.getShopName(1);
		
	}
	
}
