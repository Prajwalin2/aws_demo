package com.tricon.awsdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tricon.awsdemo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAllByIdIn(List<Long> productIds);

}
