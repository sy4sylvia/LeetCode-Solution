//1106
//110 Balanced Binary Tree
//DFS

public class BalancedBT {

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (leftHeight == -1 || rightHeight == -1) return -1;
        //no left/right subtree
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(rightHeight, leftHeight) + 1;
    }
//
//    int minHeight = Integer.MAX_VALUE, maxHeight = Integer.MIN_VALUE;
//
//    public boolean isBalanced(TreeNode root) {
//        if (root == null) return true;
//        helper(root, 0);
//        return maxHeight - minHeight <= 1;
//    }
//    private void helper(TreeNode root, int level) {
//        if (root.left != null) {
//            helper(root.left, level + 1);
//        }
//
//        if (root.right != null) {
//            helper(root.right, level + 1);
//        }
//
//        if (root.right == null && root.left == null) {
//            if (minHeight > level) minHeight = level;
//            if (maxHeight < level) maxHeight = level;
//        }
//    }
}
