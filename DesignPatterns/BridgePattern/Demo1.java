package DesignPatterns.BridgePattern;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
//        RefinedCoffee largeWithMilk = new RefinedCoffee(new Milk());
    }
}

abstract class Coffee{
    protected ICoffeeAdditives additives;

    public Coffee(ICoffeeAdditives additives) {
        this.additives = additives;
    }

    public abstract void orderCoffee(int count);
}

abstract class RefinedCoffee extends Coffee{

    public RefinedCoffee(ICoffeeAdditives additives) {
        super(additives);
    }
    public void checkQuality(){
        Random ran = new Random();
        System.out.println(String.format("%s 添加%s",additives.getClass().getSimpleName(),ran.nextBoolean()?"太多":"正常"));
    }


}
interface ICoffeeAdditives{
    void addSomething();
}
class Milk implements ICoffeeAdditives{

    @Override
    public void addSomething() {
        System.out.println("加奶");
    }
}
class Sugar implements ICoffeeAdditives{

    @Override
    public void addSomething() {
        System.out.println("加糖");
    }
}
class LargeCoffee extends Coffee{

    public LargeCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public void orderCoffee(int count) {

    }
}