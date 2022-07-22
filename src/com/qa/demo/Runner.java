package com.qa.demo;

import com.qa.conditionals.Conditonals;

public class Runner {

	public static void main(String[] args) {
		// START POINT FOR THE APPLICATION
		String s = "Hello!";
		String[] array = { "a", "b", "c" };
		System.out.println("Hello, World!");

		System.out.println(Conditonals.fizzBuzz(15));
		// END POINT FOR THE APPLICATION
	}

	public static int add(int a, int b) {
		return a + b;
	}
}
