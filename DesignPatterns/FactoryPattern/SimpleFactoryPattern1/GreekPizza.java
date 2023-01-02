package DesignPatterns.FactoryPattern.SimpleFactoryPattern1;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给GreekPizza准备原材料");
    }
}
