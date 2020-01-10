package com.tricon.awsdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IOrder {

	List<Long> filterOrderIds(List<Long> orderIds);

}
