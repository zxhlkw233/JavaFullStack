package DesignPatterns.SingletonPattern;

public class DoubleCheckTheLock {

    //私有实例，volatile关键字，禁止指令重排
    private volatile static DoubleCheckTheLock instance;

    //私有构造
    private DoubleCheckTheLock(){}

    //公共获取实例方法(线程安全)
    public static DoubleCheckTheLock getInstance(){
        if(instance == null){ //一重检查
            synchronized (DoubleCheckTheLock.class){
                if(instance == null){ //二重检查
                    instance = new DoubleCheckTheLock();
                }
            }
        }
        return instance;
    }
}
