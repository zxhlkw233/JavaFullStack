package AlgorithmBrushQuestion.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test2341 {
    public static void main(String[] args) {
        Solution2341 solution2341 = new Solution2341();
        solution2341.numberOfPairs(new int[]{1,3,2,1,3,2,2});
    }
}
class Solution2341 {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Boolean> cnt = new HashMap<Integer, Boolean>();
        int res = 0;
        for (int num : nums) {
            cnt.put(num, !cnt.getOrDefault(num, false));
            if (!cnt.get(num)) {
                res++;
            }
        }
        return new int[]{res, nums.length - 2 * res};
    }
}


