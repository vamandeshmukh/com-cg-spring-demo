package com.cg.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

// Annotation based Spring configuration 

public class App3 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.toString());

		((AbstractApplicationContext) context).close();

	}

}
