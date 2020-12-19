package com.company.devices;

public class Disel extends Car {
    public Disel(Integer yearOfProduction, String producer, String model, String color, Double value) {
        super(yearOfProduction, producer, model, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("tankujemy diesel");
    }
}
