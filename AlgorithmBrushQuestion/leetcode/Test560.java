package AlgorithmBrushQuestion.leetcode;

public class Test560 {
    public static void main(String[] args) {
        Solution560 solution560 = new Solution560();
        solution560.subarraySum(new int[]{1,2,3},3);
    }
}
class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
