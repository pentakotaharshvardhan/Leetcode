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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList() ;
        List<Long> ls=new ArrayList<>();
        long ans=0;
        q.add(root);
        ls.add((long)1);
        int k=0;
        //System.out.println(q.peek().val);
        while(!q.isEmpty()){
            //System.out.println("*");
            int size=q.size();
            long first=0;
            long end=0;
            boolean istrue=true;
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                long ixd=ls.get(k++);
                if(temp.left!=null) {
                    q.add(temp.left);
                    ls.add(2*ixd);
                    if(istrue) {
                        first=2*ixd;
                        istrue=false;
                    }
                    end=2*ixd;
                }
                if(temp.right!=null) {
                    q.add(temp.right);
                    ls.add(2*ixd+1);
                    if(istrue) {
                        first=2*ixd+1;
                        istrue=false;
                    }
                    end=2*ixd+1;
                }
                //System.out.println(first+" "+end);
                if(ans<Math.abs(first-end)) ans=Math.abs(first-end);
            }
            //System.out.println(ls);
        }
        return (int)(ans+1);
    }
}