package AlgorithmBrushQuestion.leetcode;

public class Test29 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        int divide = solution29.divide(-2147483648, -1);
        System.out.println(divide);


    }
}
class Solution29{
    public int divide(int dividend, int divisor) {
        int i =(dividend > 0) ^ (divisor > 0) ? -1 : 1;


        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if(divisor < 0) divisor = -divisor;
        if(dividend < 0) dividend = -dividend;
        System.out.println("i: "+i);
        int count = 0;
        int v = divisor;

        int temp = divisor;
        System.out.println("v: "+v);
        System.out.println("temp: "+temp);
        System.out.println("dividend: "+dividend);
        System.out.println("divisor: "+divisor);
        while (v <= dividend){
            v += temp;
            count ++;
            System.out.println("v: "+v);
        }
        return i < 0 ? -count : count;
    }
}
