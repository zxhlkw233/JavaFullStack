package AlgorithmBrushQuestion.leetcode;

public class Test55 {
    public static void main(String[] args) {
        Solution55 solution55 = new Solution55();
        boolean b = solution55.canJump(new int[]{2,3,1,1,4});
        System.out.println(b);
    }
}
class Solution55 {
    public boolean canJump(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            pos = Math.max(pos,i + nums[i]);
            if(i == pos) return false;
        }
        return true;
    }
}
