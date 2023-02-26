package leetcode;

import java.util.Arrays;

public class Test2357 {
    public static void main(String[] args) {
        Solution2357 solution2357 = new Solution2357();
        solution2357.minimumOperations(new int[]{1,5,0,3,5});
    }
}
class Solution2357 {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                subtract(nums, nums[i], i);
                ans++;
            }
        }
        return ans;
    }

    public void subtract(int[] nums, int x, int startIndex) {
        int length = nums.length;
        for (int i = startIndex; i < length; i++) {
            nums[i] -= x;
        }
    }
}


