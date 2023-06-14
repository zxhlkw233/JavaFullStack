package AlgorithmBrushQuestion.leetcode;

public class Test6333 {
    public static void main(String[] args) {
        Solution6333 solution6333 = new Solution6333();
        int[] columnWidth = solution6333.findColumnWidth(new int[][]{{-15, 1, 3}, {15, 7, 12}, {5, 6, -2}});
        for (int i : columnWidth) {
            System.out.println(i);
        }
    }
}
class Solution6333 {
    public int[] findColumnWidth(int[][] grid) {
        
        int[] arr = new int[grid.length];
        int count = 0;
        for(int i = 0;i < grid.length;i++){
            int ans = 0;
            for(int j = 0;j <grid[0].length;j++){
                int a = grid[j][i];
                int math = math(a);
                ans = Math.max(ans,math);
            }
            arr[count++] = ans;
        }
        return arr;
    }
    public int math(int a){
        int b = 0;
        if(a < 0){
            b+=1;
            a = -a;
        }
        while(a != 0){
            a /= 10;
            b++;
        }
        return b;
    }
}
