package com.skg.adm.bootup.services;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.skg.adm.bootup.db.dbo.CartReository;
import com.skg.adm.bootup.db.entity.Cart;
import com.skg.adm.bootup.dto.CartDTO;
import com.skg.adm.bootup.dto.Product;


@Service
public class CartService {
	
	@Autowired
	CartReository cartReository;
	
	public double getItemDetails(int productId) throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://localhost:8081/api/price/"+productId;
	    URI uri = new URI(baseUrl);
		ResponseEntity<Double> result =  restTemplate.getForEntity(uri, Double.class);
		
		if(200==result.getStatusCodeValue()) {
			return result.getBody().doubleValue();
		}else {
			return 0;
		}
	}
	
	public CartDTO addItemToCart(String user, CartDTO cartDto) {
		
		Cart cart = new Cart();
		cart.setItem_id(cartDto.getItem().getId());
		cart.setQty(cartDto.getQty());
		cart.setUser(user);
		
		cartReository.save(cart);
		
		cartDto.getItem().setItamtotal(cartDto.getItem().getPrice()*cart.getQty());
		return cartDto;
	}

}
