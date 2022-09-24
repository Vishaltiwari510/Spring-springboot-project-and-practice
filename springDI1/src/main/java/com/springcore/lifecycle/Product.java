package com.springcore.lifecycle;

public class Product {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property");
		this.price = price;
	}
	
public Product() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Product [price=" + price + "]";
}

public void init() {
	System.out.println("Inside init method");
}

public void destroy() {
	System.out.println("Inside destroy method");
}


}
