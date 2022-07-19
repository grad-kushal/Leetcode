import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> ppath = dfs(root, p.val);
        ArrayList<TreeNode> qpath = dfs(root, q.val);
        //System.out.println(ppath);
        TreeNode lca = null;
        int i = 0;
        while(ppath.get(i) == qpath.get(i)) {
            lca = ppath.get(i);
            i++;
            if (i >= ppath.size() || i >= qpath.size()) {
                break;
            }
        }
        return lca;
    }

    public ArrayList<TreeNode> dfs(TreeNode current, int targetVal) {
        String answer = "";
        ArrayList<TreeNode> list = new ArrayList<>();
        if (current != null) {
            ArrayList<TreeNode> left = dfs(current.left, targetVal);
            ArrayList<TreeNode> right = dfs(current.right, targetVal);
            if (!left.isEmpty()) {
                //answer = current.val + left;
                list.add(current);
                list.addAll(left);
            } else if (!right.isEmpty()) {
                //answer = current.val + right;
                list.add(current);
                list.addAll(right);
            } else if (current.val == targetVal) {
                answer += targetVal;
                list.add(current);
            }
        }
        return list;
    }
}