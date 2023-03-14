package leetcode;

public class Test67 {
    public static void main(String[] args) {
        Solution67 solution67 = new Solution67();
//        String s = solution67.addBinary("1010", "1011");
//        System.out.println(s);
        Solution67_1 solution671 = new Solution67_1();
        solution671.addBinary("1010","10");
    }
}
class Solution67 {
    public String addBinary(String a, String b) {
        char[] chars = a.toCharArray();
        char[] chars1 = b.toCharArray();
        int i = chars.length-1;
        int j = chars1.length-1;
        int temp = 0;
        StringBuffer sb = new StringBuffer();

        while(i >= 0 || j >= 0){
            int i1 = chars[i--] - '0';
            int i2 = chars1[j--] - '0';
            if((i1 + i2 + temp) >= 2){
                int c = (i1 + i2 + temp) % 2;
                sb.append(c + "");
                temp = 1;
            }
            sb.append((i1 + i2) + "");
            System.out.printf("%d,%d,%d",i1,i2,i1 + i2 + temp);
            System.out.println();
        }
        System.out.println(sb);
        return null;
    }
}

class Solution67_1 {
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();
        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();
        return ans.toString();
    }
}

class Solution67_2{
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();
        int n = Math.max(a.length(),b.length()),carry = 0;
        for(int i = 0;i < n;i++){
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i)) : 0;
            carry += i < b.length() ? (a.charAt(b.length() - 1 - i)) : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        if(carry > 0){
            ans.append('1');
        }
        ans.reverse();
        return ans.toString();
    }
}