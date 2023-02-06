package DesignPatterns.FactoryPattern.AbstractFactoryPattern.Demo1;

public class HaierFactory implements Factory{
    @Override
    public Fridge createFridge() {
        return new HaierFridge();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new HaierAirConditioner();
    }

    @Override
    public Fan createFan() {
        return new HaierFan();
    }
}
