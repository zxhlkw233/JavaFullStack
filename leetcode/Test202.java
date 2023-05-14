package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Test202 {
    public static void main(String[] args) {
        Solution202 solution202 = new Solution202();
        boolean happy = solution202.isHappy(19);

    }
}
class Solution202{
    private int getNext(int n){
        int totalSum = 0;
        while(n > 0){
            int d = n % 10;
            n /= 10;
            totalSum += d * d;

        }
        return totalSum;
    }
    public boolean isHappy(int n){
        Set<Integer> seen = new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
}
