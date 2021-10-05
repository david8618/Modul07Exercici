package com.vehicles.project;

public class Wheel {

	protected int id; //variable id per identificar les rodes
	private String brand;
	private double diameter;
	protected static int COUNTER_WHEEL=1;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
		id=COUNTER_WHEEL;
		COUNTER_WHEEL++;
	}

	@Override
	public String toString() {
		return "brand: '" + brand + '\'' +
				", diameter: " + diameter +
				"\n";
	}
}
