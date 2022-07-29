package com.qa.day6;

import com.qa.objects.pets.Pet;

public class Cage {

	private Pet pet;

	public Cage(Pet pet) {
		super();
		this.pet = pet;
	}

	public Pet getPet() {
		return this.pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

}
