package com.qa.objects.pets;

public class Runner {

	public static void main(String[] args) {
		Dog d1 = new Dog("Rex", "Corgie", 6, "Brown", true);
		Cat c1 = new Cat("Tiddles", "Siamese", 6, "Pink");

		java.util.ArrayList<Pet> pets = new java.util.ArrayList<>();

		pets.add(d1);
		pets.add(c1);

		for (Pet p : pets) {
			if (p instanceof Dog) {
				Dog d = (Dog) p;
				d.fetch();
			}
			p.print();
			p.makeNoise();
		}

		// basically this:
		Pet p1 = new Dog("Rex", "Corgie", 6, "Brown", true);
		Pet p2 = new Cat("Tiddles", "Siamese", 6, "Pink");

		System.out.println(p1.getClass().getSimpleName());
		System.out.println(p2.getClass().getSimpleName());

	}

}
