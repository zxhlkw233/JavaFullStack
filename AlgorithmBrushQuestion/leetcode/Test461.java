package AlgorithmBrushQuestion.leetcode;

public class Test461 {
    public static void main(String[] args) {
        Solution461 solution461 = new Solution461();
        int i = solution461.hammingDistance(3, 1);
    }
}
class Solution461{
    public int hammingDistance(int x,int y){
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(x ^ y));
        System.out.println(Integer.bitCount(x ^ y));
        return Integer.bitCount(x ^ y);
    }
}
















