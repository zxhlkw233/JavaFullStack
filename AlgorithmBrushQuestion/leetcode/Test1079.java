package AlgorithmBrushQuestion.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test1079 {
    public static void main(String[] args) {
        Solution1079 solution1079 = new Solution1079();
        solution1079.numTilePossibilities("AAB");
    }
}
class Solution1079{
    public int numTilePossibilities(String tiles) {
        Map<Character,Integer> count = new HashMap<>();
        for (char c : tiles.toCharArray()) {
            count.put(c,count.getOrDefault(c,0) + 1);
        }
        Set<Character> tile = new HashSet<>(count.keySet());
        return 0;
    }
    private int dfs(int i,Map<Character,Integer> count,Set<Character> tile){
        if(i == 0){
            return 1;
        }
        int res = 1;
        for(char t : tile){
            if(count.get(t) > 0){
                count.put(t,count.get(t) - 1);
                res += dfs(i - 1,count,tile);
                count.put(t,count.get(t) + 1);
            }
        }
        return res;
    }
}