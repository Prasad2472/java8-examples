package com.java8.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java8.employee.Employee;

public class FunctionExample {

	public static void main(String[] args) {

		/**
		 * Interface Function<T,R> 
		 * Type Parameters: T - the type of the input to the
		 * function 
		 * R - the type of the result of the function
		 */
		
		final Function<String, String> upperCase = s -> s.toUpperCase();

		System.out.println("Convert to Upper case: " + upperCase.apply("hello world"));
		Function<String, Integer> length = s -> s.length();
		System.out.println("Count String Length: " + length.apply("hello"));

		Function<Integer, Integer> multiply = number -> number * 2;

		System.out.println("Number Multiply by 2:" + multiply.apply(5));

		List<Employee> employees = Arrays.asList(new Employee(101L, "Sriyansh", "Boini", 1),
				new Employee(102L, "Srihith", "Boini", 4));
		// Now Convert List of Employees to Map where key is the Employee Id
		// Works but better to use Stream API
		Function<List<Employee>, Map<Long, Employee>> convertToMap = emp -> {
			Map<Long, Employee> map = new HashMap<Long, Employee>();
			for (Employee employee : emp) {
				map.put(employee.getId(), employee);
			}
			return map;
		};
		System.out.println("Converting List to map:" + convertToMap.apply(employees));
		Map<Long, Employee> streamApiUsage = employees.stream().collect(Collectors.toMap(Employee::getId, employee -> employee));
		System.out.println("Converting List to map:" + streamApiUsage);

	}

}
