package com.qa.demo;

import java.util.Scanner;

import com.qa.conditionals.Conditonals;

public class Runner {

	public static void main(String[] args) {
		// START POINT FOR THE APPLICATION
		String s = "Hello!";
		String[] array = { "a", "b", "c" };
		System.out.println("Hello, World!");

		System.out.println(Conditonals.fizzBuzz(15));

		Scanner scan = new Scanner(System.in);

//		scan.close();

//		scan = new Scanner(System.in);

		System.out.println("Gimme a number:");
		Integer input = null;
		do {
			try {

				input = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException nfe) {
				System.out.println("NaN");
			}
		} while (input == null);
		System.out.println("Your number: " + input);
		// END POINT FOR THE APPLICATION
	}

	public static int add(int a, int b) {
		return a + b;
	}
}
