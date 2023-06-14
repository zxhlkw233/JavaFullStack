package AlgorithmBrushQuestion.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Test32 {
    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();
        solution32.longestValidParentheses(")()())");
    }
}
class Solution32{
    public int longestValidParentheses(String s){
        int maxans = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(-1);
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxans = Math.max(maxans,i - stack.peek());
                }
            }
        }
        return maxans;
    }
}
