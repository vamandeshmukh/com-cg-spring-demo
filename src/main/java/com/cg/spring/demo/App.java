package com.cg.spring.demo;

import org.springframework.context.ApplicationContext;
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
		Employee emp = context.getBean(Employee.class);
		emp.work();
		System.out.println(emp.ename);

		System.out.println("End");
	}
}
