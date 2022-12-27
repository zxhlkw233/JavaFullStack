package leetcode;

public class 数组去重_原地修改 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3, 3};
        fun fun = new fun();
        int i = fun.removeDuplicates(nums);

    }
}

class fun {
    int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }

        return slow + 1;
    }

}