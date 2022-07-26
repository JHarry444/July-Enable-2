package com.qa.objects.pets;

public abstract class Pet extends Object {

	private String name;
	private String breed;
	private int age;
	private String colour;

	public Pet() {
		super();
	}

	public Pet(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public Pet(String name, String breed, int age, String colour) {
		super();
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

	public abstract void makeNoise();

	public void setAge(int age) {
		if (age > 0 && age < 20)
			this.age = age;
		else
			System.out.println("Invalid age: " + age);
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return this.breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
