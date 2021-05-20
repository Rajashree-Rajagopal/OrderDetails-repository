package com.infy.OrderMS.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.OrderMS.DTO.OrderDTO;
import com.infy.OrderMS.service.OrderService;


@RestController
@CrossOrigin
public class OrderController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	OrderService orderService;
	@GetMapping(value = "/order/{orderId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderDTO getorderDetails(@PathVariable int orderId){

		logger.info("Orders placed by the users {}", orderId);

		return orderService.getOrderDetails(orderId);
	}
	@PostMapping(value = "/order/placeOrder", consumes = MediaType.APPLICATION_JSON_VALUE) 
	  public ResponseEntity<String> placeorders(@RequestBody OrderDTO orderDTO) { 
		 logger.info("Orders placed successfully", orderDTO);
		 return new ResponseEntity<>( orderService.placeOrders(orderDTO),HttpStatus.CREATED); 
		 }

}
