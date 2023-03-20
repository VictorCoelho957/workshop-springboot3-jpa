package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID (2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	//CONSTRUTOR DO TI´P ENUM
	
	private int code;
	private OrderStatus(int code) {
		this.code= code;
	}
	
	//metodo publico para acessar o codigo anterior
	public int getCode() {
		return code;
	}
	
	//metedo para transformar valor numerico para inumerado
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode()==code) {
				return value;
			}
		}
		throw new IllegalArgumentException("invalid OrderStatus code");


	   }
	}
