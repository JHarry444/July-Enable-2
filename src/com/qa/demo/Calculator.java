package com.qa.demo;

public class Calculator {
	static final int add = 1;
	static final int subtract = 2;
	static final int multiply = 3;
	static final int divide = 4;
	static double result = 0;
	static boolean printResult = false;

	public static void main(String[] args) {
		showOperatorMenu();
		calculations();
		if (printResult)
			results();
	}

	private static void showOperatorMenu() {
		System.out.println("Choose an operator:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
	}

	private static void calculations() {
		int userChoice = Utils.getNumber(num -> num > 0 && num < 5, "Please enter a number from 1 -> 4");
		System.out.println("Enter your first number:");
		double numOne = Utils.getNumber();
		System.out.println("Enter your second number:");
		double numTwo = Utils.getNumber();

		switch (userChoice) {
		case add:
			result = add(numOne, numTwo);
			break;
		case subtract:
			result = subtract(numOne, numTwo);
			break;
		case multiply:
			result = multiply(numOne, numTwo);
			break;
		case divide:
			result = divide(numOne, numTwo);
			break;
		}
		printResult = true;

	}

	private static void results() {
		System.out.println("The result is: " + result);
	}

	private static double add(double a, double b) {
		return a + b;
	}

	private static double subtract(double a, double b) {
		return a - b;
	}

	private static double multiply(double a, double b) {
		return a * b;
	}

	private static double divide(double a, double b) {
		return a / b;
	}
}