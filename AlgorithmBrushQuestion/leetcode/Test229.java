package AlgorithmBrushQuestion.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test229 {
    public static void main(String[] args) {
        Solution229 solution229 = new Solution229();
        List<Integer> list = solution229.majorityElement(new int[]{1});
        System.out.println(list);
    }
}
class Solution229{
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length / 3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
