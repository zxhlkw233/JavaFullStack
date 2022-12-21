package JavaEE.Proxy.Dynamic.DynamicProxy3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RenterInvocationHandler <T> implements InvocationHandler {

    private T target;

    public RenterInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //代理过程中插入其他操作
        System.out.println("租客和中介交流");
        Object result = method.invoke(target,args);
        return result;


    }
}
