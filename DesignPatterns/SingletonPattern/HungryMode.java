package DesignPatterns.SingletonPattern;

public class HungryMode {
    //私有实例，类初始化就加载
    private static HungryMode instance = new HungryMode();

    //私有构造方法
    private HungryMode(){}

    //公共的，静态的获取实例方法
    public static HungryMode getInstance(){
        return instance;
    }

}
