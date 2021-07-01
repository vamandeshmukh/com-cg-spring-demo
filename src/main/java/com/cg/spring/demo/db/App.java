package com.cg.spring.demo.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import com.cg.spring.demo.db.service.EmployeeService;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

@ComponentScan
public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);

		EmployeeService service = ctx.getBean(EmployeeService.class);
		System.out.println(service.getEmployeebyId(101).toString());

		((AbstractApplicationContext) ctx).close();

		System.out.println("End");
	}
}
