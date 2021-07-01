package com.cg.spring.demo.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.demo.db.model.Employee;
import com.cg.spring.demo.db.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public Employee getEmployeebyId(int eid) {

		repository.findById(eid);

		return null;

	}

}
