package JavaEE.Proxy.Dynamic.DynamicProxy2;

public class Main {
    public static void main(String[] args) {
        Start start = (Start) new StartProxy().getProxy(new StartImpl());
        start.sleep();
    }
}
