package leetcode;

public class Test647 {
    public static void main(String[] args) {
        Solution647 solution647 = new Solution647();
        int aabbcd = solution647.countSubstrings("aabbcd");
        System.out.println(aabbcd);
    }
}
class Solution647 {
    private int ans = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            // 以单个字母为中心的情况
            isPalindromic(s, i, i);
            // 以两个字母为中心的情况
            isPalindromic(s, i, i + 1);
        }
        return ans;
    }
    private void isPalindromic(String s, int i, int j) {
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) != s.charAt(j)) return ;
            i--;
            j++;
            ans++;
        }
    }


}


