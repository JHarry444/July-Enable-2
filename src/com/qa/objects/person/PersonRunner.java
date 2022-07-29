package com.qa.objects.person;

import java.util.Scanner;

public class PersonRunner {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in);) { // try-with-resources

			PersonManager manager = new PersonManager();
			Person p = new Person("Jordan", 28, "Trainer");
			manager.addPerson(p);
			manager.addPerson(new Person("Chris", 26, "Trainer"));
			manager.addPerson(new Person("Piers", 25, "Trainer"));

			manager.printAll();
			Person found = null;
			try {
				found = manager.findPerson("jordan");
			} catch (PersonNotFoundException pnfe) {
				System.out.println("wut");
			} catch (Exception e) {

			}
			found.print();
			System.out.println(found);

			Person p2 = new Person("Jordan", 28, "Trainer");
			System.out.println("p == p2: " + (p == p2));
			System.out.println("p.equals(p2): " + p.equals(p2));

			System.out.println("Jordan" == "Jordan");
			System.out.println("Dumb:" + ("JORDAN" == ("jordan".toUpperCase())));
			System.out.println(new String("Jordan") == new String("Jordan"));

			System.out.println("Jordan".equals("Jordan"));
			System.out.println(new String("Jordan").equals(new String("Jordan")));

		}
	}

}
