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
    public void flatten(TreeNode root) {
        TreeNode temp=root;
        while(temp!=null){
            if(temp.left!=null){
                TreeNode bottom=temp.left;
                while(bottom.right!=null){
                    bottom=bottom.right;
                }
                //System.out.println(bottom.val);
                bottom.right=temp.right;
                temp.right=temp.left;
                temp.left=null;
            }
            temp=temp.right;
        }
    }
}