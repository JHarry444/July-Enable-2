package com.qa.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.qa.objects.person.Person;
import com.qa.objects.pets.Cat;
import com.qa.objects.pets.Dog;
import com.qa.objects.pets.Pet;

public class Runner {

	public static void main(String[] args) {
		Person.latinName = "Homo Sapien";
		final Person p = new Person("Barry", 35, "Plumber");
		p.setName("Gary");
		System.out.println(p.latinName);
		final Person p2 = new Person("Larry", 35, "Plumber");

		System.out.println(p2.latinName);

		final Person p3 = new Person("Harry", 35, "Plumber");

		System.out.println(p3.latinName);

		Cage kennel = new Cage(new Dog("Rex", "Shepherd", 12, "Brown", true));

		Cage carrier = new Cage(new Cat("Tiddles", "Shorthair", 6, "White"));

		carrier.setPet(kennel.getPet());

		Pet pet = kennel.getPet();
		if (pet instanceof Dog) {
			((Dog) pet).fetch();
		}

		GenericCage<Dog> genericKennel = new GenericCage<>(new Dog("Rex", "Shepherd", 12, "Brown", true));

		GenericCage<Cat> genericCarrier = new GenericCage<>(new Cat("Tiddles", "Shorthair", 6, "White"));

//		genericCarrier.setPet(new Dog());

		genericKennel.getPet().fetch();

		List<Flyable> flyers = new LinkedList<>();

		flyers.add(new Parrot());
		flyers.add(new Plane(3, 300));

		for (Flyable f : flyers)
			f.fly();

		List<Person> people = new ArrayList<>();

		people.add(new Person("Jordan", 28, "Trainer"));
		people.add(new Person("Chris", 26, "Trainer"));
		people.add(new Person("Piers", 25, "Trainer"));

		Person found = people.get(2);

		System.out.println("UNSORTED: " + people);

		Collections.sort(people);

		System.out.println("SORTED: " + people);
	}
}
