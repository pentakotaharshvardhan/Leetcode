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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        HashMap<Integer,List<TreeNode>> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        int k=1;
        hm.put(k,new ArrayList<TreeNode>(List.of(root)));
        while(!q.isEmpty()){
            k++;
            int n=q.size();
            List<TreeNode> ls=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                    ls.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    ls.add(temp.right);
                }
            }
            if(ls.size()!=0) hm.put(k,ls);
        }
        //System.out.println(hm);
        List<TreeNode> ls=hm.get(k-1);
        TreeNode f=ls.get(0);
        TreeNode l=ls.get(ls.size()-1);
        if(f.val==l.val) return f;
        //System.out.println(f.val+" "+l.val);
        List<TreeNode> t1=new ArrayList<>();
        List<TreeNode> t2=new ArrayList<>();
        boolean istrue=findPath(root,t1,f.val);
        istrue=findPath(root,t2,l.val);
        for(int i=0;i<t1.size();i++){
            hs.add(t1.get(i).val);
        }
        for(int i=t2.size()-1;i>=0;i--){
            if(hs.contains(t2.get(i).val)) return t2.get(i);
        }
        return root;
    }
    static boolean findPath(TreeNode root, List<TreeNode> path, int n) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.val == n ||
            findPath(root.left, path, n) ||
            findPath(root.right, path, n)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
}