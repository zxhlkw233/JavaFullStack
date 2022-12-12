package JavaEE.Proxy.Dynamic.DynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        UsbSell factory = new UsbFactory();
        InvocationHandler handler = new UsbSellProxy(factory);
        UsbSell proxy= (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);
        float price = proxy.sell(3);
        System.out.println("通过动态代理对象调用方法：" + price);
    }
}
