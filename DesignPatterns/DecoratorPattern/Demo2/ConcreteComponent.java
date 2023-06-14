package DesignPatterns.DecoratorPattern.Demo2;


public class ConcreteComponent extends   Component {
    @Override
    public void operation() {
        System.out.println("最原始的模样什么都没有，啊好丑");
    }
}
