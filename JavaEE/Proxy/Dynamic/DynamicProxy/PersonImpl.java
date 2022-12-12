package JavaEE.Proxy.Dynamic.DynamicProxy;

public class PersonImpl implements Person {

    @Override
    public void printname() {
        System.out.println("只是输出printname");
    }

    @Override
    public void printage() {
        System.out.println("只是输出printage");
    }
}
