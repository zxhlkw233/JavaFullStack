package JavaEE.Lambda;

public class Test2 {
    interface IntegerMath{
        int operation(int a,int b);
    }
    public int operateBinary(int a,int b,IntegerMath op){
        return op.operation(a,b);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        IntegerMath addition = (a,b) -> a + b;
        IntegerMath subtraction = (a,b) -> a - b;
        System.out.println("2 + 1 = "+ test2.operateBinary(2,1,addition));
        System.out.println("2 - 1 = "+ test2.operateBinary(2,1,subtraction));
    }
}
