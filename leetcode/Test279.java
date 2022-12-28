package leetcode;

public class Test279 {
    public static void main(String[] args) {
        Solution279 solution279 = new Solution279();
        solution279.numSquares(14);
    }
}
class Solution279 {
    public int numSquares(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, f[i - j * j]);
            }
            f[i] = minn + 1;
        }
        return f[n];
    }
}


