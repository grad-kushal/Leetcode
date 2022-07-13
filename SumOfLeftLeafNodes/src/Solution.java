public class Solution {
    public static void main(String [] args) {
        System.out.println(sumOfLeftLeaves(new TreeNode()));
    }
    public static int sumOfLeftLeaves(TreeNode root) {
        int answer = getSum(root, null);
        return answer;
    }
    public static int getSum(TreeNode node, TreeNode parent) {
        int sum = 0;
        if(node == null)
            return 0;
        if(node.left == null && node.right == null && parent == null)
            return 0;
        if(node.left == null && node.right == null && parent.left == node)
            sum += node.val;
        else {
            sum += getSum(node.left, node);
            sum += getSum(node.right, node);
        }
        return sum;
    }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}