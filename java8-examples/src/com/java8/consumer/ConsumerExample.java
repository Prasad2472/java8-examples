package com.java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.java8.employee.Employee;

public class ConsumerExample {

	public static void main(String[] args) {
		/**
		 * @FunctionalInterface public interface Consumer<T> Represents an operation
		 *                      that accepts a single input argument and returns no
		 *                      result. Unlike most other functional interfaces,
		 *                      Consumer is expected to operate via side-effects. This
		 *                      is a functional interface whose functional method is
		 *                      accept(Object).
		 */

		List<Employee> employees = Arrays.asList(new Employee(101L, "Sriyansh", "Boini", 1),
				new Employee(102L, "Srihith", "Boini", 4), new Employee(103L, "Prasad", "Boini", 32),
				new Employee(104L, "Abhi", "Boini", 26));

		Consumer<Employee> empConsumer = emp -> {
			emp.setFirstName(emp.getFirstName().toUpperCase());
		};
		employees.stream().forEach(empConsumer.andThen(System.out :: println));
	}

}
