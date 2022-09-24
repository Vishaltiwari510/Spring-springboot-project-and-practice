package com.springcore.lifecycleusingInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
	AbstractApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/lifecycleusingInterface/itemconfig.xml");
    Item item = (Item) context.getBean("item");
    System.out.println(item);
    
    //registering shutdown hook to destroy method functionality
    context.registerShutdownHook();
	}

}
