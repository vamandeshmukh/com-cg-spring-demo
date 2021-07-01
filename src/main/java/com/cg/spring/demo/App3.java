package com.cg.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

// Annotation based Spring configuration 

@ComponentScan
public class App3 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App3.class);

		Customer cust1 = context.getBean(Customer.class);
		cust1.buy();

		((AbstractApplicationContext) context).close();

	}

}
