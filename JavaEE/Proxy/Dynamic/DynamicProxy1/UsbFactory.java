package JavaEE.Proxy.Dynamic.DynamicProxy1;

public class UsbFactory implements UsbSell{
    @Override
    public float sell(int amount) {
        System.out.println("目标类中执行sell方法");
        return 85.0f;
    }
}
