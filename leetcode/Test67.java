package leetcode;

public class Test67 {
    public static void main(String[] args) {
        Solution67 solution67 = new Solution67();
        String s = solution67.addBinary("1010", "1011");
        System.out.println(s);
    }
}
class Solution67 {
    public String addBinary(String a, String b) {
        char[] chars = a.toCharArray();
        char[] chars1 = b.toCharArray();
        int i = chars.length-1;
        int j = chars1.length-1;
        int temp = 0;
        while(i >= 0 || j >= 0){
            int i1 = chars[i--] - '0';
            int i2 = chars1[j--] - '0';
            if((i1 + i2 + temp) >= 2){
                temp = 1;
            }
            System.out.printf("%d,%d,%d",i1,i2,i1 + i2 + temp);
            System.out.println();
        }
        return null;
    }
}