/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        buildParent(root, null, parent);
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> seen = new HashSet<>();
        q.add(target);
        seen.add(target);
        int dist = 0;
        while (!q.isEmpty()) {
            int sz = q.size();
            if (dist == k) {
                List<Integer> ans = new ArrayList<>();
                for (TreeNode node : q) ans.add(node.val);
                return ans;
            }
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                if (cur.left != null && seen.add(cur.left)) q.add(cur.left);
                if (cur.right != null && seen.add(cur.right)) q.add(cur.right);
                TreeNode p = parent.get(cur);
                if (p != null && seen.add(p)) q.add(p);
            }
            dist++;
        }
        return new ArrayList(){};
    }

    private void buildParent(TreeNode node, TreeNode par, Map<TreeNode, TreeNode> parent) {
        if (node == null) return;
        if (par != null) parent.put(node, par);
        buildParent(node.left, node, parent);
        buildParent(node.right, node, parent);
    }
}
