package AlgorithmBrushQuestion.leetcode;

public class Test2169 {
    public static void main(String[] args) {
        Solution2169 solution2169 = new Solution2169();
        int i = solution2169.countOperations(10, 16);
        System.out.println(i);
    }
}
class Solution2169 {
    public int countOperations(int num1, int num2) {
        System.out.println("开始程序");
        int count = 0;
        while(num1 > 0 || num2 > 0){
            System.out.println("开始程序111");
            if(num1 >= num2) {
                num1 -= num2;
            }else {
                num2 -= num1;
            }
            count++;
            System.out.printf("%d %d %d",num1,num2,count);
            if(num1 == 0 || num2 == 0){
                break;
            }
        }
        System.out.println(count);
        return count;
    }
}