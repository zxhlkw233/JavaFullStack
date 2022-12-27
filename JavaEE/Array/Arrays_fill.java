package JavaEE.Array;

import java.util.Arrays;

public class Arrays_fill {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Arrays.fill(nums,1);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
