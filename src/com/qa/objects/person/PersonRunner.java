package com.qa.objects.person;

public class PersonRunner {

	public static void main(String[] args) {

		PersonManager manager = new PersonManager();
		Person p = new Person("Jordan", 28, "Trainer");
		manager.addPerson(p);
		manager.addPerson(new Person("Chris", 26, "Trainer"));
		manager.addPerson(new Person("Piers", 25, "Trainer"));

		manager.printAll();
		Person found = manager.findPerson("jordan");
		found.print();
	}

}
