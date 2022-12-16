package DesignPatterns.SingletonPattern;

public class LazyMode_ThreadSafe {
    //私有实例，初始化的时候不加载(延迟加载)
    private static LazyMode_ThreadSafe instance;

    //私有构造
    private LazyMode_ThreadSafe(){}

    //公共获取实例方法(线程安全，调用效率低)
    public synchronized static LazyMode_ThreadSafe getInstance(){
        if(instance == null){
            instance = new LazyMode_ThreadSafe();
        }
        return instance;
    }
}
