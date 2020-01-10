package com.tricon.awsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.awsdemo.service.IProduct;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private IProduct productService;

	@PostMapping("/filter_ids")
	public List<Long> filterProductIds(@RequestBody List<Long> productIds) {
		return productService.filterProductIds(productIds);
	}
}
