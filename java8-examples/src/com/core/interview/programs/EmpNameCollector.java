package com.core.interview.programs;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.employee.Employee;
import com.java8.employee.EmployeeUtil;

public class EmpNameCollector {

	public static void main(final String[] args) {

		final List<Employee> employees = EmployeeUtil.createEmployees();
		/**
		 * Collect The Employee names Whose salary is >= 300000.00
		 */
		final List<String> employeNames = employees.parallelStream().filter(emp -> emp.getSalary() >= 300000.00)
				.map(emp -> emp.getFirstName()).collect(Collectors.toList());

		System.out.println(employees);
		System.out.println(employeNames);
	}
}
