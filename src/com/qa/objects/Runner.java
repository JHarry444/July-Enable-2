package com.qa.objects;

import com.qa.objects.pets.Dog;

public class Runner {

	public static void main(String[] args) {
		int i = 27;
		Integer i2 = 46;

		Dog dog1 = new Dog();
//		dog1.name = "Jamal";
//		dog1.breed = "Bulldog";
//		dog1.age = 12;
//		dog1.colour = "White";
		dog1.print();

		Dog dog2 = new Dog();
//		dog2.name = "Rex";
//		dog2.breed = "German Shepherd";
//		dog2.age = 6;
//		dog2.colour = "Brown";
//		dog2.print();

		Dog dog5 = new Dog("Barry", "Bulldog", 6, "Brown");
//		dog5.age = Integer.MAX_VALUE; can't access as it is now private
		dog5.setAge(Integer.MAX_VALUE);
		dog5.print();
	}

}
