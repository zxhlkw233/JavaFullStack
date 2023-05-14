package leetcode;

public class Test367 {
    public static void main(String[] args) {
        Solution367 solution367 = new Solution367();
        solution367.isPerfectSquare(11);
    }
}
class Solution367{
    public boolean isPerfectSquare(int num){
        long x = 1,square = 1;
        while(square <= num){
            if(square == num){
                return true;
            }
            ++x;
            square = x * x;
        }
        return false;
    }
}
