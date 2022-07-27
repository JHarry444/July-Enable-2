package com.qa.objects.garage;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();

		garage.addVehicle(new Car(4, 500, 400));
		garage.addVehicle(new Bike(2, 50, false));

		garage.calcBill();

		garage.remove(1);
		garage.remove("bike");
	}

}
