package JavaEE.Proxy.Dynamic.DynamicProxy;

public class Main {
    public static void main(String[] args) {
        Person person = PersonProxy.getProxy(new PersonImpl());
        person.printname();
    }
}
