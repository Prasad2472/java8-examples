package com.java8.employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtil {

	public static List<Employee> createEmployees() {
		return Arrays.asList(new Employee(101L, "Srihith", "B", 4, 100000.00, "IT"),
				new Employee(102L, "Sriyansh", "Sri", 1, 200000.00, "IT"),
				new Employee(103L, "Prasad", "Boini", 32, 400000.00, "Real Esatete"),
				new Employee(104L, "Shrinath", "Bittu", 7, 500000.00, "Finance"),
				new Employee(105L, "Nakshatra", "Binnu", 6, 300000.00, "HR"));
	}

}
