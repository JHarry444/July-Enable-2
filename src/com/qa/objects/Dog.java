package com.qa.objects;

public class Dog {

	// instance variables
	String name = "Woofy";
	String breed;
	int age;
	String colour;

	public Dog() {
	}

	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public Dog(String name, String breed, int age, String colour) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
	}

	public void print() {
		System.out.println("Hello! My name is " + name);
		System.out.println("I am " + this.age + " years old!");
		System.out.println("And I am a " + colour + " " + breed);
	}
}
