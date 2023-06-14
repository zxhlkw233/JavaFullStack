package JavaEE.Test;

public class Tree {
    public static void main(String[] args) {
        //创建数组和链表
        int[] data = new int[]{5,8,1,9,6,3,2,4,8,7};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int i = 0; i < data.length; i++) {
            binarySearchTree.insert(data[i]);
        }
    }
}
//树的数据结构
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}
//构建二叉搜索树
class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insertRecursive(root.left, value);
        } else if (value > root.value) {
            root.right = insertRecursive(root.right, value);
        }

        return root;
    }

}