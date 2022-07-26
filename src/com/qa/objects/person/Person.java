package com.qa.objects.person;

public class Person {

	String name;
	int age;
	String jobTitle;

	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public Person() {
	}

	public void print() {
		System.out.println("Hello! My name is " + name);
		System.out.println("I am " + this.age + " years old!");
		System.out.println("And I am a " + jobTitle);
	}
}