//100 Same Tree
//1106

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return helperCompare(p, q);
    }

    private boolean helperCompare(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p == null && q != null) || (p != null && q == null)) return false;
        if (p.val != q.val) return false;
        boolean compareLeft = helperCompare(p.left, q.left);
        boolean compareRight = helperCompare(p.right, q.right);
        return compareLeft && compareRight;
    }
}
