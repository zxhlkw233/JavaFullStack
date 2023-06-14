package AlgorithmBrushQuestion.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test78 {
    public static void main(String[] args) {
        Solution78 solution78 = new Solution78();
        List<List<Integer>> subsets = solution78.subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }
}
class Solution78 {
    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return ans;
    }

    public void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<Integer>(t));
            return;
        }
        t.add(nums[cur]);
        dfs(cur + 1, nums);
        t.remove(t.size() - 1);
        dfs(cur + 1, nums);
    }
}

