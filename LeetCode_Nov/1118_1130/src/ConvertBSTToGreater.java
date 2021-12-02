//1121
//538 Convert BST to Greater Tree

public class ConvertBSTToGreater {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        return inOrder(root);
    }
    private TreeNode inOrder(TreeNode root) {
        if (root == null) return null;
        if (root.right != null) root.right = inOrder(root.right);
        sum += root.val;
        root.val = sum;
        if (root.left != null) root.left = inOrder(root.left);
        return root;
    }
}
