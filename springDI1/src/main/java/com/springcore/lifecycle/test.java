package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
	AbstractApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/lifecycle/prodconfig.xml");
    Product product = (Product) context.getBean("product");
    System.out.println(product);
    
    //registering shutdown hook to destroy method functionality
    context.registerShutdownHook();
	}

}
