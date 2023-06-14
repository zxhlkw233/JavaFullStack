package AlgorithmBrushQuestion.leetcode;

public class Test680 {
    public static void main(String[] args) {
        Solution680 solution680 = new Solution680();
        solution680.validPalindrome("abca");
    }
}
class Solution680{
    public boolean validPalindrome(String s){
        int low = 0,high = s.length() - 1;
        while(low < high){
            char c1 = s.charAt(low),c2 = s.charAt(high);
            if(c1 == c2){
                ++low;
                --high;
            }else{
                return validPalindrome(s,low,high - 1) || validPalindrome(s,low + 1,high);
            }
        }
        return true;
    }
    public boolean validPalindrome(String s,int low ,int high){
        for(int i = low,j = high;i < j;++i,--j){
            char c1 = s.charAt(i),c2 = s.charAt(j);
            if(c1 != c2){
                return false;
            }
        }
        return true;
    }
}
