package JavaEE.reflection;

public class PhoneFactory implements PhoneSell{

    @Override
    public float sell(int amount) {
        System.out.println("目标类，执行目标方法");
        return 50.0F;
    }
    public void print(){
        System.out.println("子类独有的方法");
    }
}
