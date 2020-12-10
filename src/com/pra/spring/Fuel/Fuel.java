package com.pra.spring.Fuel;

public class Fuel {

	private String type;
	private double price;
	private double quantity;

	public Fuel() {

		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	public String brun() {
		String burn = "NO";
		if (this.quantity > 0) {
			System.out.println("The fuel is burning");
			burn = "YES";
		} else
			System.out.println("The fuel is Empty");
		return burn;

	}
	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



}
