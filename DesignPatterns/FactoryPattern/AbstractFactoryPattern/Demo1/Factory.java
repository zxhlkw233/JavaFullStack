package DesignPatterns.FactoryPattern.AbstractFactoryPattern.Demo1;

public interface Factory {
    Fridge createFridge();
    AirConditioner createAirConditioner();
    Fan createFan();
}
