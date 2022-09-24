package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
	AbstractApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/auto/wire/empconfig.xml");
    Employee emp1 = (Employee) context.getBean("emp1");
    System.out.println(emp1);
    
    //registering shutdown hook to destroy method functionality
   // context.registerShutdownHook();
	}

}
