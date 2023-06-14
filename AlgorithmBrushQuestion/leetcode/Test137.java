package AlgorithmBrushQuestion.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test137 {
    public static void main(String[] args) {

    }
}
class Solution137{
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> map1 : map.entrySet()){

            if(map1.getValue() == 1){
                ans = map1.getKey();
                break;
            }
        }
        return ans;
    }
}
