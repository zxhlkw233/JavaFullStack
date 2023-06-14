package AlgorithmBrushQuestion.leetcode;


public class Test1003 {
    public static void main(String[] args) {
        Solution1003 solution1003 = new Solution1003();
        boolean abccba = solution1003.isValid("abcabc");
        System.out.println(abccba);

    }
}
class Solution1003{
    public boolean isValid(String s){
        StringBuilder ss = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            ss.append(c);
            if(ss.length() >= 3 && ss.substring(ss.length() - 3).equals("abc")){
                ss.delete(ss.length() - 3,ss.length());
            }
        }
        return ss.toString().isEmpty();
    }
}
class Solution1003_1 {
    public boolean isValid(String s) {
        StringBuilder stk = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stk.append(c);
            if (stk.length() >= 3 && stk.substring(stk.length() - 3).equals("abc")) {
                stk.delete(stk.length() - 3, stk.length());
            }
        }
        return true;
    }
}