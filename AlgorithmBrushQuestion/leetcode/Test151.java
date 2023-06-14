package AlgorithmBrushQuestion.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test151 {
    public static void main(String[] args) {
        Solution151 solution151 = new Solution151();
        solution151.fun("   the key    is     blue    ");

    }
}
class Solution151{
    public String  fun(String s){
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ",wordList);
    }
}
