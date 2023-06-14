package DesignPatterns.ProxyPattern.DynamicProxyPattern.Demo1;

public class Doctor implements Person {
    private String name;
    public Doctor() {
    }
    public Doctor(String name) {
        this.name = name;
    }
    public void wakeup() {
        System.out.println("医生"+name+"早晨醒来啦");
    }
    public void sleep() {
        System.out.println("医生"+name+"晚上睡觉啦");
    }
}
