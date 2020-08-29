package com.skg.adm.bootup.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skg.adm.bootup.services.PriceService;

@RestController
public class PriceController {
	@Autowired
	PriceService priceService;
	
	

	@GetMapping(value="/api/price/{productId}")
	public double getProductPrice(@PathVariable("productId") int productId) throws URISyntaxException {
		return priceService.getPriceDetails(productId);
	}
	
	@GetMapping(value="/test")
	public String getTestProduct() throws URISyntaxException {
		return priceService.getTestDetails();
	}
}
