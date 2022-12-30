package JavaEE.Reflect;

import java.lang.reflect.Method;

public class Method_Invoke {
    public static void main(String[] args)  throws Exception {
        Class<?> a = Class.forName("A");
        Object o = a.newInstance();
        Method hello = a.getDeclaredMethod("hello", null);
        hello.invoke(o);
    }

}
class A{
    public void hello(){
        System.out.println("hello world");
    }
}