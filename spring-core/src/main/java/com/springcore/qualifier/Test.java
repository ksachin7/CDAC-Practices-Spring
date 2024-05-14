package com.springcore.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/qualifier/qualifier_config.xml");
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
	}
}
