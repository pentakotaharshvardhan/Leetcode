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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(root,ans,0);
        return ans;
    }
    public void helper(TreeNode root,List<List<Integer>> ans,int height){
        if(root==null){
            return ;
        }
        if(height<ans.size()){
            List<Integer> ls=ans.get(height);
            ls.add(root.val);
            ans.set(height,ls);
        }
        else{
            List<Integer> ls=new ArrayList<>();
            ls.add(root.val);
            ans.add(ls);
        }
        helper(root.left,ans,height+1);
        helper(root.right,ans,height+1);
    }
}