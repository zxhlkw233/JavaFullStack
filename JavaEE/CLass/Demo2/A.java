package JavaEE.CLass.Demo2;

public class A {
    public B b(){
        System.out.println("B类做为返回值参数");
        return new B();
    }
}
