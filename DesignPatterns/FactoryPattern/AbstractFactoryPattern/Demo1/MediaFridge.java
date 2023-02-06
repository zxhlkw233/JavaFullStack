package DesignPatterns.FactoryPattern.AbstractFactoryPattern.Demo1;

public class MediaFridge implements Fridge{
    @Override
    public void fridgeInfo() {
        System.out.println("美的冰箱");
    }
}
