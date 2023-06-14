package AlgorithmBrushQuestion.leetcode;

public class Test796 {
    public static void main(String[] args) {
        Solution796 solution796 = new Solution796();
        solution796.rotateString("abcdefg","cdefgabc");
    }
}
class Solution796{
    public boolean rotateString(String s, String goal) {
        String a = s;
        for (int i = 0; i < s.length(); i++) {
            a = a.substring(1,s.length()) + a.substring(0,1);
            System.out.println(a);
        }

        return false;
    }
}
