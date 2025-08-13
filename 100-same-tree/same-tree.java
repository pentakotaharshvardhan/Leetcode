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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> t1=new ArrayList<>();
        List<Integer> t2=new ArrayList<>();
        inorder(p,t1);
        inorder(q,t2);
        //System.out.println(t1);
        //System.out.println(t2);
        if(t1.size()!=t2.size()) return false;
        for(int i=0;i<t1.size();i++){
            //System.out.println(Integer.compare(t1.get(i), t2.get(i)));
            if(Integer.compare(t1.get(i), t2.get(i)) != 0) return false;
        }
        return true;
    }
    public void inorder(TreeNode root,List<Integer> ls){
        if(root==null){
            ls.add(-99999);
            return ;
        }
        inorder(root.left,ls);
        inorder(root.right,ls);
        ls.add(root.val);
    }
}