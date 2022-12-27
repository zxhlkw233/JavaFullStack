package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Test1805 {
    public static void main(String[] args) {
        Solution1805 solution = new Solution1805();
        solution.numDifferentIntegers("a123bc34d8ef34");
    }
}
class Solution1805 {
    public int numDifferentIntegers(String word) {

        Set<String> s = new HashSet<>();
        int n = word.length();
        for (int i = 0; i < n; ++i) {
            if (Character.isDigit(word.charAt(i))) {
                while (i < n && word.charAt(i) == '0') {
                    ++i;
                }
                int j = i;
                while (j < n && Character.isDigit(word.charAt(j))) {
                    ++j;
                }
                s.add(word.substring(i, j));
                i = j;
            }
        }
        return s.size();
    }
}

