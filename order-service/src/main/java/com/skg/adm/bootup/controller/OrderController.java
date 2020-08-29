package com.skg.adm.bootup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skg.adm.bootup.db.entity.Order;
import com.skg.adm.bootup.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping(value="/api/orders/{user}")
	public String saveOrder(@PathVariable("user") String user, @RequestBody Order order) {
		return orderService.saveOrderDetails(user, order);
	}
}
