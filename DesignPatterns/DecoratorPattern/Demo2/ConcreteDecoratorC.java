package DesignPatterns.DecoratorPattern.Demo2;

class ConcreteDecoratorC extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("带个假发吧，噗，终于像个人了");
    }

}