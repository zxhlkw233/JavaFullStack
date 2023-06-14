package AlgorithmBrushQuestion.leetcode;

public class Test507 {
    public static void main(String[] args) {
        Solution507 solution507 = new Solution507();
        solution507.checkPerfectNumber(28);
    }
}
class Solution507{
    public boolean checkPerfectNumber(int num){
        if(num == 1){
            return false;
        }
        int sum = 1;
        for(int d = 2;d * d <= num;++d){
            if(num % d == 0){
                sum += d;
                if(d * d < num){
                    sum += num / d;
                }
            }
        }
        return sum == num;
    }
}