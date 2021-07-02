package com.cg.spring.demo.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.demo.db.model.Employee;

@Repository

//public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
//public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// one method

	//	select * from spring_emp where ename = ???;

	public abstract List<Employee> findByEname(String ename);

}
