package com.qa.conditionals;

public class Iteration {

	public static void doWhile() {
		do {

		} while (false);
	}

	public static void main(String[] args) {
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.println(nums[i]);
		}

		for (int j = 0; j < nums.length; j++) {
			nums[j] *= 10;
			System.out.println(nums[j]);
		}
	}
}
