package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test2283 {
    public static void main(String[] args) {
        Solution2283 solution2283 = new Solution2283();
        boolean b = solution2283.digitCount("1210");
        System.out.println(b);
    }
}
class Solution2283{
    public boolean digitCount(String num){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
//            map.put(num.charAt(i),map.get(num.charAt(i))+1);
            int an = num.charAt(i) - '0';
            map.put(an,map.getOrDefault(an,0)+1);
            System.out.println(map.get(an));
        }
        System.out.println("--------");
        for(Integer value : map.values()){
            System.out.println(value);
        }
        for (int i = 0; i < num.length(); i++) {
           int a = num.charAt(i) -'0';
           if(!(map.getOrDefault(i,0) == a)){
               return false;
           }
        }
        return true;
    }
}
