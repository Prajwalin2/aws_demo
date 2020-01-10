package com.tricon.awsdemo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.awsdemo.entity.Product;
import com.tricon.awsdemo.repositories.ProductRepository;
import com.tricon.awsdemo.service.IProduct;

@Service
public class ProductService implements IProduct {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Long> filterProductIds(List<Long> productIds) {

		List<Product> products = productRepository.findAllByIdIn(productIds);
		return products.stream().map(Product::getId).collect(Collectors.toList());
	}

}
