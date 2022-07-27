package com.qa.objects.garage;

public abstract class Vehicle extends Object {

	private int noOfWheels;
	private int engineSize;

	private int id;

	public Vehicle(int noOfWheels, int engineSize) {
		super();
		this.noOfWheels = noOfWheels;
		this.engineSize = engineSize;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfWheels() {
		return this.noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getEngineSize() {
		return this.engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	protected abstract float calcBill();

}
