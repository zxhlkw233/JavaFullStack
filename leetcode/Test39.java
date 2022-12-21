package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Test39 {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        List<List<Integer>> lists = solution39.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(lists);
    }
}

class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList <>();
        if(len == 0){
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates,0,len,target,path,res);
        return res;
    }
    private void dfs(int[] candidates,int begin,int len,int target,Deque<Integer> path,List<List<Integer>> res){
        if(target < 0){
            return;
        }
        if(target == 0){
            res.add(new ArrayList<>(path));
        }
        for(int i = begin;i < len;i++){
            path.add(candidates[i]);
            dfs(candidates,i,len,target - candidates[i],path,res);
            path.removeLast();
        }
    }
}