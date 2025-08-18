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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans={0};
        int heightl=helper(root,ans);
        return ans[0];
    }
    public int helper(TreeNode root,int[] ans){
        if(root==null){
            return 0;
        }
        int heightl=helper(root.left,ans);
        int heightr=helper(root.right,ans);
        int temp=heightl+heightr;
        //System.out.println(root.val+" "+ans[0]+" "+heightl+" "+heightr+" "+temp);
        if(ans[0]<temp) {
            ans[0]=temp;
        }
        return Math.max(heightl, heightr) + 1;
    }
}