package com.skg.adm.bootup.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.skg.adm.bootup.db.dbo.OrderRepository;
import com.skg.adm.bootup.db.entity.Order;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	public String saveOrderDetails(String user, @RequestBody Order order) {
		
		order=orderRepository.save(order);
		if(Objects.nonNull(order.getOrder_id())) {
			return "Order Processed Succefully";
		}else {
			return "Order Decliened";
		}
	}
}
