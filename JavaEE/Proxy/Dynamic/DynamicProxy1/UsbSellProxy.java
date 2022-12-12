package JavaEE.Proxy.Dynamic.DynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UsbSellProxy implements InvocationHandler {
    private Object target = null;

    public UsbSellProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        res = method.invoke(target,args);
        if(res != null){
            float price = (float) res;
            res = (price + 25) * Float.parseFloat(args[0].toString());
        }
        return res;
    }
}
