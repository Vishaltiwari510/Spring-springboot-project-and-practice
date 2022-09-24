package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
@Autowired
@Qualifier("address1")
private Address address;

public Address getAddress() {
	return address;
}

//@Autowired
public void setAddress(Address address) {
	System.out.println("setter method called");
	this.address = address;
}

public Employee() {
	// TODO Auto-generated constructor stub
}

//@Autowired
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
