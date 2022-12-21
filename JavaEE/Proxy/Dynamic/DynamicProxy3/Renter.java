package JavaEE.Proxy.Dynamic.DynamicProxy3;

public class Renter implements Person{
    @Override
    public void rentHouse() {
        System.out.println("租客租房成功");
    }
}
