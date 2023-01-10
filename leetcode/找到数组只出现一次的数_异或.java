package leetcode;

//原理 利用异或( ^ ) 可以去重这一特点。a异或a等于0，a异或0等于a（101异或101等于0）例如，A ^ A ^ B ^ C ^ C等于B，因为A^A等于0，消除重复了。
public class 找到数组只出现一次的数_异或 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,3};
        int res = 0;
        for(int num : nums){
            res = res ^ num;
            System.out.println(res);
        }
    }
}
