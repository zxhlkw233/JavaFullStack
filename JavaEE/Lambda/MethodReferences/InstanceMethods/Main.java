package JavaEE.Lambda.MethodReferences.InstanceMethods;

public class Main {
    public static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "lambda add power to Java";
        MyStringOps strOps = new MyStringOps();//实例对象
        //strOps::strReverse1 相当于实现了接口方法func()
        String outStr = stringOp(strOps::strReverse1, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reserved: " + outStr);
    }

}
