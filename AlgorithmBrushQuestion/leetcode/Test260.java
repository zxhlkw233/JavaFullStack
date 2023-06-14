package AlgorithmBrushQuestion.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test260 {
    public static void main(String[] args) {
//        Solution260 solution260 = new Solution260();
//        solution260.singleNumber(new int[]{});
        Map<Integer,Integer> freq = new HashMap<>();
        int[] nums = new int[]{1,2,1,3,2,5};
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        System.out.println(freq.entrySet());
    }
}
class Solution260 {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int[] arr = new int[12];
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                arr[index++] = entry.getKey();
            }
        }
        return arr;
    }
}