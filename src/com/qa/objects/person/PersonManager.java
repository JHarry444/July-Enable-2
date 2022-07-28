package com.qa.objects.person;

import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> people = new ArrayList<>();

	public void addPerson(Person p) {
		this.people.add(p);
	}

	public Person findPerson(String name) throws PersonNotFoundException {
		for (Person p : this.people) {
			if (p.getName().equalsIgnoreCase(name))
				return p;
		}
		throw new PersonNotFoundException("Person not found with name " + name);
	}

	public void printAll() {
		for (Person p : this.people)
			p.print();
	}
}
