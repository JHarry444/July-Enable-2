package com.qa.demo;

public enum Operator {

	ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");

	private String value;

	private Operator(String value) {
		this.value = value;
	}
}
