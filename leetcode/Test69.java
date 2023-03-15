package leetcode;

public class Test69 {
    public static void main(String[] args) {
        Solution69 solution69 = new Solution69();
        solution69.mySqrt(12);
    }
}
class Solution69 {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
class Solution69_1{
    public int mySqrt(int x){
        int l = 0,r = x,ans = -1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if((long) mid * mid <= x){
                ans = mid;
            }else{
                r = mid - 1;
            }
        }
        return ans;
    }
}

