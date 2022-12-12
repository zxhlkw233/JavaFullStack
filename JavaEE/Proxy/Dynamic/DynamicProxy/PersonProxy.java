package JavaEE.Proxy.Dynamic.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/*
*
* */
public class PersonProxy {
    public static Person getProxy(PersonImpl obj){
        return (Person) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                method.invoke(obj,null);
                System.out.println("是否会输出这行的代理中的语句");

                return obj;
            }
        });
    }
}
