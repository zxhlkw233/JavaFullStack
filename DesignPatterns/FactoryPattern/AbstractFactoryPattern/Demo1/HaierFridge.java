package DesignPatterns.FactoryPattern.AbstractFactoryPattern.Demo1;

public class HaierFridge implements Fridge{
    @Override
    public void fridgeInfo() {
        System.out.println("海尔冰箱");
    }
}
