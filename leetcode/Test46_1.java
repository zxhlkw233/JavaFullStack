package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test46_1 {
    public static void main(String[] args) {
        Solution46_1 solution46_1 = new Solution46_1();
        solution46_1.permute(new int[]{1, 2, 3});
    }
}

class Solution46_1 {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        List<Integer> output = new ArrayList<>();

        for (int num : nums) {
            output.add(num);
        }

        backTrack(output, res, 0);

        return res;
    }

    private void backTrack(List<Integer> output, List<List<Integer>> res, int n) {
        if (n == output.size() - 1) {
            res.add(new ArrayList<>(output));
            //为什么不是res.add(path);
            /*
            *
            * 变量 path 所指向的列表 在深度优先遍历的过程中只有一份 ，深度优先遍历完成以后，回到了根结点，成为空列表。
                在 Java 中，参数传递是 值传递，对象类型变量在传参的过程中，复制的是变量的地址。
                * 这些地址被添加到 res 变量，但实际上指向的是同一块内存地址，因此我们会看到 666 个空的列表对象。
                * 解决的方法很简单，在 res.add(path); 这里做一次拷贝即可。
                用res.add(new linkedList(path))而不是res.add(path)。
                * 因为path指向的对象在不断地增加和删除元素，最后会变成空。得到的结果会变成[[][][][][]]
                * 所以要用new linkedList(path)拷贝一个对象加入res
            * */
        } else {
            for (int i = n; i < output.size(); i++) {
                Collections.swap(output, n, i);
                backTrack(output, res, n + 1);
                Collections.swap(output, n, i);
            }
        }
    }
}
//这个才是我想要的模板
class Solution46_2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(res, list, nums);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums) {
        if(list.size() == nums.length) {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int num : nums) {
            if(!list.contains(num)) {
                list.add(num);
                backtrack(res, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }
}