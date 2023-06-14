package AlgorithmBrushQuestion.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test90 {
    public static void main(String[] args) {
        Solution90 solution90 = new Solution90();
        List<List<Integer>> lists = solution90.subsetsWithDup(new int[]{1, 2, 2});
        System.out.println(lists);
    }
}

class Solution90 {

    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            t.clear();
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    if (i > 0 && (mask >> (i - 1) & 1) == 0 && nums[i] == nums[i - 1]) {
                        flag = false;
                        break;
                    }
                    t.add(nums[i]);
                }
            }
            if (flag) {
                ans.add(new ArrayList<>(t));
            }
        }
        return ans;

    }
}

class Solution90_1{

}
