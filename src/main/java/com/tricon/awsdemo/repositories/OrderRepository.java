package com.tricon.awsdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tricon.awsdemo.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findByIdIn(List<Long> orderIds);

}
