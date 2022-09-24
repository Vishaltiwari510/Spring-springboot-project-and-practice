package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/collection/ccconfig.xml");
     Employee emp = (Employee) context.getBean("emp");
     System.out.println(emp.getName());
     System.out.println(emp.getAddresses());
     System.out.println(emp.getCourses());
     System.out.println(emp.getPhones());
	}

}
