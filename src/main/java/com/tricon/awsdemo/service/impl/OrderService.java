package com.tricon.awsdemo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.awsdemo.entity.Order;
import com.tricon.awsdemo.repositories.OrderRepository;
import com.tricon.awsdemo.service.IOrder;

@Service
public class OrderService implements IOrder {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Long> filterOrderIds(List<Long> orderIds) {

		List<Order> orders = orderRepository.findByIdIn(orderIds);
		return orders.stream().map(Order::getId).collect(Collectors.toList());
	}

}
