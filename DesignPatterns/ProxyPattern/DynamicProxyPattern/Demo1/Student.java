package DesignPatterns.ProxyPattern.DynamicProxyPattern.Demo1;

public class Student implements Person{
    private String name;
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }

    public void wakeup() {
        System.out.println("学生"+name+"早晨醒来啦");
    }

    public void sleep() {
        System.out.println("学生"+name+"晚上睡觉啦");
    }
}
