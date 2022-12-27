package leetcode;

import java.util.Arrays;

public class Test2500 {
    public static void main(String[] args) {
        Solution2500 solution2500 = new Solution2500();
        int i = solution2500.deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}});
        System.out.println(i);
    }
}
class Solution2500{
    public int deleteGreatestValue(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0;i < n;i++){
            Arrays.sort(grid[i]);
        }
        for(int i = 0;i < n;i++){
            System.out.println(Arrays.toString(grid[i]));
        }

        int ans = 0;
        for(int i = 0;i < m;i++){
            int max = 0;
            for(int j = 0;j < n;j++){
                max = Math.max(max,grid[j][i]);
            }
            System.out.println(max);
         ans += max;
        }
        return ans;
    }
}
