package com.core.interview.programs;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlockTest {

	public static void main(String[] args) {

	}

	public static int test() {

		try {
			throwEx();
			System.out.println("TryBlock/...");
			return 1;
		} catch (IOException | ClassNotFoundException | ArrayIndexOutOfBoundsException e) {
			System.out.println("catch/...");
			return 2;
		} finally {
			System.out.println(" Hey Finally Block");
		}
	}

	public static void throwEx() throws FileNotFoundException, ClassNotFoundException {

	}

}
