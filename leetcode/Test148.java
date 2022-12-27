package leetcode;

public class Test148 {
    /**
     * 尾插法构建带头节点的单链表
     *
     * @param head
     * @param nums
     * @return
     */
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

    /**
     * 打印带头结点的链表
     *
     * @param head
     */
    public void showList(ListNode head) {
        if (head == null) {
            System.out.println();
            return;
        }
        ListNode p = head.next;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //实例化对象
        Solution148 solution148 = new Solution148();
        Test148 test148 = new Test148();
        ListNode listNode = new ListNode();
        System.out.print("没有注入元素之前的链表:");
        test148.showList(listNode);
        //创建数据源，更新链表
        int[] nums = new int[]{4, 2, 1, 3};
        test148.creatListByArray(listNode, nums);
        System.out.print("注入元素之后的:");
        test148.showList(listNode);
        System.out.println("listNode链表头节点值:" + listNode.next.val);
        //链表排序
        ListNode listNode1 = solution148.sortList(listNode);
        System.out.print("链表排序之后的:");
        test148.showList(listNode1);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution148 {
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

    public ListNode sortList(ListNode head) {
        System.out.println("head节点值:" + head.next.val);
        return sortList(head, null);
    }

    public ListNode sortList(ListNode head, ListNode tail) {
        if (head !=null && head.next != null) {
            System.out.print("此时head链表为:");
            showList(head);
        }
        if (tail != null && tail.next != null) {
            System.out.print("此时tail链表为:");
            showList(tail);
        }
        if (head == null) {
            return head;
        }
        if (head.next == tail) {
            head.next = null;
            return head;
        }
        ListNode slow = head, fast = head;
        while (fast != tail) {
            System.out.print("show节点值: " + slow.val + "   ");
            System.out.println("fast节点值: " + fast.val);
            slow = slow.next;
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }
        System.out.println("---------while循环结束---------");
        ListNode mid = slow;
        System.out.println("show节点值:" + slow.val);
        if (fast != null) {
            System.out.println("fast节点值:" + fast.val);
        }
        System.out.println("mid节点值:" + mid.val);
        System.out.print("此时slow链表为:");
        showList(slow);
        System.out.print("此时fast链表为:");
        showList(fast);

        System.out.println("--------------以上这个功能完成了一次-------------");
        ListNode list1 = sortList(head, mid);
        ListNode list2 = sortList(mid, tail);
        ListNode sorted = merge(list1, list2);
        return sorted;
    }

    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead, temp1 = head1, temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1 != null) {
            temp.next = temp1;
        } else if (temp2 != null) {
            temp.next = temp2;
        }
        System.out.print("此时head1链表为:");
        showList(head1);
        System.out.print("此时head2链表为:");
        showList(head2);
        System.out.print("此时dummyHead链表为:");
        showList(dummyHead.next);
        System.out.println("----这个函数完成了一次----");
        return dummyHead.next;
    }
}


