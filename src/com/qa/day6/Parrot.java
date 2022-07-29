package com.qa.day6;

import com.qa.objects.pets.Pet;

public class Parrot extends Pet implements Flyable {

	@Override
	public void makeNoise() {
		System.out.println("PIECES O' EIGHT!");
	}

	@Override
	public void fly() {
		System.out.println("Flap flap");
	}

}
