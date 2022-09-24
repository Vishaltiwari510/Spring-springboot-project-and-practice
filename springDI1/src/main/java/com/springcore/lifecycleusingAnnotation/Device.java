package com.springcore.lifecycleusingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Device {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Device() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Device [name=" + name + "]";
	}
	
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
	
	
}
