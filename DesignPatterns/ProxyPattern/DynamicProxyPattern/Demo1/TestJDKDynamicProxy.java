package DesignPatterns.ProxyPattern.DynamicProxyPattern.Demo1;

import java.lang.reflect.Proxy;

public class TestJDKDynamicProxy {
    public static void main(String[] args) {
        JDKDynamicProxy proxy = new JDKDynamicProxy(new Student("张三"));
        //创建代理实例
        Person student = (Person) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{Person.class}, proxy);
        student.wakeup();
        student.sleep();

        proxy = new JDKDynamicProxy(new Doctor("王教授"));
        Person doctor = (Person) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{Person.class}, proxy);
        doctor.wakeup();
        doctor.sleep();

    }
}
