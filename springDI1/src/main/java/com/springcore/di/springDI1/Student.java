package com.springcore.di.springDI1;

public class Student {

	private int id;
	private String name;
	String  address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		System.err.println("setting student id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.err.println("setting student name");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.err.println("setting student address");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	
	
}
