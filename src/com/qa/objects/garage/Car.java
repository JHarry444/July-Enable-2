package com.qa.objects.garage;

public class Car extends Vehicle {

	private int bootSize;

	public Car(int noOfWheels, int engineSize, int bootSize) {
		super(noOfWheels, engineSize);
		this.bootSize = bootSize;
	}

	public int getBootSize() {
		return this.bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}

	@Override
	protected float calcBill() {
		float bill = 0;
		bill += this.getNoOfWheels() * 10;
		bill += this.getEngineSize() * 30;
		bill += this.getBootSize() * 25;
		return bill;
	}

}
