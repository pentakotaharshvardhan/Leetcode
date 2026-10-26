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
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int n=0;
        Queue<Node> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
                Node temp=que.poll();
                List<Node> child=temp.children;
                for(int j=0;j<child.size();j++){
                    que.add(child.get(j));
                }
            }
            n++;
        }
        return n;
    }
}