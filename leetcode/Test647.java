package leetcode;

public class Test647 {
    public static void main(String[] args) {
        Solution647 solution647 = new Solution647();
        solution647.countSubstrings("aabbccd");
    }
}
class Solution647 {
    public int countSubstrings(String s) {
        int ans = 0;
        boolean[][] dp =  new boolean[s.length()][s.length()];
        for(int i = s.length() - 1; i >= 0; i--){
            for(int j = i; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(j - i <= 1){
                        dp[i][j] = true;
                        ans++;
                    }else if(dp[i + 1][j - 1]){
                        dp[i][j] = true;
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
