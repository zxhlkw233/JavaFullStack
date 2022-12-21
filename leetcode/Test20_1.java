package leetcode;

import java.util.Stack;

public class Test20_1 {
    public static void main(String[] args) {
        Solution20_1 solution20_1 = new Solution20_1();
        boolean valid = solution20_1.isValid("(]");
        System.out.println(valid);
    }
}
class Solution20_1 {
    public boolean isValid(String s) {
        if(s.isEmpty())
            return true;
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.empty()||c!=stack.pop())
                return false;
        }
        if(stack.empty())
            return true;
        return false;
    }
}
