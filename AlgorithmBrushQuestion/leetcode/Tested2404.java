package AlgorithmBrushQuestion.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Tested2404 {
    public static void main(String[] args) {
        Solution2404 solution2404 = new Solution2404();
        solution2404.mostFrequentEven(new int[]{4,4,4,9,2,4});
    }
}
class Solution2404{
    public int mostFrequentEven(int[] nums) {
        //利用hash表记录
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int num : nums) {
            if(num % 2 == 0){
                hash.put(num,hash.getOrDefault(num,0)+1);
            }
        }
        int res = -1,ct = 0;
        //比较hash记录
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if(res == -1 || entry.getValue() > ct || entry.getValue() == ct && res > entry.getKey()){
                res = entry.getKey();
                ct = entry.getValue();
            }
        }
        return res;
    }
}