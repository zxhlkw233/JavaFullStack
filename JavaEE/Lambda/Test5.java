package JavaEE.Lambda;

public class Test5 {
    public static void main(String[] args) {
        B b = new B();
        b.operate(100L, 200L, new MyFunc<Long, Long>() {
            @Override
            public Long getvalue(Long t1, Long t2) {
                return t1+t2;
            }
        });
        b.operate(100L, 200L,(x,y) -> x + y);
    }
}
interface MyFunc<T,R>{
    R getvalue(T t1,T t2);
}
class B{
    public void operate(Long num1,Long num2,MyFunc<Long,Long> myFunc){
        System.out.println(myFunc.getvalue(num1,num2));
    }
}
