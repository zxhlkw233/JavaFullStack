package AlgorithmBrushQuestion.leetcode;

public class Test343 {
    public static void main(String[] args) {

    }
}
class Solution343{
    public int integerBreak(int n){
        if(n <= 3){
            return n - 1;
        }
        int a = n /= 3,b = n % 3;
        if(b == 0){
            return (int) Math.pow(3,a);
        }
        if(b == 1){
            return (int)Math.pow(3,a - 1) * 4;
        }
        return (int) Math.pow(3,a) * 2;
    }
}
