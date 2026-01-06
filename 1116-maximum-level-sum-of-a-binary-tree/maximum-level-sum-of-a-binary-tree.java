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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int ans=0;
        int sum=Integer.MIN_VALUE;
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int n=q.size();
            int temp=0;
            for(int i=0;i<n;i++){
                TreeNode t1=q.poll();
                temp+=t1.val;
                if(t1.left!=null) q.add(t1.left);
                if(t1.right!=null) q.add(t1.right);
            }
            if(sum<temp){
                ans=level;
                sum=temp;
            } 
            level++;
        }
        return ans;
    }
}