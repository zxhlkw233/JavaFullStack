package DesignPatterns.FactoryPattern.AbstractFactoryPattern.Demo1;

public class MediaFactory implements Factory{
    @Override
    public Fridge createFridge() {
        return new MediaFridge();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new MedialAirConditioner();
    }

    @Override
    public Fan createFan() {
        return new MediaFan();
    }
}
