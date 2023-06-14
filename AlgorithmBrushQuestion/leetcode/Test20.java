package AlgorithmBrushQuestion.leetcode;

import java.util.*;

public class Test20 {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        boolean valid = solution20.isValid("(){}[]");
        System.out.println(valid);
    }
}
class Solution20{
    private static  final Map<Character,Character> map = new HashMap<Character,Character>(){{
       put('{','}');put('[',']');put('(',')');put('?','?');
    }};
    public boolean isValid(String s){
        if(s.length() > 0 && !map.containsKey(s.charAt(0))) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<Character>(){{add('?');}};
        for(Character c : s.toCharArray()){
            if(map.containsKey(c)){
                stack.addLast(c);
            }else if(map.get(stack.removeLast()) != c){
                return false;
            }
        }
        return stack.size() == 1;
    }
}