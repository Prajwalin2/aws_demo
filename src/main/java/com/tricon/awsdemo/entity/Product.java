package com.tricon.awsdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "product_id")
	private Long id;

	@Column(name = "customer_id")
	private Long customerId;
}
