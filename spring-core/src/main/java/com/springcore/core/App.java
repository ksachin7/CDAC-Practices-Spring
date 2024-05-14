package com.springcore.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("App is running fine!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/core/coreConfig.xml");
		Student stud = (Student) context.getBean("student");
		System.out.println(stud);
	}
}
