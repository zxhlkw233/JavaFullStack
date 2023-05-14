package leetcode;

public class Test371 {
    public static void main(String[] args) {
        Solution371 solution371 = new Solution371();
        int sum = solution371.getSum(3, 5);
        System.out.println(sum);
    }
}
class Solution371{
    public int getSum(int a,int b){
        while(b != 0){
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}