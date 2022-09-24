package com.springcore.lifecycleusingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
	AbstractApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/lifecycleusingAnnotation/deviceconfig.xml");
    Device device = (Device) context.getBean("device");
    System.out.println(device);
    
    //registering shutdown hook to destroy method functionality
    context.registerShutdownHook();
	}

}
