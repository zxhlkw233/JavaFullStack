package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test322 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5};
        Solution322 solution322 = new Solution322();
        solution322.coinChange(nums,11);
    }
}
class Solution322 {
    public int coinChange(int[] coins,int amount){
        int ans = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        int dfs = dfs(coins, deque, ans, amount);
        return dfs;
    }
    public int sum(Deque<Integer> deque){
        int sum = 0;
        for (Integer integer : deque) {

        }
        return sum;
    }
    public int dfs(int [] coins, Deque<Integer> deque,int ans,int amount){
        if(sum(deque) == amount){
            return 0;
        }
        for(int i = coins.length - 1;i > 0;i--){
            deque.add(coins[i]);
            dfs(coins,deque,ans,amount);
            deque.removeLast();
        }
        return 1;
    }
}