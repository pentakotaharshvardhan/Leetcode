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
    public int maxProduct(TreeNode root) {
        if(root.left==null && root.right==null) return 0;
        TreeNode temp=helper(root);
        //System.out.println(temp.val+" "+temp.right.left.val);
        long ans=(helper2(temp,temp.val))%1000000007;
        //System.out.println(ans);
        return (int)ans;
    }
    public static TreeNode helper(TreeNode root){
        if(root==null) return null;
        TreeNode  left=helper(root.left);
        TreeNode right=helper(root.right);
        root.val=(left==null?0:left.val)+(right==null?0:right.val)+root.val;
        //System.out.println(root.val);
        return root;
    }
    public static long  helper2(TreeNode temp,long m){
        if(temp==null) return 0L;
        long max=0;
        if(temp.left!=null){
            max=Math.max(max,((m-temp.left.val)*temp.left.val));
            max=Math.max(max,helper2(temp.left,m));
        }
        if(temp.right!=null){
            max=Math.max(max,((m-temp.right.val)*temp.right.val));
            max=Math.max(max,helper2(temp.right,m));
        }
        return max;
    }
}