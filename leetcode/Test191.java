package leetcode;

public class Test191 {
    public static void main(String[] args) {
        Solution191 solution191 = new Solution191();
        solution191.hammingWeight(00000000000000000000000000001011);
    }
}
class Solution191{
    public int hammingWeight(int n){
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if((n & (1 << i)) != 0){
                ret++;
            }
        }
        return ret;
    }
}
