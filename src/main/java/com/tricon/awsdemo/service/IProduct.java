package com.tricon.awsdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IProduct {

	List<Long> filterProductIds(List<Long> productIds);

}
