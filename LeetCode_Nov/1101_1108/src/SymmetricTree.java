//1102
//101 Symmetric Tree

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        else return helperCompare(root.left, root.right);
    }

    private boolean helperCompare(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left != null && right == null) return false;
        else if (left == null && right != null) return false;
        else if (left.val != right.val) return false;

        //recursion: next level
        boolean outSubtree = helperCompare(left.left, right.right);
        boolean inSubtree = helperCompare(left.right, right.left);
        return outSubtree && inSubtree;
    }
}
