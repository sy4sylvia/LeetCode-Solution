//1110
//98 Validate Binary Search Tree

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return helperValidate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helperValidate(TreeNode root, long leftVal, long rightVal) {
        if (root == null) return true;
        if (leftVal >= root.val || rightVal <= root.val) {
            return false;
        }
        return helperValidate(root.left, leftVal, root.val) && helperValidate(root.right, root.val, rightVal);
    }
}
