package leetcode;

public class Test9 {
    public static void main(String[] args) {
//        int i = 9999;
//        int div = 1;
//        while(i /div >= 10){
//            System.out.println("i/div: "+i/div+" i: "+ i+" div: "+div);
//            div *= 10;
//
//        }
//        System.out.println(div);
        Solution9 solution9 = new Solution9();
        boolean palindrome = solution9.isPalindrome(121);
        System.out.println(palindrome);
    }
}

class Solution9 {
    public boolean isPalindrome(int x) {
        //边界判断
        if (x < 0) return false;
        int div = 1;
        //
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}

