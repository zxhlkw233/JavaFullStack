package AlgorithmBrushQuestion.leetcode;


public class Test2331 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();

//        creatListByArray(treeNode,new int[]{2,1,3,,,0,1});
    }
    public static ListNode creatListByArray(ListNode head, int[] nums) {
        ListNode p = head;
        for (int i = 0; i < nums.length; i++) {
            ListNode q = new ListNode();
            p.next = q;
            p.next.val = nums[i];
            p = p.next;
        }
        return head;
    }

}
class Solution2331 {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null) {
            return root.val == 1;
        }
        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
