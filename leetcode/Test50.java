package leetcode;

public class Test50 {
    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        solution50.myPow(2.1000,8);
    }
}
class Solution50 {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }
}

