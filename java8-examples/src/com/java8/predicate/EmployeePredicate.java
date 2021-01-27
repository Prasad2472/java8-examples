package com.java8.predicate;

import java.util.function.Predicate;

import com.java8.employee.Employee;

public class EmployeePredicate implements Predicate<Employee> {

	@Override
	public boolean test(Employee employee) {
		return employee.getId() > 101;
	}

}
