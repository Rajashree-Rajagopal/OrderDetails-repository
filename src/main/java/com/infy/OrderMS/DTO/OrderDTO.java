package com.infy.OrderMS.DTO;

import com.infy.OrderMS.entity.Order;

public class OrderDTO {
	private int orderId;
	private int buyerId;
	private int amount;
	private String address;
	private String status;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static OrderDTO valueOf(Order order) {
		
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setAmount(order.getAmount());
		orderDTO.setStatus(order.getStatus());
		orderDTO.setOrderId(order.getOrderId());
		orderDTO.setBuyerId(order.getBuyerId());
		orderDTO.setAddress(order.getAddress());
		return orderDTO;
	}
	public static Order createOrder(OrderDTO orderDTO) {
		Order order=new Order();
		order.setOrderId(orderDTO.getOrderId());
		order.setBuyerId(orderDTO.getBuyerId());
		order.setAmount(orderDTO.getAmount());
		order.setAddress(orderDTO.getAddress());
		order.setStatus(orderDTO.getStatus());
		return order;
	}

	

}
