package AlgorithmBrushQuestion.leetcode;

public class Test27 {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        int i = solution27.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        System.out.println("i:" + i);
    }
}
class Solution27 {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for(int right = 0; right < nums.length;right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}

