package DesignPatterns.DecoratorPattern.Demo2;

public class DecoratorClient {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        ConcreteDecoratorC concreteDecoratorC = new ConcreteDecoratorC();

        /**
         * 这里模拟画一幅画，从最开始的什么都没有，到最后的成为一副完美的画
         * 多态：编译看父类，执行看子类
         */
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorC.setComponent(concreteDecoratorB);
        concreteDecoratorC.operation();
    }

}
