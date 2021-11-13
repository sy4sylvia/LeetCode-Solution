//1109
//617 Merge Two Binary Trees

public class Merge2BT {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode mergedRoot = new TreeNode(root1.val + root2.val);
        mergedRoot.left = mergeTrees(root1.left, root2.left);
        mergedRoot.right = mergeTrees(root1.right, root2.right);
        return mergedRoot;

    }
}
