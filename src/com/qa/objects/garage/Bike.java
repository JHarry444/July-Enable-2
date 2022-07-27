package com.qa.objects.garage;

public class Bike extends Vehicle {

	private boolean sideCar;

	public Bike(int noOfWheels, int engineSize, boolean sideCar) {
		super(noOfWheels, engineSize);
		this.sideCar = sideCar;
	}

	public boolean isSideCar() {
		return this.sideCar;
	}

	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}

	@Override
	protected float calcBill() {
		float bill = 0;
		bill += this.getNoOfWheels() * 10;
		bill += this.getEngineSize() * 30;
		if (this.sideCar)
			bill += 50;
		return bill;
	}

}
