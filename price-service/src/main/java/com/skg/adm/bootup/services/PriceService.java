package com.skg.adm.bootup.services;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dto.Product;

@Service
public class PriceService {

	public double getPriceDetails(int productId) throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://localhost:8081/api/products/"+productId;
	    URI uri = new URI(baseUrl);
		ResponseEntity<Product> result =  restTemplate.getForEntity(uri, Product.class);
		
		if(200==result.getStatusCodeValue()) {
			return result.getBody().getPrice();
		}else {
			return 0;
		}
	}
}
