package com.infy.OrderMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.OrderMS.entity.Order;
public interface OrderRepository extends JpaRepository<Order, Integer>{
	Order findByOrderId(int orderId);
}
