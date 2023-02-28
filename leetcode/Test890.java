package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test890 {
    public static void main(String[] args) {
        Solution890 solution890 = new Solution890();
        solution890.findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"},"abb");
    }
}
class Solution890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<String>();
        for (String word : words) {
            if (match(word, pattern) && match(pattern, word)) {
                ans.add(word);
            }
        }
        return ans;
    }

    public boolean match(String word, String pattern) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < word.length(); ++i) {
            char x = word.charAt(i), y = pattern.charAt(i);
            if (!map.containsKey(x)) {
                map.put(x, y);
            } else if (map.get(x) != y) { // word 中的同一字母必须映射到 pattern 中的同一字母上
                return false;
            }
        }
        return true;
    }
}

