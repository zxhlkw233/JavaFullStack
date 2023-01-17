package leetcode;

import java.util.*;

public class Test47_1 {

    public static void main(String[] args) {
        Solution47_1 solution47_1 = new Solution47_1();
        List<List<Integer>> permute = solution47_1.permute(new int[]{1, 1, 2,2});
        Set<List<Integer>> set = new HashSet<>(permute);
        System.out.println(permute);
        System.out.println(set);
    }
}


class Solution47_1 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        backTrack(output, res, 0);
        return res;

    }

    public void backTrack(List<Integer> output, List<List<Integer>> res, int n) {
        if (n == output.size() - 1) {
            res.add(new ArrayList<>(output));
        }
        for (int i = n; i < output.size(); i++) {
            Collections.swap(output, n, i);
            backTrack(output, res, n + 1);
            Collections.swap(output, n, i);
        }
    }
}