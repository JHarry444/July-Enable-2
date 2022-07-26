package com.qa.objects.pets;

public class Cat extends Pet {

	public Cat() {
		super();
	}

	public Cat(String name, String breed, int age, String colour) {
		super(name, breed, age, colour);
	}

	public Cat(String name, String breed) {
		super(name, breed);
	}

	@Override
	public void makeNoise() {
		System.out.println("ME0W");
	}

	public void kill() {
		System.out.println("MURDERS");
	}
}
