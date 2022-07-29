package com.qa.demo;

import java.util.Scanner;

import com.qa.ngou.Validator;

public class Utils {

	private static Scanner scan = new Scanner(System.in);

	public static Integer getNumber() {
		return getNumber(null, null);
	}

	public static Integer getNumber(Validator<Integer> validator, String msg) {
		Integer input = null;

		do {
			try {
				input = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter a valid number:");
			}

			if (validator != null && !validator.isValid(input)) {
				input = null;
				System.out.println(msg);
			}
		} while (input == null);

		return input;
	}

}
