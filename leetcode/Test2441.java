package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test2441 {
    public static void main(String[] args) {
        Solution2441_1 solution2441 = new Solution2441_1();
        int maxK = solution2441.findMaxK(new int[]{-1, 10, 6, 7, -7, 1});
        System.out.println(maxK);

    }
}
class Solution2441 {
    public int findMaxK(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(Math.abs(nums[i]),nums[i]);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return 0;
    }
}
class Solution2441_1 {
    public int findMaxK(int[] nums) {
        int k = -1;
        for(int x : nums){
            for(int y : nums){
                if(-x == y){
                    k = Math.max(k , x);
                }
            }
        }
        return k;
    }
}