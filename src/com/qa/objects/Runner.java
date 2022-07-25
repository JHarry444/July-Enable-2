package com.qa.objects;

public class Runner {

	public static void main(String[] args) {
		int i = 27;
		Integer i2 = 46;

		Dog dog1 = new Dog();
		dog1.name = "Jamal";
		dog1.breed = "Bulldog";
		dog1.age = 12;
		dog1.colour = "White";
		dog1.print();

		Dog dog2 = new Dog();
		dog2.name = "Rex";
		dog2.breed = "German Shepherd";
		dog2.age = 6;
		dog2.colour = "Brown";
		dog2.print();

		Dog dog3 = makeDog("Woofy", "Doberman", 3, "Black");
		dog3.print();

		System.out.println(dog3);

		Dog dog4 = new Dog("Fido", "Dalmation", 12, "Black and white");
	}

	public static Dog makeDog(String name, String breed, int age, String colour) {
		Dog d = new Dog();
		d.name = name;
		d.breed = breed;
		d.age = age;
		d.colour = colour;
		return d;
	}

}
