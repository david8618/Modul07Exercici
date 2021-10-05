package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {super(plate, brand, color);}

	@Override
	public void addTitular(Titular titularnou) throws Exception {

	}

	public void addWheelsBike(List<Wheel> frontWheel, List<Wheel> backWheel) throws Exception {
		addWheelBike(frontWheel);
		addWheelBike(backWheel);
	}

	public void addWheelBike(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)
			throw new Exception();

		Wheel wheel = wheels.get(0);

		this.wheels.add(wheel);
	}



	@Override
	public String toString() {
		return "Bike ------------- " +
				"\nplate: " + plate + '\'' +
				"\nbrand: " + brand + '\'' +
				"\ncolor: " + color + '\'' +
				"\nwheels\n" + wheels +
				'}';
	}
}
