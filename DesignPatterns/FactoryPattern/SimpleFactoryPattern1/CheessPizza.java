package DesignPatterns.FactoryPattern.SimpleFactoryPattern1;

public class CheessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给CheessPizza准备原材料");
    }
}