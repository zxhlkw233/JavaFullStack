package JavaEE.Proxy.Dynamic.DynamicProxy2;

public class StartImpl implements Start{

    @Override
    public void sleep() {
        System.out.println("startImpl类中的sleep方法");
    }

    @Override
    public void show() {
        System.out.println("startImpl类中的show方法");
    }
}
