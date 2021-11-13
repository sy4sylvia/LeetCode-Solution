//1107
//572 Subtree of Another Tree

public class SubTreeOfAnother {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSame (TreeNode r, TreeNode sub) {
        if (r == null && sub == null) return true;
        if (sub == null || r == null) return false;
        if (r.val != sub.val) return false;
        boolean sameLeft = isSame(r.left, sub.left);
        boolean sameRight = isSame(r.right, sub.right);
        return sameLeft && sameRight;
    }

}
