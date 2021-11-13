//1025
//226 Invert Binary Tree

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null; //base case to stop the recursion
        TreeNode right= invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
