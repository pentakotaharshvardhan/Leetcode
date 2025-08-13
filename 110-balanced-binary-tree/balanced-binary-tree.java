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
class Solution {
    public boolean isBalanced(TreeNode root) {
        return (helper(root)!=-1);
    }
    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int heightl=helper(root.left);
        int heightr=helper(root.right);
        if(heightl==-1 || heightr==-1) return -1;
        if(Math.abs(heightl-heightr)>1) return -1;
        return Math.max(helper(root.left),helper(root.right))+1;
    }
}