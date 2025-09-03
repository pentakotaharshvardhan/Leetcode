/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class BSTIterator {
    private List<Integer> ls = new ArrayList<>();
    private int size = 0;
    private int k = 0;

    private void inorder(TreeNode root, List<Integer> ls) {
        if (root == null) return;
        inorder(root.left, ls);
        ls.add(root.val);
        inorder(root.right, ls);
    }

    public BSTIterator(TreeNode root) {
        inorder(root, ls);
        size = ls.size();
    }

    public int next() {
        return ls.get(k++);
    }

    public boolean hasNext() {
        return k < size;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */