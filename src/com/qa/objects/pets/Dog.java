package com.qa.objects.pets;

public class Dog extends Pet {

	private boolean kennel;

	public Dog() {
		super();
	}

	public Dog(boolean kennel) {
		super();
		this.kennel = kennel;
	}

	public Dog(String name, String breed, int age, String colour, boolean kennel) {
		super(name, breed, age, colour);
		this.kennel = kennel;
	}

	public Dog(String name, String breed, int age, String colour) {
		super(name, breed, age, colour);
	}

	public Dog(String name, String breed) {
		super(name, breed);
	}

	@Override
	public void makeNoise() {
		System.out.println("W00F");
	}

	public void fetch() {
		System.out.println("Good boi");
	}

	public boolean isKennel() {
		return this.kennel;
	}

	public void setKennel(boolean kennel) {
		this.kennel = kennel;
	}

}
