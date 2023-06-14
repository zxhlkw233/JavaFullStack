package AlgorithmBrushQuestion.leetcode;

import java.util.regex.Pattern;

public class Test2042 {
    public static void main(String[] args) {
//        Solution2042 solution2042 = new Solution2042();
//        boolean b = solution2042.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles");
//        System.out.println(b);

        Solution2042_1 solution2042_1 = new Solution2042_1();
        boolean b1 = solution2042_1.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles");
        System.out.println(b1);
    }
}
class Solution2042 {
    public boolean areNumbersAscending(String s) {
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            String ans = null;
            while(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                ans +=s.charAt(i);
                i++;
            }
            int a = Integer.parseInt(ans);
            if(temp <= a){
                temp = a;
            }else{
                return false;
            }
        }
        return true;
    }
}
class Solution2042_1 {
    public boolean areNumbersAscending(String s) {
        int preNum = -1;
        Pattern p = Pattern.compile("^[0-9]+$");
        for(String token: s.split(" ")){
            if(!p.matcher(token).matches())continue;
            int curNum = Integer.valueOf(token);
            if(curNum <= preNum)return false;
            preNum = curNum;
        }
        return true;
    }
}
