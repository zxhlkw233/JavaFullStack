package DesignPatterns.SingletonPattern;

public class LazyMode_ThreadUnsafe {

    //私有实例，初始化的时候不加载(延迟加载) 线程不安全
    private static LazyMode_ThreadUnsafe instance;

    //私有构造
    private LazyMode_ThreadUnsafe(){}

    //公共获取实例方法(线程不安全)
    public static LazyMode_ThreadUnsafe getInstance(){
        if (instance == null){ //使用的时候加载
            instance = new LazyMode_ThreadUnsafe();
        }
        return instance;
    }


}
