/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node t1=que.poll();
                temp.add(t1.val);
                List<Node> ls=t1.children;
                for(int j=0;j<ls.size();j++){
                    que.add(ls.get(j));
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}