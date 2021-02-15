package com.java8.stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.java8.employee.Employee;
import com.java8.employee.EmployeeUtil;

public class StreamApiExample {

	public static void main(String[] args) {
		/**
		 * To perform a computation, stream operations are composed into a stream
		 * pipeline. A stream pipeline consists of a source (which might be an array, a
		 * collection, a generator function, an I/O channel, etc), zero or more
		 * intermediate operations (which transform a stream into another stream, such
		 * as filter(Predicate)), and a terminal operation (which produces a result or
		 * side-effect, such as count() or forEach(Consumer)). Streams are lazy;
		 * computation on the source data is only performed when the terminal operation
		 * is initiated, and source elements are consumed only as needed.
		 */

		/**
		 * Collections and streams, while bearing some superficial similarities, have
		 * different goals. Collections are primarily concerned with the efficient
		 * management of, and access to, their elements. By contrast, streams do not
		 * provide a means to directly access or manipulate their elements, and are
		 * instead concerned with declaratively describing their source and the
		 * computational operations which will be performed in aggregate on that source.
		 * However, if the provided stream operations do not offer the desired
		 * functionality, the BaseStream.iterator() and BaseStream.spliterator()
		 * operations can be used to perform a controlled traversal.
		 */
		/**
		 * A stream should be operated on (invoking an intermediate or terminal stream
		 * operation) only once. This rules out, for example, "forked" streams, where
		 * the same source feeds two or more pipelines, or multiple traversals of the
		 * same stream. A stream implementation may throw IllegalStateException if it
		 * detects that the stream is being reused. However, since some stream
		 * operations may return their receiver rather than a new stream object, it may
		 * not be possible to detect reuse in all cases.
		 */
		/**
		 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
		 */

		List<Employee> employees = EmployeeUtil.createEmployees();
		// Get the sum of  Salaries of the Employees
		double sumOfSalaries = employees.stream().mapToDouble(employee -> employee.getSalary()).sum();
		System.out.println("Sum Of Salaries :" + sumOfSalaries);
		// Get the maximum Salary of Employee
		OptionalDouble maxSalary = employees.stream().mapToDouble(emp -> emp.getSalary()).max();
		System.out.println("maxSalary:" + maxSalary.getAsDouble());
		//Streams Does not modify the source data, rather it creates new stream
		List<Employee> iTDepartmentEmployees = employees.stream().filter(emp -> "IT".equals(emp.getDepartment()))
				.collect(Collectors.toList());
		System.out.println("Original List:" + employees);
		System.out.println("iTDepartmentEmployees:" + iTDepartmentEmployees);
		
	}

}
