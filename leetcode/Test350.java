package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test350 {
    public static void main(String[] args) {
        Solution350 solution350 = new Solution350();
        solution350.intersect(new int[]{4,9,5,4,4,9},new int[]{4,4,4,9});
    }
}

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        int[] res = new int[nums1.length];
        int index = 0;
        for(int num : nums2){
            int count = map.getOrDefault(num,0);
            if(count > 0){
                res[index++] = num;
                count--;
                if(count > 0){
                    map.put(num,count);
                }else {
                    map.remove(num);
                }
            }
        }

        return Arrays.copyOfRange(res,0,index);
    }
}
