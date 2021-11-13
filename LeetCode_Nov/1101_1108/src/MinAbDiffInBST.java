//1112
//530  Minimum Absolute Difference in BST


public class MinAbDiffInBST {

    //DFS

    int minDiff = Integer.MAX_VALUE;
    TreeNode pre;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0; //return minDiff anyway
        traverse(root);
        return minDiff;
    }

    private void traverse(TreeNode root) {
        //since it's a BST, in-order
        if (root == null) return;

        if (root.left != null) {
            traverse(root.left);
        }
//        traverse(root.left);
        if (pre != null) {
            minDiff = Math.min(minDiff, Math.abs(root.val - pre.val));
        }
        pre = root;

        if (root.right != null) {
            traverse(root.right);
        }
    }
}
