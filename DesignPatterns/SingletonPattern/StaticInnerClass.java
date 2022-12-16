package DesignPatterns.SingletonPattern;

public class StaticInnerClass {

    //静态内部类
    private static class InnerClass{
        private final static StaticInnerClass instance = new StaticInnerClass();
    }

    //私有构造
    private StaticInnerClass(){}

    //公共获取实例方法(线程安全，延迟加载)
    public static StaticInnerClass getInstance(){
        return InnerClass.instance;
    }
}
