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

		System.out.println("Create spring container object");
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		System.out.println("Property injection / Setter injection");
		Employee emp = context.getBean("employee", Employee.class);
		emp.work();
		System.out.println(emp.toString());

		Employee emp2 = context.getBean("employee2", Employee.class);
		System.out.println(emp2.toString());

		System.out.println("Constructor injection");
		Employee emp3 = context.getBean("employee3", Employee.class);
		System.out.println(emp3.toString());

		Employee emp4 = context.getBean("employee4", Employee.class);
		System.out.println(emp4.toString());

		System.out.println("Inner bean - using property injection ");
		Employee emp5 = context.getBean("employee5", Employee.class);
		System.out.println(emp5.toString());

		System.out.println("Inner bean - using constructor injection");
		Employee emp6 = context.getBean("employee6", Employee.class);
		System.out.println(emp6.toString());

		System.out.println("Collection injection - using property injection ");
		Department dept3 = context.getBean("department3", Department.class);
		System.out.println(dept3.toString());

		System.out.println("Collection injection in inner bean - using constructor injection ");
		Employee emp7 = context.getBean("employee7", Employee.class);
		System.out.println(emp7.toString());

		((AbstractApplicationContext) context).close();

		System.out.println("End");
	}
}
