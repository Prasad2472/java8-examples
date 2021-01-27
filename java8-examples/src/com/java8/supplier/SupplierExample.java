package com.java8.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		/**
		 * Interface Supplier<T> 
		 * Type Parameters: 
		 * T - the type of results supplied by
		 * this supplier
		 */
		//Supplier<ArrayList<Integer>> supplier = ArrayList::new;
		//Supplier<List<Employee>> empSupplier = ArrayList<Employee>::new;
		
		Supplier<Double> randomNumber = Math::random;
		System.out.println("randomNumber:"+randomNumber.get());
		
		Supplier<LocalDate> local = LocalDate::now;
		local = () -> LocalDate.now();
		
		System.out.println("LocalDateTime:"+local.get());
	}

}
