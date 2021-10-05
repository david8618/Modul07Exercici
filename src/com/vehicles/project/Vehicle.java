package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected int id; //variable per identificar els vehicles registrats
	private static int COUNTER_VEHICLES = 1;
	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();
	protected Titular titularVehicle;
	protected List<Persona> conductors = new ArrayList<Persona>();

	public Vehicle(String plate, String brand, String color)  {
		this.plate = plate;
		this.brand = brand;
		this.color = color;

		id=COUNTER_VEHICLES;
		COUNTER_VEHICLES++;
	}

	public String getPlate() {return plate;}

	public String getBrand() {return brand;}

	public String getColor() {return color;}

	public Titular getTitularVehicle() {return titularVehicle;}

	public abstract void addTitular(Titular titularnou) throws Exception;


}
