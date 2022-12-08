package JavaEE.reflection;

import java.lang.reflect.Proxy;

/**
 * @Author: TSCCG
 * @Date: 2021/09/03 17:04
 * 使用Proxy类的静态方法创建代理对象
 */
public class Test {
    public static void main(String[] args) {
        //1.创建目标对象
        PhoneSell factory = new PhoneFactory();
        //2.创建InvocationHandler接口实现类对象，传入目标对象
        MySellHandler handler = new MySellHandler(factory);
        //3.创建代理对象
        PhoneSell proxy = (PhoneSell)Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),handler);
        //4.通过代理对象执行目标方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象调用方法：" + price);
    }

}
