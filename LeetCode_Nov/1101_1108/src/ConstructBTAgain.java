//1108
//105 Construct Binary Tree from Preorder and Inorder Traversal


public class ConstructBTAgain {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helperDivide(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode helperDivide(int[] preorder, int leftPre, int rightPre, int[] inorder, int leftIn, int rightIn) {
        if (rightIn < leftIn) return null;
        int rootVal = preorder[leftPre];
        TreeNode root = new TreeNode(preorder[leftPre]);
        int rootIndex = leftIn;
        for (int i = leftIn; i <= rightIn; i++) {
            if (inorder[i] == preorder[leftPre]) {
                rootIndex = i;
                break;
            }
        }
        root.left = helperDivide(preorder, leftPre + 1, leftPre + (rootIndex - leftIn), inorder, leftIn, rootIndex - 1);
        root.right = helperDivide(preorder, leftPre + (rootIndex - leftIn) + 1, rightPre, inorder, rootIndex + 1, rightIn);
        return root;
    }
}
