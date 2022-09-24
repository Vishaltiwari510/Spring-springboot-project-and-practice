package com.springcore.auto.wire;

public class Employee {
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Employee() {
	// TODO Auto-generated constructor stub
}


public Employee(Address address) {
	super();
	this.address = address;
	System.out.println("inside constructor");
}

@Override
public String toString() {
	return "Employee [address=" + address + "]";
}


}
