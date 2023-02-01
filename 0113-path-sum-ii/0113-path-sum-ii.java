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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        this.inOrder(root, targetSum, path, result);
        return result;
    }
    
    private void inOrder(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> result) {
        if(root != null) {
            path.add(root.val);
            if(targetSum == root.val && root.left == null && root.right == null) {
                result.add(new ArrayList(path));
            } else {
                this.inOrder(root.left, targetSum - root.val, path, result);
                this.inOrder(root.right, targetSum - root.val, path, result);
            }
            path.remove(path.size() - 1);
        }
    }
}