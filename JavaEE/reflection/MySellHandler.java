package JavaEE.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: TSCCG
 * @Date: 2021/09/03 16:43
 * 必须实现代理类要做的功能
 * 1.调用目标类方法
 * 2.增强功能
 */
public class MySellHandler implements InvocationHandler {
    //代表目标对象
    private Object target = null;

    public MySellHandler(Object target) {
        //给目标对象赋值
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //1.执行目标类方法
        Object result = null;
        result = method.invoke(target,args);
        //2.增强功能,在目标类方法调用后，所做的其他功能都是增强功能
        if (result != null) {
            Float price = (Float)result;
            price += 25;
            result = price;
        }
        System.out.println("商家，增强服务：优惠券");
        //3.返回增强的价格
        return result;
    }
}
