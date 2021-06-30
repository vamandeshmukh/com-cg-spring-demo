package com.cg.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Start");

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Employee emp = context.getBean("employee", Employee.class);
		emp.work();
		System.out.println(emp.getEname());

		Employee emp2 = context.getBean("employee2", Employee.class);
		emp2.work();
		System.out.println(emp2.getEname());

		System.out.println("End");
		((AbstractApplicationContext) context).close();
	}
}
