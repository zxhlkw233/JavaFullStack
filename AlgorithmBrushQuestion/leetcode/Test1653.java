package AlgorithmBrushQuestion.leetcode;

public class Test1653 {
    public static void main(String[] args) {
        Solution1653 solution1653 = new Solution1653();
        int aababbab = solution1653.minimumDeletions("aababbab");
        System.out.println(aababbab);
    }
}
class Solution1653 {
    public int minimumDeletions(String s) {
        int leftb = 0, righta = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                righta++;
            }
        }
        int res = righta;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                righta--;
            } else {
                leftb++;
            }
            res = Math.min(res, leftb + righta);
        }
        return res;
    }
}
class Solution1653_1{
    public int minimumDeletions(String s){
        //定义，要在某个间隔点左侧删除几个b,在右侧删除几个a
        int leftb = 0,righta = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == 'a'){
                righta++;
            }
        }
        int res = 0;
        for(int i = 0 ;i < s.length();i++){
            char c = s.charAt(i);
            if(c == 'a'){
                righta--;//一共有righta 个 a, righta-- 代表 它从右边走过几个a,--剩下的就是左边还有几个a
            }else{
                leftb++;//从左边 走过几个b,就加几个,
            }
            //righta + leftb,意味着，左边要删除几个b，而右边要删除几个a
            res = Math.min(res,leftb + righta);//取最小值
        }
        return res;
    }
}
