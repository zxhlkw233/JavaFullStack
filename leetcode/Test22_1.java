package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test22_1 {

}
class Solution {
    public List<String> generateParenthesis(int n) {
        //创建一个列表 用来返回结果
        List<String> ans = new ArrayList<>();
        //dfs函数体
        backtrack(ans,new StringBuilder(),0,0,n);
        //return
        return ans;
    }
    public void backtrack(List<String> ans,StringBuilder cur,int open,int close,int max){
        if(cur.length() == max * 2){
            ans.add(cur.toString());
            return;
        }
        if(open < max){
            cur.append('(');
            backtrack(ans,cur,open + 1,close,max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if(close < max){
            cur.append(')');
            backtrack(ans,cur,open,close + 1,max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}