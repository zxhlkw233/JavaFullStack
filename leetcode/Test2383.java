package leetcode;

import java.util.Arrays;

public class Test2383 {
    public static void main(String[] args) {
        Solution2383 solution2383 = new Solution2383();
        solution2383.minNumberOfHours(5,3,new int[]{1,4,3,2},new int[]{2,6,3,1});
    }
}
class Solution2383 {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int a = 0;
        int b = 0;
        a += Arrays.stream(energy).sum() - initialEnergy;
        for (int i = 0; i < experience.length - 1; i++) {
            b -= experience[i];

            b += experience[i];

        }
        System.out.println(a);
        return 0;
    }
}
