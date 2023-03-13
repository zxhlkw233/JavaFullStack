package leetcode;
//力扣题66.加一
public class Test66 {
    public static void main(String[] args) {
//        Solution66 solution66 = new Solution66();
//        solution66.plusOne(new int[]{4,3,2,2});
        Solution66_1 solution661 = new Solution66_1();
        solution661.plusOne(new int[]{9,9,9,});
    }
}
class Solution66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1;i > 0;i--){
            int count = 0;
            if(digits[i] + 1 > 9){
                int a = (digits[i] + 1) % 9;
            }
        }

        return null;

    }
}
class Solution66_1 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

