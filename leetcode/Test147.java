package leetcode;

import java.util.List;

public class Test147 {
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
    public static void showList(ListNode head) {
        if (head == null) {
            System.out.println();
            return;
        }
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Solution147 solution147 = new Solution147();
       Test147 test147 = new Test147();
        ListNode listNode1 = new ListNode();
        int[] nums = new int[]{4,2,1,3};
        test147.creatListByArray(listNode1,nums);
        showList(listNode1);
        ListNode dummyHead = new ListNode(99);
        dummyHead.next = listNode1;
        while(dummyHead != null ){
            System.out.println(dummyHead.val);
            dummyHead = dummyHead.next;
        }
    }
}
class Solution147 {
    public static void showList(ListNode head) {
        if (head == null) {
            System.out.println();
            return;
        }
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode lastSorted = head, curr = head.next;
        while (curr != null) {
            if (lastSorted.val <= curr.val) {
                lastSorted = lastSorted.next;
            } else {
                ListNode prev = dummyHead;
                while (prev.next.val <= curr.val) {
                    prev = prev.next;
                }
                lastSorted.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
            }
            curr = lastSorted.next;
        }
        return dummyHead.next;
    }
}
