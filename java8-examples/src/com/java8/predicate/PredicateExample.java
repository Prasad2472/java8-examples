package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.employee.Employee;

public class PredicateExample {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(101L, "Sriyansh", "Boini", 1),
				new Employee(102L, "Srihith", "Boini", 4), new Employee(103L, "Prasad", "Boini", 32),
				new Employee(104L, "Abhi", "Boini", 26));

		Predicate<Employee> firstNamePredicate = employee -> "Sriyansh".equals(employee.getFirstName());
		Predicate<Employee> lastNamePredicate = employee -> "Boini".equals(employee.getLastName());
		List<Employee> filterList = employees.stream().filter(firstNamePredicate).collect(Collectors.toList());
		System.out.println("firstNamePredicate:" + filterList);

		filterList = employees.stream().filter(firstNamePredicate.and(lastNamePredicate)).collect(Collectors.toList());
		System.out.println("firstNamePredicate and lastNamePredicate:" + filterList);

		filterList = employees.stream().filter(firstNamePredicate.or(lastNamePredicate)).collect(Collectors.toList());
		System.out.println("firstNamePredicate or lastNamePredicate:" + filterList);
		EmployeePredicate employeePredicate = new EmployeePredicate();

		filterList = employees.stream().filter(employeePredicate).collect(Collectors.toList());
		System.out.println("EmployeePredicate: " + filterList);

	}

}
