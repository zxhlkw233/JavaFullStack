package DesignPatterns.FactoryPattern.AbstractFactoryPattern.Demo1;

public class Test {
    public static void main(String[] args) {
        Factory factory = new MediaFactory();
        Fan fan = factory.createFan();
        Fridge fridge = factory.createFridge();
        AirConditioner airConditioner = factory.createAirConditioner();
        airConditioner.airConditionerInfo();
        fan.fanInfo();
        fridge.fridgeInfo();

        Factory f = new HaierFactory();
        AirConditioner airConditioner1 = f.createAirConditioner();
        Fan fan1 = f.createFan();
        Fridge fridge1 = f.createFridge();
        airConditioner1.airConditionerInfo();
        fan1.fanInfo();
        fridge1.fridgeInfo();


    }
}
