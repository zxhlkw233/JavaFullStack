package AlgorithmBrushQuestion.leetcode;

public class Test148_1 {
    public static void main(String[] args) {

    }
}
class ListNode148_1 {
    int val;
    ListNode148_1 next;
    ListNode148_1() {}
    ListNode148_1(int val) { this.val = val; }
    ListNode148_1(int val, ListNode148_1 next) { this.val = val; this.next = next; }
}
class Solution148_1 {
    public ListNode148_1 sortList(ListNode148_1 head) {
        return mergeSort(head);
    }
    private ListNode148_1 mergeSort(ListNode148_1 head){
        //如果没有节点/只有一个节点，无需排序，直接返回
        if(head == null || head.next == null){
            return null;
        }
        //快慢指针找出中位点
        ListNode148_1 slow = head,fast = head.next.next,l,r;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //对右半部分进行排序
        r = mergeSort(slow);
        slow.next = null;
        //对左半部分进行排序
        l = mergeSort(head);
        return mergeList(l,r);

    }
    //合并链表
    private ListNode148_1 mergeList(ListNode148_1 l,ListNode148_1 r){
        //新建临时头节点
        ListNode148_1 temp = new ListNode148_1();
        ListNode148_1 p = temp;
        //合并链表
        while(l != null && r != null){
            if(l.val < r.val){
                p.next = l;
                l = l.next;
            }else{
                p.next = r;
                r = r.next;
            }
            p = p.next;
        }
        p.next = l == null ? r : l;
        return temp;
    }


}