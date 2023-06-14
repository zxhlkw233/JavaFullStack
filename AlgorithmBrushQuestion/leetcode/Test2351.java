package AlgorithmBrushQuestion.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test2351 {
    public static void main(String[] args) {
        Solution2351 solution2351 = new Solution2351();
        char accd = solution2351.repeatedCharacter("accd");
        System.out.println(accd);
    }
}
class Solution2351 {
    public char repeatedCharacter(String s) {
        List<Character> list = new ArrayList<>();
        for(int i = 0;i < s.length();i++){
            if(list.add(s.charAt(i))){
                return s.charAt(i);
            }
            list.add(s.charAt(i));
        }

        return '_';
    }
}
