package AlgorithmBrushQuestion.leetcode;

public class 链表的测试用例_添加方法 {
    public ListNode creatListByArray(ListNode head, int[] nums) {
        ListNode p = head;
        for (int i = 0; i < nums.length; i++) {
            ListNode q = new ListNode();
            p.next = q;
            p.next.val = nums[i];
            p = p.next;
        }
        return head;
    }
    //当需要编写链表的测试用例的时候，把这个添加进去
    //https://blog.csdn.net/qq_41829337/article/details/125944085 这里还有其他方法可以使用
}
