//1115
//701 Insert Into a Binary Tree

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insertion(root,val);
    }
    private TreeNode insertion(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insertion(root.left, val);
        if (val > root.val) root.right = insertion(root.right, val);
        return root;
    }
}
