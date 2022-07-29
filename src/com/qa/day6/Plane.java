package com.qa.day6;

import com.qa.objects.garage.Vehicle;

public class Plane extends Vehicle implements Flyable {

	public Plane(int noOfWheels, int engineSize) {
		super(noOfWheels, engineSize);
	}

	@Override
	protected float calcBill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void fly() {
		System.out.println("VR00M");
	}

}
