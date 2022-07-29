package day5.maps;

import java.util.HashMap;
import java.util.Map.Entry;

import com.qa.objects.person.Person;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, Person> people = new HashMap<>();

		people.put(4494, new Person("Jordan", 28, "Trainer"));
		people.put(12, new Person("Chris", 26, "Trainer"));
//		people.put(4494, null);
		System.out.println(people);

		System.out.println(people.get(4494));

		System.out.println(people.keySet());
		System.out.println(people.entrySet());

		for (Entry<Integer, Person> entry : people.entrySet()) {
			System.out.println("KEY: " + entry.getKey());
			System.out.println("VALUE: " + entry.getValue());
		}

		HashMap<Person, Integer> reversePeople = new HashMap<>();

		reversePeople.put(new Person("Ed", 25, "Trainer"), 300);
		reversePeople.put(new Person("Ed", 25, "Trainer"), 265);
		System.out.println("Reversed: " + reversePeople);

		people.entrySet().forEach(entry -> System.out.println(entry));
		people.entrySet().forEach(System.out::println);
	}

}
