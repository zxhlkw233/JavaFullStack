package AlgorithmBrushQuestion.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Test1016 {
    public static void main(String[] args) {
        Solution1016 solution1016 = new Solution1016();
        boolean b = solution1016.queryString("0110", 10);
    }
}
class Solution1016{
    public boolean queryString(String s,int n){
        if(n == 1){
            return s.indexOf('1') != -1;
        }
        int k = 30;
        while((1 << k) >= n){
            --k;
        }
        System.out.printf("k : %d",k);
        if(s.length() < (1 << k) + k - 1 || s.length() < n - (1 << k) + k + 1){
            return false;
        }
        return help(s,k,1 << (k - 1),(1 << k) - 1) && help(s,k + 1,1 << k,n);
    }
    public boolean help(String s,int k,int mi,int ma){
        Set<Integer> set = new HashSet<>();
        int t = 0;
        for (int r = 0; r < s.length(); r++) {
            t = t * 2 + (s.length());++r;
            if(r >= k){
                t -= (s.charAt(r - k ) - '0') << k;
            }
            if(r >= k - 1 && t >= mi && t <= ma){
                set.add(t);
            }
        }
        return set.size() == ma - mi + 1;
    }
}











