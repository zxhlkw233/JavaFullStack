package leetcode;

import java.math.BigDecimal;

public class Test66 {
    public static void main(String[] args) {
        int a = 4,b = 333;
        int i = a / b;
        double c = a / b;
        System.out.println("i " + i);
        System.out.println("c " + c);
        int ii = a % b;
        double cc = a % b;
        System.out.println("ii " + ii);
        System.out.println("cc " + cc);

        double aa = 4,bb = 333;
        System.out.println(aa / bb);

        BigDecimal bigA=new BigDecimal(1);
        BigDecimal bigB=new BigDecimal(3);
        System.out.println("a/b="+bigA.divide(bigB));
    }
}
