package AlgorithmBrushQuestion.leetcode;

public class Test92 {
    public static void main(String[] args) {

    }
}

class Solution92{
    public ListNode reverseBetWeen(ListNode head,int left,int right){
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        //节点指向left的前一个
        ListNode pre = dummyNode;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        //节点指向right的当前位置
        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }

        //把left到right中间的截断，形成一个子链表
        ListNode leftnode = pre.next;
        ListNode curr = rightNode.next;

        //切断链接
        pre.next = null;
        rightNode.next = null;

        //反转子链表
        reverseLinkList(leftnode);

        //把子链表接回原来的链表
        pre.next = rightNode;
        leftnode.next = curr;
        return dummyNode.next;

    }

    private void reverseLinkList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

}
