package com.qa.objects.garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void remove(int id) {
		for (Vehicle v : this.vehicles) {
			if (v.getId() == id) {
				this.vehicles.remove(v);
				return;
			}
		}
	}

	public void remove(String type) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : this.vehicles) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(v);
			}
		}
		this.vehicles.removeAll(toRemove);
	}

	public float calcBill() {
		float bill = 0;
		for (Vehicle v : this.vehicles)
			bill += v.calcBill();
		return bill;
	}

	public float calcBillOld() {
		float bill = 0.0f;

		for (Vehicle v : this.vehicles) {
			if (v instanceof Car) {
				bill += v.getNoOfWheels() * 10;
				bill += v.getEngineSize() * 30;
				bill += ((Car) v).getBootSize() * 25;
			}
		}

		return bill;
	}

	private int count = 1;

	public void addVehicle(Vehicle v) {
		v.setId(count++);
		this.vehicles.add(v);
	}

	public void removeVehicle(Vehicle v) {
		this.vehicles.remove(v);
	}

	public void clear() {
		this.vehicles.clear();
	}
}
