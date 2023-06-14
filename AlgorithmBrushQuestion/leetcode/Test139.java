package AlgorithmBrushQuestion.leetcode;

import java.util.*;

public class Test139 {
    public static void main(String[] args) {
         Solution139 solution139 = new Solution139();
         List<String> s = new ArrayList<>();
         s.add("leet");
         s.add("code");
         solution139.wordBreak("leetcode", Arrays.asList("leet","code"));
    }
}
class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String substring = s.substring(j, i);
                if (dp[j] && wordDictSet.contains(substring)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}

