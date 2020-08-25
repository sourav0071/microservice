package com.skg.adm.bootup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skg.adm.bootup.dto.CartDTO;
import com.skg.adm.bootup.services.CartService;

@RestController
public class CartController {
	
	@Autowired
	CartService cartService;

	@PostMapping(value="/api/cart/{user}")
	public CartDTO saveCartService(@PathVariable("user") String user, @RequestBody CartDTO cart) {
		return cartService.addItemToCart(user, cart);
	
	}
}
