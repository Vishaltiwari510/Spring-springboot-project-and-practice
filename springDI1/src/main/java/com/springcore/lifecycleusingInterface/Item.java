package com.springcore.lifecycleusingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Item implements InitializingBean, DisposableBean{
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
public Item() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Item [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	// init
	System.out.println("taking item");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	//destroy
	System.out.println("going to put item at home");
}


}
