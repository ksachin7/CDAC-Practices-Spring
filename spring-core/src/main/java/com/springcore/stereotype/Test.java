package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
//		Student stud = context.getBean("student", Student.class);

		Student stud = context.getBean("stu", Student.class);
		System.out.println(stud);
		System.out.println(stud.getAddress());

		System.out.println("\nHashCode of stud: " + stud.hashCode());

//		as it creates singleton object hash-code would be the same but for prototype it will be different
		Student stud1 = context.getBean("stu", Student.class);
		System.out.println("HashCode of stud1: " + stud1.hashCode());

		System.out.println();

		System.out.println(stud.getClass());
//		System.out.println(stud.getClass().getName());
		System.out.println(stud.getClass().getGenericSuperclass());

//		Testing prototype from xml
		Teacher t1 = context.getBean("teacher", Teacher.class);
		Teacher t2 = context.getBean("teacher", Teacher.class);
		System.out.println("\nHashCode of teacher1: " + t1.hashCode());
		System.out.println("HashCode of teacher2: " + t2.hashCode());

	}
}
