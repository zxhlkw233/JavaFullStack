package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test1015 {
    public static void main(String[] args) {
        Solution1015 solution1015 = new Solution1015();
        solution1015.smallestRepunitDivByk(5);
    }
}

class Solution1015 {
    public int smallestRepunitDivByk(int k) {
        int resid = 1 % k, len = 1;
        Set<Integer> set = new HashSet<Integer>();
        set.add(resid);
        while (resid != 0) {
            resid = (resid * 10 + 1) % k;
            len++;
            if (set.contains(resid)) {
                return -1;
            }
        }
        return len;
    }
}

