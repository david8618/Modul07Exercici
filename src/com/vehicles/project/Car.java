package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {super(plate, brand, color);}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
	@Override
	public void addTitular(Titular titularnou) throws Exception{
		if(titularnou==null) throw new Exception();
		if(!titularnou.getTipusllicencia().equalsIgnoreCase("CAR")) throw new Exception();
		if(!conductors.contains(titularnou)){
			conductors.add(titularnou);
			System.out.println("El titular també s'ha afegit a la llista de conductors.");
		}
		this.titularVehicle=titularnou;
	}



	public void addConductor(Conductor conductor) throws Exception{
		if(conductors.contains(conductor)){
			System.out.println("En conductor ja existeis y no es pote afegir al a llista.");
		} else{
			conductors.add(conductor);

		}

	}






	@Override
	public String toString() {
		return "Car " +
				"plate: " + plate +
				"\nbrand: " + brand +
				"\ncolor:" + color +
				"\nwheels:\n" + wheels +
				"\ntitular:\n" + titularVehicle;
	}

}
