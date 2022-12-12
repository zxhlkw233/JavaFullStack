package JavaEE.Proxy.Dynamic.DynamicProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StartProxy implements InvocationHandler {
    private Object target;



    public Object getProxy(Object target){
        this.target = target;
        return Proxy.newProxyInstance(Object.class.getClassLoader(),Object.class.getInterfaces(),this);
    }
//    private StartImpl startimpl;
//    public Object getProxy(StartImpl startimpl){
//        this.startimpl = startimpl;
//        return Proxy.newProxyInstance(StartImpl.class.getClassLoader(),StartImpl.class.getInterfaces(),this);
//    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置扩展");
        Object invoke = method.invoke(target);
        System.out.println("后置扩展");
        return invoke;
    }
}
