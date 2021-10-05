package com.vehicles.project;

import java.util.List;

public class Truck extends Vehicle{

    public Truck(String plate, String brand, String color) {
        super(plate, brand, color);
    }

    @Override
    public void addTitular(Titular titularnou) throws Exception {

    }

    //public Truck(String plate, String brand, String color) {super(plate, brand, color);}

    public void addWheelsTruck(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
        addTwoWheelsTruck(frontWheels);
        addTwoWheelsTruck(backWheels);
    }

    public void addTwoWheelsTruck(List<Wheel> wheels) throws Exception {
        if (wheels.size() != 2)
            throw new Exception();

        Wheel rightWheel = wheels.get(0);
        Wheel leftWheel = wheels.get(1);

        if (!rightWheel.equals(leftWheel))
            throw new Exception();

        this.wheels.add(leftWheel);
        this.wheels.add(rightWheel);
    }
}
