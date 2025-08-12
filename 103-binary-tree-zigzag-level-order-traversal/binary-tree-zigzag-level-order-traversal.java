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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(root,ans,0,false);
        return ans;
    }
    public void helper(TreeNode root,List<List<Integer>> ans,int height,boolean istrue){
        if(root==null){
            return ;
        }
        if(height<ans.size()){
            List<Integer> ls=ans.get(height);
            if(istrue){
                ls.add(0,root.val);
            }
            else ls.add(root.val);
            ans.set(height,ls);
        }
        else{
            List<Integer> ls=new ArrayList<>();
            ls.add(root.val);
            ans.add(ls);
        }
        if(istrue){
            helper(root.left,ans,height+1,false);
            helper(root.right,ans,height+1,false);
        }
        else{
            helper(root.left,ans,height+1,true);
            helper(root.right,ans,height+1,true);
        }
    }
}