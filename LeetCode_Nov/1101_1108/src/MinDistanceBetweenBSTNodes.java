//1114
//783 Minimum Distance Between BST Nodes


public class MinDistanceBetweenBSTNodes {

    int minDiff = Integer.MAX_VALUE;
    TreeNode pre;

    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);
        return minDiff;
    }

    //BST: inorder
    private void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        if (root.left != null) inOrderTraversal(root.left);
        if (pre != null) minDiff = Math.min(minDiff, Math.abs(pre.val - root.val));
        pre = root;
        if (root.right != null) inOrderTraversal(root.right);
    }

}
