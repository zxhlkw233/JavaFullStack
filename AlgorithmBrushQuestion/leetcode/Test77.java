package AlgorithmBrushQuestion.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test77 {
    public static void main(String[] args) {
        Solution77 solution77 = new Solution77();
        solution77.combine(4,2);
    }
}
class Solution77{
    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n,int k){
        dfs(1,n,k);
        return ans;
    }
    public void dfs(int cur,int n,int k){
        if(temp.size() + (n - cur + 1) < k){
            return;
        }
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(cur);
        dfs(cur+1,n,k);
        temp.remove(temp.size() - 1);
        dfs(cur+1,n,k);
    }
}
