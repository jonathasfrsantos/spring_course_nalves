package com.jfrsantos.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;                    // 1 criar um atributo code do tipo int
	
	private OrderStatus(int code) {        // 2 criar um construtor privado (caso especial) que recebe esse code do tipo int como parâmetro
		this.code = code;
	}
	
	public int getCode() {      // 3 criar um getter para esse code 
		return code;
	}
	
	public static OrderStatus valueOf(int code) {            // 4 percorrer toda a lista de OrderStatus para ver se o código corresponde ao índice de order status
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid order status code");
	}
	

}
