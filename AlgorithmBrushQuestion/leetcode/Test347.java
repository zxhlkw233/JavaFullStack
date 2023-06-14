package AlgorithmBrushQuestion.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Test347 {
    public static void main(String[] args) {
        Solution347 solution347 = new Solution347();
        solution347.topKFrequent(new int[]{1,1,4,4,3,3,2,2,3},2);
    }
}
class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> occurences = new HashMap<>();
        for (int num : nums) {
            occurences.put(num,occurences.getOrDefault(num,0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        for(Map.Entry<Integer,Integer> entry : occurences.entrySet()){
            int num = entry.getKey(),count = entry.getValue();
            if(queue.size() == k){
                if(queue.peek()[1] < count){
                    queue.poll();
                    queue.offer(new int[]{num,count});
                }
            }else {
                queue.offer(new int[]{num,count});
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll()[0];
        }
        return ret;
    }
}
