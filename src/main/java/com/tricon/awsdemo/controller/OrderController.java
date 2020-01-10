package com.tricon.awsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.awsdemo.service.IOrder;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private IOrder orderService;

	@PostMapping("/filter_ids")
	public List<Long> filterOrderIds(@RequestBody List<Long> orderIds) {
		return orderService.filterOrderIds(orderIds);
	}
}
