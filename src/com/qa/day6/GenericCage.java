package com.qa.day6;

import com.qa.objects.pets.Pet;

public class GenericCage<T extends Pet> {

	private T pet;

	public GenericCage(T pet) {
		super();
		this.pet = pet;
	}

	public T getPet() {
		return this.pet;
	}

	public void setPet(T pet) {
		this.pet = pet;
	}

}
