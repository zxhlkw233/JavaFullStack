package AlgorithmBrushQuestion.leetcode;

import java.util.Arrays;

public class Test594 {
    public static void main(String[] args) {
        Solution594 solution594 = new Solution594();
    }
}
class Solution594 {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int begin = 0;
        int res = 0;
        int end = 0;
        for(int i = 0;i < nums.length;i++){
            while(nums[i] - nums[begin] > 1){
                begin++;
            }
            if(nums[i] - nums[begin] == 1){
                res = Math.max(res,i - begin + 1);
            }
        }
        return res;
    }
}
